/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t7p01ej02;
import Clases.Persona;
import Vista.*;
import java.util.ArrayList;
/**
 *
 * @author unai diez
 */
public class T7P01EJ02 {

    private static ArrayList<Persona> lista ;
    private static Altapersonas v1;
    private static Listado v2;
    public static void main(String[] args) {
       lista=new ArrayList() ;
       v1 = new Altapersonas();
       v1.setVisible(true);
    }

    public static void tenDatos(String a, String b, String c) {
       lista.add(new Persona(a,b,c));
    }

    
    public static void salir(javax.swing.JFrame v) {
       if(v==v1){
       v1.setVisible(false); 
       v2 = new Listado();
       v2.add(lista);
       v2.setVisible(true);}
       else
       System.exit(0);
    }

    private static void obtenerdatos() {
        
         }
    
}
