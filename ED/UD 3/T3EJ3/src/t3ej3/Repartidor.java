/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3ej3;

/**
 *
 * @author unai diez
 */
public class Repartidor extends Empleado{
    private String zona;

    public Repartidor(String zona, String nombre, int edad, Double salario) {
        super(nombre, edad, salario);
        this.zona = zona;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        return super.toString()+"Repartidor{" + "zona=" + zona + '}';
    }
    
    @Override
     public Boolean plus(){
        Boolean extra=false;
         int plus=300;
        if(super.getEdad()<25 && "zona 3".equals(zona)){
           double nuevosalario= this.salario+PLUS;
           setSalario(nuevosalario);
        extra=true;
        }
        return extra;
    }  


}
