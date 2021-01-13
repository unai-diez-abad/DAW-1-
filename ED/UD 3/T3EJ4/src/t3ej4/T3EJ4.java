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
public class T3EJ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Perecedero p1=new Perecedero (4,"patatas",8.25);
     Perecedero p2=new Perecedero (2,"patatas",8.25);
     Perecedero p3=new Perecedero (1,"patatas",8.25);
     Perecedero p4=new Perecedero (4,"pollo",16.25);
     Noperecedero p5=new Noperecedero ("hibrido","patinete electrico",8.25);
     
     p1.toString(5);
     p2.toString(5);
     p3.toString(5);
     p4.toString(5);
     p5.toString(5);
    }
    
}
