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
public class Comercial extends Empleado{
    private Double comision;

    public Comercial(Double comision, String nombre, int edad, Double salario) {
        super(nombre, edad, salario);
        this.comision = comision;
    }



    public Double getComision() {
        return comision;
    }

    public void setComision(Double comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        return super.toString()+"Comercial{" + "comision=" + comision + '}';
    }
 
    @Override
     public Boolean plus(){
        Boolean extra=false;
         int plus=300;
        if(super.getEdad()>30 && comision>200){
           double nuevosalario= this.salario+PLUS;
           setSalario(nuevosalario);
        extra=true;
        }
        return extra;
    }   
    
}
