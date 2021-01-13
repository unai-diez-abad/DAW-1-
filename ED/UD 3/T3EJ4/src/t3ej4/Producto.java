/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3ej4;

/**
 *
 * @author unai diez
 */
public class Producto {
    String nombre;
    Double Precio;

    public Producto(String nombre, Double Precio) {
        this.nombre = nombre;
        this.Precio = Precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double Precio) {
        this.Precio = Precio;
    }

   
    public String toString(int cuantia) {
        return  "nombre=" + nombre + ", Precio=" + Precio + '='+ this.calcular(cuantia);
    }
   public Double calcular(int cuantia){
   return null;
   };
    
}
