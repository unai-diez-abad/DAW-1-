/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6p01ej03;

import Class.Persona;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author unai diez
 */
public class T6P01EJ03 {

    /**
     * @param args the command line arguments
     */
    public static DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static LocalDate reloj=LocalDate.now();
    public static ArrayList <Persona> datos;
    public static void main(String[] args) {
        // TODO code application logic here
         datos=new ArrayList();
         
         buscardatos();
         resultados();
         
    }
        public static void buscardatos(){
           datos.add(new Persona(fnombre(),fdia(),fmes(),fanio(),fdireccion(),fpostal(),fciudad()));
        }
        public static void resultados(){
            int mayoredad=0,posicionpersonamayoredad=0;
            String nombre="";
            String nombresmay="";
            for (int x=0;x<datos.size();x++){
                int edad=datos.get(x).calcularedad();
                if(edad>mayoredad){
                    posicionpersonamayoredad=x;
                    mayoredad=x;
                }
                if(datos.get(x).isCiudad("Elche")){
                    nombre+="\n"+datos.get(x).getCiudad();
                }
                 if(datos.get(x).ismayorEdad()){
                    nombresmay+="\n"+datos.get(x).getNombre();
                }              
            }
             
            
        } 
            public static String fnombre(){
         String peticion="";
         Boolean correcto=false;
         do{
             try{
                peticion=JOptionPane.showInputDialog("inserte el nombre");
                correcto=true; 
             }
             catch(NullPointerException e){

             }
         }while(correcto);
         return peticion;
        } 
            public static int fdia(){
         int peticion=0;
         Boolean correcto=false;
         do{
             try{
                peticion=Integer.parseInt(JOptionPane.showInputDialog("inserte el dia de nacimiento"));
                if(peticion>0 && peticion<31)
                correcto=true; 
                else 
                JOptionPane.showMessageDialog(null, "no se ha puesto el numero correctamente como dia");
             }
             catch(NullPointerException e){
               JOptionPane.showMessageDialog(null, "no se ha puesto nada");

             }
             catch(NumberFormatException e){
                 JOptionPane.showMessageDialog(null, "no se ha puesto de forma numerica");
            }
         }while(correcto);
         return peticion;
        }   
            public static int fmes(){
         int peticion=0;
         Boolean correcto=false;
         do{
             try{
                peticion=Integer.parseInt(JOptionPane.showInputDialog("inserte el mes de nacimiento"));
                if(peticion>0 && peticion<13)
                correcto=true; 
                else 
                JOptionPane.showMessageDialog(null, "no se ha puesto el numero correctamente como mes");
             }
             catch(NullPointerException e){
               JOptionPane.showMessageDialog(null, "no se ha puesto nada");

             }
             catch(NumberFormatException e){
                 JOptionPane.showMessageDialog(null, "no se ha puesto de forma numerica");
            }
         }while(correcto);
         return peticion;
        } 
            public static int fanio(){
         int peticion=0;
         Boolean correcto=false;
         do{
             try{
                peticion=Integer.parseInt(JOptionPane.showInputDialog("inserte el año de nacimiento"));
                if(peticion>1900 && peticion<=reloj.getYear())
                correcto=true; 
                else 
                JOptionPane.showMessageDialog(null, "no se ha puesto el numero correctamente como año");
             }
             catch(NullPointerException e){
               JOptionPane.showMessageDialog(null, "no se ha puesto nada");

             }
             catch(NumberFormatException e){
                 JOptionPane.showMessageDialog(null, "no se ha puesto de forma numerica");
            }
         }while(correcto);
         return peticion;
        } 
            public static String fdireccion(){
            String peticion="";
            Boolean correcto=false;
            do{
                try{
                   peticion=JOptionPane.showInputDialog("inserte la direccion");
                   correcto=true; 
                }
                catch(NullPointerException e){
                   JOptionPane.showMessageDialog(null, "no se ha puesto nada");
                }
            }while(correcto);
            return peticion;
        } 
            public static String fpostal(){
              String peticion="";
              Boolean correcto=false;
              do{
                  try{
                     peticion=JOptionPane.showInputDialog("inserte la direccion");
                     if(peticion.length()==5)
                     correcto=true; 
                     else
                    JOptionPane.showMessageDialog(null, "no se ha puesto correctamente el codigo postal");
     
                  }
                  catch(NullPointerException e){
                     JOptionPane.showMessageDialog(null, "no se ha puesto nada");
                  }
              }while(correcto);
              return peticion;
        }  
            public static String fciudad(){
            String peticion="";
            Boolean correcto=false;
            do{
                try{
                   peticion=JOptionPane.showInputDialog("inserte La ciudad");
                   correcto=true; 
                }
                catch(NullPointerException e){

                }
            }while(correcto);
            return peticion;
        } 
}
