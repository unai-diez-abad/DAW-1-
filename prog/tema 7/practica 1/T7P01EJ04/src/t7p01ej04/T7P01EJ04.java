/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t7p01ej04;

import Clases.Producto;
import java.util.ArrayList;
import javax.swing.JTextField;
import Vistas.*;
import java.text.DecimalFormat;

/**
 *
 * @author unai diez
 */
public class T7P01EJ04 {

    private static ArrayList<Producto> listaproductos;
        
    private static OpcionProducto v1;
    private static Compras vcomp;
    private static Ventas vvent;
    
    public static void main(String[] args) {
        
        meterproductos();
        v1 = new OpcionProducto();
        v1.setVisible(true);
    }

    public static void Salir() {
        System.exit(0);
    }

    public static boolean Buscaproducto(String Producto) {
        Boolean existente=false;
        for(int x=0;x<listaproductos.size()&& existente==false;x++){
            if(listaproductos.get(x).getNombre().equals(Producto)){
            existente=true;
            }
        }
        return existente;
    }

    private static void meterproductos() {
       listaproductos=new ArrayList();
       listaproductos.add(new Producto("Maiz",0.80,7));
       listaproductos.add(new Producto("Manzana",0.60,15));
       listaproductos.add(new Producto("Mandarina",1.2,3));
       listaproductos.add(new Producto("Pera",0.72,9));
       listaproductos.add(new Producto("Panceta",4.2,7));
    }

    public static void movercompra() {
        v1.dispose();
       
        vcomp = new Compras();
        vcomp.setVisible(true); 
    }

    public static void moverventa() {
        v1.dispose();
       
        vvent = new Ventas();
        vvent.setVisible(true); 
    }

    public static void moverprincipio(String inicio) {
        if(inicio=="venta")
         vvent.dispose();
        if(inicio=="compra")
         vcomp.dispose();
            
        v1 = new OpcionProducto();
        v1.setVisible(true);
        }

    public static boolean Buscaexistencias(String Producto, String text) {
        int cantidad=Integer.parseInt(text);
         Boolean mas=false;
        for(int x=0;x<listaproductos.size()&& mas==false;x++){
            if(listaproductos.get(x).getNombre().equals(Producto))
            if(listaproductos.get(x).getUnidades()>cantidad){
            mas=true;
            }
        }
        return mas;
         }

    public static String Buscaprecio(String Producto, String unidades) {
        DecimalFormat formato= new DecimalFormat("#.##");
        int cantidad=Integer.parseInt(unidades);
        Double coste=0.0, preciouni=0.0;
         for(int x=0;x<listaproductos.size()&&preciouni==0.0;x++){
            if(listaproductos.get(x).getNombre().equals(Producto)){
            preciouni=(listaproductos.get(x).getPreciouni());
            }
        }
         coste=cantidad*preciouni;
        return coste.toString();
           }

    public static void vender(String Producto, String unidades, String precio) {
        int cantidad=Integer.parseInt(unidades);
        Double coste=0.0, preciouni=0.0;
         for(int x=0;x<listaproductos.size()&&preciouni==0.0;x++){
            if(listaproductos.get(x).getNombre().equals(Producto)){
            listaproductos.get(x).setUnidades(listaproductos.get(x).getUnidades()-cantidad);
            }
         }
    }
    
}
