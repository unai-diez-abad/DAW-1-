/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6p02ej03;

import java.util.ArrayList;

/**
 *
 * @author unai diez
 */
public class Directivo extends Empleado{
    private String categoria;
    private  ArrayList<Empleado> listaEmpleados;

    public Directivo(String categoria, ArrayList<Empleado> listaEmpleados, Double sueldo_bruto, String nombre, int edad) {
        super(sueldo_bruto, nombre, edad);
        this.categoria = categoria;
        this.listaEmpleados = listaEmpleados;
    }

    public Directivo(String categoria, Double sueldo_bruto, String nombre, int edad) {
        super(sueldo_bruto, nombre, edad);
        this.categoria = categoria;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }


    

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String mostrar() {
        return super.mostrar()+ ", categoria=" + categoria + '}';
    }
    
    
}
