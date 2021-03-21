/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import ModeloBD.BaseDatos;
import ModeloBD.TEmpresa;
import ModeloBD.TEvento;
import ModeloBD.TPersona;
import ModeloUML.Empresa;
import ModeloUML.Evento;
import ModeloUML.Persona;
import Vistas.Inicio;
import java.awt.event.ItemListener;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

/**
 *
 * @author unai diez
 */
public class Controlador {

    private static int opcion;
    private static BaseDatos bd;
    private static TEvento te;
    private static TPersona tp;
    private static TEmpresa tm;
    
    private static Inicio vp;
    
    public static void main(String[] args) {
    try{
        bd = new BaseDatos();
        bd.conectar();

        te=new TEvento(bd.getCon());
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

    public static void insertarevento(String a, String b, LocalDate c, LocalTime d, LocalTime e,int f) {
        Evento e1 =new Evento(a,b,c,d,e,f);
        te.anadirevento(e1);
    }

    public static void cancelararevento(String a) {
       te.borrarevento(a);
    }
    public static Evento buscarevento(String a) {
       
        return te.buscarevento(a);
    }

    public static void modificarevento(String a, String b, LocalDate c, LocalTime d, LocalTime e,int f) {
        Evento e1 =new Evento(a,b,c,d,e,f);
        te.modificaevento(e1);
    }


    public static void insertarpersona(String a, String b, String c, String d, String e)  {
        Empresa e1 =new Empresa(e);
        Persona p1=new Persona (a,b,c,d,e1);
        tp.insertar(p1);
        
    }

    public static void listarevento(javax.swing.JComboBox lista) {
       ArrayList<String> listado=new ArrayList();
       listado=te.listarempresa();
       lista.removeAllItems();
        for(int x = 0; x < listado.size(); x++)
            {
                lista.insertItemAt(listado.get(x), x);
            }
    }

    public static void listarevento2(JComboBox<String> lista) {
       ArrayList<String> listado=new ArrayList();
       listado=te.listarempresa2();
       lista.removeAllItems();
        for(int x = 0; x < listado.size(); x++)
            {
                lista.insertItemAt(listado.get(x), x);
            }
    }
    
    
public static void listarasistente(JTextArea txtLista,String a) {
       ArrayList<Persona> listado=new ArrayList();
       String Lista="";
       listado=tp.Consultageneral(a);
        for(int x = 0; x < listado.size(); x++)
            {
              Lista+= listado.get(x).getNombre() + "  " + listado.get(x).getDNI() +" \n" ;
            }
       txtLista.setText(Lista);
    }

    public static boolean buscarempresa(String a) {
      if (tm.buscarempresa(a))
      return true;
      else
      return false;
    }

   
   
    
}
