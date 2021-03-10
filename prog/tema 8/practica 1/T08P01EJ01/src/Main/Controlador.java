/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import ModeloBD.BaseDatos;
import ModeloBD.TPersona;
import ModeloUML.Persona;
import Vistas.Accion;
import Vistas.Inicio;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author unai diez
 */
public class Controlador {
    
    private static int opcion;
    private static BaseDatos bd;
    private static TPersona tp;
    
    private static Inicio vp;
    private static Accion vper;
    
    private static Persona p;
    public static void main(String[] args) {
        try{
        bd = new BaseDatos();
        bd.conectar();

        tp=new TPersona(bd.getCon());
        
        vp = new Inicio();
        vp.setVisible(true);        
        }
    
        catch(Exception e)
        {
        bd.desconectar();
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

    public static ArrayList<Persona> obtenerpersona() throws Exception {
        ArrayList<Persona> consulta= tp.Consultageneral();
        return consulta;
    }

    public static Persona obtenerconsulta(String a,int o) {
     
        Persona consulta;
        try {
            consulta = tp.Consultaruno(a,o);
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
            tp.insertar(nuevo);
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Nueva persona NO insertada");
            return false;
        }
    }
    

    
        }
