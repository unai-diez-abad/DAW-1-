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
public class Noperecedero extends Producto{
    private String tipo;

    public Noperecedero(String tipo, String nombre, Double Precio) {
        super(nombre, Precio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
@Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
@Override
    public Double getPrecio() {
        return Precio;
    }
@Override
    public void setPrecio(Double Precio) {
        this.Precio = Precio;
    }
 @Override   
       public Double calcular(int cuantia){
       Double total= this.Precio*cuantia;
       return total;
   } 
    @Override
      public String toString(int cuantia) {
      return  "nombre=" + nombre + ", Precio=" + Precio + '='+ this.calcular(cuantia);
    }
}
