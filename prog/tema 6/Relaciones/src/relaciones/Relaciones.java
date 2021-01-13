/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones;

import Clases.*;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Relaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p = new Persona("Nieves","c/ Pozoa","900900900");
        Persona p2 = new Persona();
        p2.setNombre("Pepe");
        //metodoUno(p2);
        
        Profesor pr = new Profesor();
        pr.setNombre("Juan");
        Profesor pr2 = new Profesor("Imanol","c/mmmm","890890890");
        //metodoUno(pr2);
        
        Alumno al = new Alumno();
        al.setNombre("María");
        // metodoUno(al);
         
         
         Coche c= new Coche("11111abc","Opel", "Corsa",p);
         Coche c2= new Coche("11112abc","Opel", "Corsa",p);
         Coche c3= new Coche("11113abc","Opel", "Corsa",p);
         
         p.setListaCoches(c);
         p.setListaCoches(c2);
         p.setListaCoches(c3);
         
        
        
    }
    public static void metodoUno(Persona p)
    {
        JOptionPane.showMessageDialog(null, p.getNombre());
        // if (p instanceof Alumno) 
    }
    
}
