/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t7p01ej01;
import Vistas.aleatorio;
import javax.swing.JTextField;
/**
 *
 * @author unai diez
 */
public class T7P01EJ01 {

    private static aleatorio v1;
    public static int acertados=0;
    public static int erroneos=0;
    public static int suma;
    public static void main(String[] args) {
       v1 = new aleatorio();
       v1.setVisible(true);
    }

    public static void salir() {
        System.exit(0);
    }

    public static void comprobar(int valor) {
    if(suma==valor)
        acertados++;
    else
       erroneos++; 
        }
    public static void sumarandom(String n1, String n2) {
        
    suma=Integer.parseInt(n1)+Integer.parseInt(n2);
        }
}
