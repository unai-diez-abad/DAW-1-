/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6p01ej01;

import Class.Radio;
import javax.swing.JOptionPane;

/**
 *
 * @author unai diez
 */
public class T6P01EJ01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Double dato=pedirdato();
        
        Radio r1=new Radio(dato);
        JOptionPane.showMessageDialog(null, "circunferencia: "+r1.circunferencia()
                + "\narea: "+r1.area()
                + "\nvolumen: "+r1.volumen());
    }
    public static double pedirdato( ) {
        Double peticion=0.0;
        Boolean real=true;
        do{
           try{
           peticion=Double.parseDouble(JOptionPane.showInputDialog("IMporte de la radio"));
           real=false;
           } 
           catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "No se ha insertado nada");
           }
           catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "No se ha insertado de manera correcta la radio");
           }
           
        }while(real);
        return peticion;
    }
}
