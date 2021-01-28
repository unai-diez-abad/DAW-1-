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
public class Producto {
    private String nombre;
    private Double preciouni;
    private int unidades;

    public Producto(String nombre, Double preciouni, int unidades) {
        this.nombre = nombre;
        this.preciouni = preciouni;
        this.unidades = unidades;
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
    
    public void Compraproducto() {
    
    }
    public void Ventaproducto() {
    
    }
}
