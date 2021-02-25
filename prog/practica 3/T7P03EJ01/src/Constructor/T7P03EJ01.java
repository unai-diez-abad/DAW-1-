/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor;

import Clases.Cliente;
import Clases.Producto;
import Clases.Proveedor;
import Vistas.*;
import java.util.ArrayList;

/**
 *
 * @author unai diez
 */
public class T7P03EJ01 {

    private static ArrayList<Producto> listaproductos;
    private static ArrayList<Proveedor> listaproveedor;
    private static ArrayList<Cliente> listaclientes;
    private static Producto miproducto;
    private static Tienda v1;
    
    
    private final static int DTOPP=3;
    private final static int DTOV=2;
    public static String obtenerprecio;
    public static void main(String[] args) {
      
          meterproductos();
          v1 = new Tienda();
          v1.setVisible(true);
    }
public static void volverEmpezar(){
        v1.dispose(); // limpiar
        v1 = new Tienda();
        v1.setVisible(true);
    }
    public static void Salir() {
        System.exit(0);
    }
       private static void meterproductos() {
       listaproveedor=new ArrayList();
       listaproveedor.add(new Proveedor("Paco"));
       listaproveedor.add(new Proveedor("Patxi"));
       listaproveedor.add(new Proveedor("Ane"));
       listaproveedor.add(new Proveedor("Pereira"));
       
       listaproductos=new ArrayList();
       listaproductos.add(new Producto("Maiz",0.80,7));
       listaproductos.add(new Producto("Manzana",0.60,15));
       listaproductos.add(new Producto("Mandarina",1.2,3));
       listaproductos.add(new Producto("Pera",0.72,9));
       listaproductos.add(new Producto("Panceta",4.2,7));
       
       ArrayList<Proveedor> listapersonal= new ArrayList();
       listapersonal.add(listaproveedor.get(0));
       listapersonal.add(listaproveedor.get(2));
       
       listaproductos.get(0).setProveedor(listapersonal);
    } 
       public static void proveedorproducto(String producto){
        if(!producto.isEmpty())
        v1.limpiar();
        for (int x=0,y=1;x<listaproductos.size();x++){
               if(listaproductos.get(x).getNombre().equals(producto)) {
                v1.meter(listaproductos.get(x).getProveedor(),y)  ; 
               y++;
           }    
           }
               
       }

    public static boolean validarProducto(String text) {
        Boolean vuelta=false;
    
        for (int x=0,y=1;x<listaproductos.size() && vuelta==false;x++){
               if(listaproductos.get(x).getNombre().equals(text))
                   miproducto=listaproductos.get(x);
                   vuelta=true;
                   
    }
        return vuelta;
    }

    public static String obtenerprecio() {
        Double precio=0.0;
        for (int x=0,y=1;x<listaproductos.size() && precio==0.0;x++){
               if(listaproductos.get(x).getNombre().equals(miproducto))
                precio=listaproductos.get(x).getPreciouni();               
    }
      return precio.toString() ;
    }

    public static Object calcularImporteVenta(int u, boolean isDv, boolean isDppp) {
        Double importe;
         int dto = 0;
         importe=Math.rint(miproducto.getPreciouni()*u*100)/100;
         if (isDv)
         {
             dto=dto + DTOPP;
         }
         if (isDppp)
         {
            dto=dto + DTOV;
         }
         importe=importe * (100 - dto)/100;
         return importe;
    }
       

}

