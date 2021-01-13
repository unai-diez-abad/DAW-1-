/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author usuario
 */
public class Profesor extends Persona{

    public Profesor() {
    }

    public Profesor(String nombre, String direccion, String telefono) {
        //this.nombre = nombre;
        //this.setNombre(nombre);
        super(nombre, direccion, telefono);
    }
   @Override
     public void setNombre(String nombre)
     {
        // código propio
     }
  
    
}
