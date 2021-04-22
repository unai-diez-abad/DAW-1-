/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import bdperss.EmpresaJpaController;
import bdperss.EventoJpaController;
import bdperss.PersonaJpaController;
import bdperss.exceptions.NonexistentEntityException;
import PersistenciaUML.Empresa;
import PersistenciaUML.Evento;
import PersistenciaUML.Persona;
import Vistas.Inicio;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Persistence;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

/**
 *private static  PersonaJpaController per; 
 * @author unai diez
 */
public class Controlador {

    private static int opcion;
    
    private static EventoJpaController te;
    private static PersonaJpaController tp;
    private static EmpresaJpaController tm;
    
    private static Inicio vp;
    
    public static void main(String[] args) {
    try{

        te=new EventoJpaController ( Persistence . createEntityManagerFactory ("T08P03EJ02PU"));
        tp=new PersonaJpaController ( Persistence . createEntityManagerFactory ("T08P03EJ02PU"));
        tm=new EmpresaJpaController ( Persistence . createEntityManagerFactory ("T08P03EJ02PU"));
        
        vp = new Inicio();
        vp.setVisible(true);        
        }
    
        catch(Exception e)
        {
        System.out.println(e.getMessage());
        }
    }

    public static void insertarevento(String a, String b, LocalDate c, LocalTime d, LocalTime e,int f) throws Exception{
        Date g =conversionDate(c);
        Date h = conversionTime(d);
        Date i = conversionTime(e);
        Evento e1 =new Evento(a,b,g,h,i,f);
        te.create(e1);
    }

   public static void cancelararevento(String a) throws NonexistentEntityException {
       te.destroy(a);
    }
    public static Evento buscarevento(String a) {
       Evento buscador=te.findEvento(a);
        return buscador;
    }

    public static void modificarevento(String a, String b, LocalDate c, LocalTime d, LocalTime e,int f) throws Exception {
       Date g=conversionDate(c);
        Date h = conversionTime(d);
        Date i = conversionTime(e);
        Evento e1 =new Evento(a,b,g,h,i,f);
        te.edit(e1);
    }




    public static void insertarpersona(String a, String b, String c, String d,  String e) throws Exception  {
        Empresa e1 =new Empresa(d);
        Persona p1=new Persona (b,a,c);
        p1.setEmpresaNif(e1);
        if(tm.findEmpresa(d)==null)
        tm.create(e1);
        tp.create(p1);
        
    }

    public static void listarevento(javax.swing.JComboBox lista) {
       List<Evento> listado= te.findEventoEntities();
       lista.removeAllItems();
        for(int x = 0; x < listado.size(); x++)
            {
                lista.insertItemAt(listado.get(x).getNombre(), x);
            }
    }

    public static void listarevento2(JComboBox<String> lista) {
       List<Evento> listado=new ArrayList();
       listado=te.findEventoEntities();
       lista.removeAllItems();
        for(int x = 0; x < listado.size(); x++)
            {
                lista.insertItemAt(listado.get(x).getNombre(), x);
            }
    }
    
    
public static void listarasistente(JTextArea txtLista,String a) {
       List<Persona> listado=new ArrayList();
       String Lista="";
       listado=tp.findPersonaEntities();
        for(int x = 0; x < listado.size(); x++)
            {
              Lista+= listado.get(x).getNombre() + "  " + listado.get(x).getDni() +" \n" ;
            }
       txtLista.setText(Lista);
    }

    public static boolean buscarempresa(String a) {
      if (tm.findByNombre(a)!=null)
      return true;
      else
      return false;
    }
public static Date conversionDate(LocalDate fecha)
    {
        // Conversion LocalDate en java.sql.Date
        return java.sql.Date.valueOf(fecha);
        
    }
    private static Time conversionTime(LocalTime hora) {
         return java.sql.Time.valueOf(hora); }

    public static void insertarevento(Evento evento) throws Exception {
        te.create(evento);
    }

    

    public static String buscardatoempresa(String text, int parte) {
      String dato="";
        switch(parte){
        case 1:
       dato=tm.findByNombre(text).getNif();
               break;
        case 2:
       dato=Integer.toString(tm.findByNombre(text).getCnae());
               break;
               case 3:
       dato=tm.findByNombre(text).getRazonSocial();
               break;
      }
         return dato ;
    }

    public static boolean buscarpersona(String text) {
       if (tp.findPersona(text)!=null)
           return true;
       else
           return false;
               }


    public static String buscardatopersona(String text, int parte) {
     String dato="";
        switch(parte){
        case 1:
       dato=tp.findPersona(text).getDni();
               break;
        case 2:
       dato=tp.findPersona(text).getTelefono();
               break;
              
      }
         return dato ; 
    }

    public static void insertarempresa(String a, String b, String c, String d) throws Exception {
          Empresa e1 =new Empresa(b,a,d,Integer.parseInt(c));
        tm.create(e1);
       
    }

   
   
    
}
