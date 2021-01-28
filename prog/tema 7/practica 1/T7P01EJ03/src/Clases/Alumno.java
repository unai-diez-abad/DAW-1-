/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author unai diez
 */
public class Alumno {
    private String nombre;
    private String apellidos;
    private String dni;
    private Curso o;

    public Alumno(String nombre, String apellidos, String dni, Curso o) {

        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.setC(o);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    private void setC(Curso o) {
        
    }
    
    
}
