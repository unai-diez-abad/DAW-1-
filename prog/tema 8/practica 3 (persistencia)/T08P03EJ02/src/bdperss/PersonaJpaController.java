/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdperss;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import PersistenciaUML.Empresa;
import PersistenciaUML.Evento;
import PersistenciaUML.Persona;
import bdperss.exceptions.NonexistentEntityException;
import bdperss.exceptions.PreexistingEntityException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author unai diez
 */
public class PersonaJpaController implements Serializable {

    public PersonaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Persona persona) throws PreexistingEntityException, Exception {
        if (persona.getEventoList() == null) {
            persona.setEventoList(new ArrayList<Evento>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Empresa empresaNif = persona.getEmpresaNif();
            if (empresaNif != null) {
                empresaNif = em.getReference(empresaNif.getClass(), empresaNif.getNif());
                persona.setEmpresaNif(empresaNif);
            }
            List<Evento> attachedEventoList = new ArrayList<Evento>();
            for (Evento eventoListEventoToAttach : persona.getEventoList()) {
                eventoListEventoToAttach = em.getReference(eventoListEventoToAttach.getClass(), eventoListEventoToAttach.getNombre());
                attachedEventoList.add(eventoListEventoToAttach);
            }
            persona.setEventoList(attachedEventoList);
            em.persist(persona);
            if (empresaNif != null) {
                empresaNif.getPersonaList().add(persona);
                empresaNif = em.merge(empresaNif);
            }
            for (Evento eventoListEvento : persona.getEventoList()) {
                eventoListEvento.getPersonaList().add(persona);
                eventoListEvento = em.merge(eventoListEvento);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findPersona(persona.getDni()) != null) {
                throw new PreexistingEntityException("Persona " + persona + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Persona persona) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Persona persistentPersona = em.find(Persona.class, persona.getDni());
            Empresa empresaNifOld = persistentPersona.getEmpresaNif();
            Empresa empresaNifNew = persona.getEmpresaNif();
            List<Evento> eventoListOld = persistentPersona.getEventoList();
            List<Evento> eventoListNew = persona.getEventoList();
            if (empresaNifNew != null) {
                empresaNifNew = em.getReference(empresaNifNew.getClass(), empresaNifNew.getNif());
                persona.setEmpresaNif(empresaNifNew);
            }
            List<Evento> attachedEventoListNew = new ArrayList<Evento>();
            for (Evento eventoListNewEventoToAttach : eventoListNew) {
                eventoListNewEventoToAttach = em.getReference(eventoListNewEventoToAttach.getClass(), eventoListNewEventoToAttach.getNombre());
                attachedEventoListNew.add(eventoListNewEventoToAttach);
            }
            eventoListNew = attachedEventoListNew;
            persona.setEventoList(eventoListNew);
            persona = em.merge(persona);
            if (empresaNifOld != null && !empresaNifOld.equals(empresaNifNew)) {
                empresaNifOld.getPersonaList().remove(persona);
                empresaNifOld = em.merge(empresaNifOld);
            }
            if (empresaNifNew != null && !empresaNifNew.equals(empresaNifOld)) {
                empresaNifNew.getPersonaList().add(persona);
                empresaNifNew = em.merge(empresaNifNew);
            }
            for (Evento eventoListOldEvento : eventoListOld) {
                if (!eventoListNew.contains(eventoListOldEvento)) {
                    eventoListOldEvento.getPersonaList().remove(persona);
                    eventoListOldEvento = em.merge(eventoListOldEvento);
                }
            }
            for (Evento eventoListNewEvento : eventoListNew) {
                if (!eventoListOld.contains(eventoListNewEvento)) {
                    eventoListNewEvento.getPersonaList().add(persona);
                    eventoListNewEvento = em.merge(eventoListNewEvento);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = persona.getDni();
                if (findPersona(id) == null) {
                    throw new NonexistentEntityException("The persona with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Persona persona;
            try {
                persona = em.getReference(Persona.class, id);
                persona.getDni();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The persona with id " + id + " no longer exists.", enfe);
            }
            Empresa empresaNif = persona.getEmpresaNif();
            if (empresaNif != null) {
                empresaNif.getPersonaList().remove(persona);
                empresaNif = em.merge(empresaNif);
            }
            List<Evento> eventoList = persona.getEventoList();
            for (Evento eventoListEvento : eventoList) {
                eventoListEvento.getPersonaList().remove(persona);
                eventoListEvento = em.merge(eventoListEvento);
            }
            em.remove(persona);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Persona> findPersonaEntities() {
        return findPersonaEntities(true, -1, -1);
    }

    public List<Persona> findPersonaEntities(int maxResults, int firstResult) {
        return findPersonaEntities(false, maxResults, firstResult);
    }

    private List<Persona> findPersonaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Persona.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Persona findPersona(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Persona.class, id);
        } finally {
            em.close();
        }
    }

    public int getPersonaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Persona> rt = cq.from(Persona.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
