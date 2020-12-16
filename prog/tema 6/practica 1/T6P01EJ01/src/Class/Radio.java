/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import static java.lang.Math.PI;

/**
 *
 * @author unai diez
 */
public class Radio {
    private Double radio;

    public Radio(Double radio) {
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Radio{" + "radio=" + this.radio + '}';
    }
       public double circunferencia(){
       
        return Math.round((2*PI*this.radio)*100.0)/100.0;
    } 
    public double area(){
       
        return Math.round((PI*this.radio*this.radio)*100.0)/100.0;
    }
    public double volumen(){
        return Math.round(((4*PI*this.radio*this.radio*this.radio)/3)*100.0)/100.0;
    }  
}
