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
public class Alumno extends Persona{
    private String notas;

    public Alumno(String notas) {
        this.notas = notas;
    }

    public Alumno(String notas, String nombre, String direccion, String telefono) {
        super(nombre, direccion, telefono);
        this.notas = notas;
    }
    
    public Alumno(){
        
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }
    
    
}
