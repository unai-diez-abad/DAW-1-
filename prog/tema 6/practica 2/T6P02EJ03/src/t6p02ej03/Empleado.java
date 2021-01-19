/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6p02ej03;

/**
 *
 * @author unai diez
 */
public class Empleado extends Persona{
    private Double sueldo_bruto;

    public Empleado(Double sueldo_bruto, String nombre, int edad) {
        super(nombre, edad);
        this.sueldo_bruto = sueldo_bruto;
    }

    public Double getSueldo_bruto() {
        return sueldo_bruto;
    }

    public void setSueldo_bruto(Double sueldo_bruto) {
        this.sueldo_bruto = sueldo_bruto;
    }
    
      @Override
    public String mostrar() {
         return super.mostrar()+ ", sueldo_bruto=" + sueldo_bruto ;
    } 
 public Double calcular_salario_neto(){
     Double neto=0.0;
     neto=this.sueldo_bruto*14;
     return neto;
 }

    
}
