/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Persona {
    private String nombre;
    private String direccion;
    private String telefono;
    private ArrayList<Coche> listaCoches;

    public ArrayList<Coche> getListaCoches() {
        return listaCoches;
    }
    public Coche getListaCoches(int x)
    {
        return this.listaCoches.get(x);
    }

    public void setListaCoches(ArrayList<Coche> listaCoches) {
        this.listaCoches = listaCoches;
    }
    
    public void setListaCoches(Coche c)
    {
        this.listaCoches.add(c);
    }
    public Persona() {
        super();
    }

    public Persona(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.listaCoches= new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public void comprar()
    {
        // algo con los atributos de persona.
    }
    
        
    
    
}
