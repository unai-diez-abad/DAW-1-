/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6p02ej03;

import java.util.ArrayList;

/**
 *
 * @author unai diez
 */
public class T6P02EJ03 {
    private static Empresa[] listaEmpresas = new Empresa[5];
        private static ArrayList<Empleado> listaEmpleados;
        private static ArrayList<Cliente> listaClientes;
    public static void main(String[] args) {
       
        obtener_empleado();
        obtener_directivo();
        obtener_cliente();
        obtener_empresa();
        buscar_max_subordinados();
    }
    public static void  obtener_empleado(){
        Empleado a1 = new Empleado(22000.00,"Pepe",50);
        listaEmpleados.add(a1);
        Empleado a2 = new Empleado(20000.00,"Paula",42);
        listaEmpleados.add(a2);
        Empleado a3 = new Empleado(19000.00,"Paco",44);
        listaEmpleados.add(a3);
        Empleado a4 = new Empleado(19000.00,"Eneko",32);
        listaEmpleados.add(a4);      
    }
    public static void  obtener_directivo(){
    
    }
    public static void  obtener_cliente(){
    
    }
    public static void  obtener_empresa(){
    
    }
    public static void  buscar_max_subordinados(){
    
    }
}
