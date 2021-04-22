/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloUML;

/**
 *
 * @author unai diez
 */
public class Persona {
    private String nombre;
    private String DNI;
    private String telefono;
    private String listaEmpresa;

    private Empresa empresa;
    public Persona() {
    }

    public Persona(String nombre, String DNI, String telefono, String listaEmpresa, Empresa empresa) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.telefono = telefono;
        this.listaEmpresa = listaEmpresa;
        this.empresa = empresa;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Persona(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getListaEmpresa() {
        return listaEmpresa;
    }

    public void setListaEmpresa(String listaEmpresa) {
        this.listaEmpresa = listaEmpresa;
    }

  
    
}
