/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6p01ej02;

import Clases.Alumno;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author unai diez
 */
public class T6P01EJ02 {

    /**
     * @param args the command line arguments
     */
    public static ArrayList <Alumno> agenda;
    public static void main(String[] args) {
        // TODO code application logic here
        
        int continuar=0;
        agenda=new ArrayList();
        do{
        agenda.add(new Alumno(fcodigo(),fnombre(),fdomicilio(),ftelefono()));
        continuar=JOptionPane.showConfirmDialog(null, "seguir?", "opciones", JOptionPane.YES_NO_OPTION);
        }while(continuar==0);
        
        buscarcodigo();
        
    }
    
    public static String fcodigo(){
      String codigo="";
      boolean correcto=false;
        do{
          try{
              codigo=JOptionPane.showInputDialog("inserte el codigo del alumno");
              correcto=true;
          }
          catch(NullPointerException e)
          {
              JOptionPane.showMessageDialog(null, "no se ha puesto nada ");
          }
       }while(!correcto);
              return codigo;
    }
    public static String fnombre(){
      String nombre="";
      boolean correcto=false;
      do{
          try
          {
              nombre=JOptionPane.showInputDialog("inserte el nombre del alummno");
              correcto=true;
          }
          catch(NullPointerException e)
          {
              JOptionPane.showMessageDialog(null, "no se ha puesto nada ");
          }
          
      }while(!correcto);
              return nombre;
    } 
    public static String fdomicilio(){
      String domicilio="";
            boolean correcto=false;
      do{
          try
          {
              domicilio=JOptionPane.showInputDialog("inserte el domicilio del alummno");
              correcto=true;
          }
          catch(NullPointerException e)
          {
              JOptionPane.showMessageDialog(null, "no se ha puesto nada ");
          }
      }while(!correcto);
              return domicilio;
    } 
    public static int ftelefono(){
      int telefono=0;
            boolean correcto=false;
      do{
          try{
              telefono=Integer.parseInt(JOptionPane.showInputDialog("inserte el telefono del alummno"));
              correcto=true;
          }
           catch(NullPointerException e){
              JOptionPane.showMessageDialog(null, "no se ha puesto nada ");
              
          }
          catch(NumberFormatException e){
              JOptionPane.showMessageDialog(null, "no se ha puesto en numerico ");
              
          }
      }while(!correcto);
              return telefono;
    }  
    public static void buscarcodigo(){
        int continuar=0,x=0;
        do{
        boolean encontrado=false;
        String codigo=JOptionPane.showInputDialog("inserte el codigo del alumno\nal que quieres buscar");
    for( x=0;x<agenda.size() && encontrado==true;x++){}
        if(agenda.get(x).getCodigo().equals(codigo)){
        JOptionPane.showMessageDialog(null, "el alumno "+agenda.get(x).getCodigo()+"tiene los siguientes datos:"
                + "\n"+agenda.get(x).getNombre()
                + "\n"+agenda.get(x).getDomicilio()
                + "\n"+agenda.get(x).getTelefono()); 
          encontrado=true;
    } 
    else
        JOptionPane.showMessageDialog(null, "no existe alumno con ese codigo");
    continuar=JOptionPane.showConfirmDialog(null, "seguir?", "opciones", JOptionPane.YES_NO_OPTION);
        }while(continuar==0);
    }
}
