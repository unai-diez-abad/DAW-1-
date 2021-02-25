/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author unai diez
 */
public class Producto {
    private String nombre;
    private Double preciouni;
    private int unidades;
    private ArrayList<Proveedor> proveedor;

    public Producto(String nombre, Double preciouni, int unidades) {
        this.nombre = nombre;
        this.preciouni = preciouni;
        this.unidades = unidades;
        proveedor=new ArrayList();
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPreciouni() {
        return preciouni;
    }

    public void setPreciouni(Double preciouni) {
        this.preciouni = preciouni;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades =unidades;
    }

    public ArrayList<Proveedor> getProveedor() {
        return proveedor;
    }

    public void setProveedor(ArrayList<Proveedor> proveedor) {
        this.proveedor = proveedor;
    }
    
    public void Compraproducto() {
    
    }
    public void Ventaproducto() {
    
    }
}
