/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author unai diez
 */
public class Persona {
    private String nombre;
    private int dnacimiento;
    private int mnacimiento;
    private int anacimiento;
    private String direccion;
    private String codigpostal;
    private String ciudad;

    public Persona(String nombre, int dnacimiento, int mnacimiento, int anacimiento, String direccion, String codigpostal, String ciudad) {
        this.nombre = nombre;
        this.dnacimiento = dnacimiento;
        this.mnacimiento = mnacimiento;
        this.anacimiento = anacimiento;
        this.direccion = direccion;
        this.codigpostal = codigpostal;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDnacimiento() {
        return dnacimiento;
    }

    public void setDnacimiento(int dnacimiento) {
        this.dnacimiento = dnacimiento;
    }

    public int getMnacimiento() {
        return mnacimiento;
    }

    public void setMnacimiento(int mnacimiento) {
        this.mnacimiento = mnacimiento;
    }

    public int getAnacimiento() {
        return anacimiento;
    }

    public void setAnacimiento(int anacimiento) {
        this.anacimiento = anacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigpostal() {
        return codigpostal;
    }

    public void setCodigpostal(String codigpostal) {
        this.codigpostal = codigpostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public int calcularedad(){
        LocalDate fechanac= LocalDate.of(anacimiento,mnacimiento,dnacimiento);
        LocalDate ahora=LocalDate.now();
        
        Period periodo=Period.between(fechanac, ahora);
        return periodo.getYears();
    }
    public Boolean ismayorEdad(){
        return this.calcularedad()>=18;
    }
    public Boolean isCiudad(String ciudad){
        return this.ciudad.equals(ciudad);
    }
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", dnacimiento=" + dnacimiento + ", mnacimiento=" + mnacimiento + ", anacimiento=" + anacimiento + ", direccion=" + direccion + ", codigpostal=" + codigpostal + ", ciudad=" + ciudad + '}';
    }


    
    
}
