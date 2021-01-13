/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3ej4;

import javax.swing.JOptionPane;

/**
 *
 * @author unai diez
 */
public class Perecedero extends Producto{
    private int diasacaducar;

    public Perecedero(int diasacaducar, String nombre, Double Precio) {
        super(nombre, Precio);
        this.diasacaducar = diasacaducar;
    }

    public int getDiasacaducar() {
        return diasacaducar;
    }

    public void setDiasacaducar(int diasacaducar) {
        this.diasacaducar = diasacaducar;
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
        
      Double total;
      switch(this.diasacaducar){
        case 3:
           total=(this.Precio*cuantia)/2;
           break;
        case 2:
           total=(this.Precio*cuantia)/3;
           break;
        case 1:
           total=(this.Precio*cuantia)/4;
           break;
        default:
           total= (this.Precio*cuantia);
           break;
      }  
      return total;
   }

    @Override
    public String toString(int cuantia) {
        return  "nombre=" + nombre + ", Precio=" + Precio + '='+ this.calcular(cuantia);
    }
    
}
