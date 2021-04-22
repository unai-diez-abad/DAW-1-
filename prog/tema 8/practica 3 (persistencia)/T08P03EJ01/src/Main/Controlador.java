/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import BDpersistente.PersonaJpaController;
import ModeloBD.BaseDatos;
import ModeloBD.TPersona;
import UMLpersisitente.Persona;
import Vistas.Accion;
import Vistas.Inicio;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

/**
 *
 * @author unai diez
 */
public class Controlador {
    
    private static int opcion;
    
    private static Inicio vp;
    private static Accion vper;
    private static  PersonaJpaController per; 
    private static Persona p;
    public static void main(String[] args) {
        try{ PersonaJpaController
         c = new PersonaJpaController ( Persistence . createEntityManagerFactory (" ejemplodefinitivojpapu "));
          
        }
    
        catch(Exception e)
        {
        System.out.println(e.getMessage());
        }
    }
    
    public static void mostrarVentanaPersonas(int a) throws Exception
    {
        opcion=a;
        if(opcion==4)
            System.exit(0);
        vp.dispose();
        vper = new Accion();
        vper.setVisible(true);
        
}
    public static void mostrarinicio()
    {
        vper.dispose();
        vp = new Inicio();
        vp.setVisible(true);
}

    public static int obteneropcion() {
        return opcion;
    }

    public static List<UMLpersisitente.Persona> obtenerpersona() throws Exception {
        List<UMLpersisitente.Persona> consulta= per.findPersonaEntities();
        return consulta;
    }

    public static Persona obtenerconsulta(String a,int o) {
     
        Persona consulta;
        try {
           consulta= per.findPersona(a);
            return consulta;
        } catch (Exception ex) {
            if(o!=1)
            JOptionPane.showMessageDialog(null, "No existe dicho nombre");
            return null;
        }
     }
    public static boolean insertarpersona (String a,int b, String c, String d){
        try {
            Persona nuevo= new Persona (a,b,c,d);
           per.create(nuevo);
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Nueva persona NO insertada");
            return false;
        }
    }

  
    

    
        }
