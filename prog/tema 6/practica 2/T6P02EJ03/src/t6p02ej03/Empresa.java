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
public class Empresa {
   private String nombre;
   
   private ArrayList<Empleado> listaEmpleados;
   private ArrayList<Cliente> listaClientes;

    public Empresa(String nombre, ArrayList<Empleado> listaEmpleados, ArrayList<Cliente> listaClientes) {
        this.nombre = nombre;
        this.listaEmpleados = listaEmpleados;
        this.listaClientes = listaClientes;
    }


    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
   
}
