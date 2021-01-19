/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6p02ej03;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author unai diez
 */
public class T6P02EJ03 {
    private static Empresa[] listaEmpresas = new Empresa[5];
        private static ArrayList<Empleado> listaEmpleados;
        private static ArrayList<Directivo> listaDirectivos;
        private static ArrayList<Cliente> listaClientes;
    public static void main(String[] args) {
       
        obtener_empleado();
        obtener_directivo();
        obtener_cliente();
        obtener_empresa();
        buscar_max_subordinados();
    }
    public static void  obtener_empleado(){
        listaEmpleados= new ArrayList();
        Empleado a1 = new Empleado(22000.00,"Pepe",50);
        listaEmpleados.add(a1);
        Empleado a2 = new Empleado(20000.00,"Paula",42);
        listaEmpleados.add(a2);
        Empleado a3 = new Empleado(19000.00,"Paco",44);
        listaEmpleados.add(a3);
        Empleado a4 = new Empleado(19000.00,"Eneko",32);
        listaEmpleados.add(a4); 
                System.out.println("Empleados:" );
        System.out.println( a1.mostrar());
        System.out.println( a2.mostrar());
        System.out.println( a3.mostrar());
        System.out.println( a4.mostrar());
            System.out.println( );
    }
    public static void  obtener_directivo(){
     ArrayList <Empleado> lista = new ArrayList();
        lista.add( listaEmpleados.get(1));
        lista.add( listaEmpleados.get(2));
    Directivo d1= new Directivo
            ("presidente",lista,        
            listaEmpleados.get(0).getSueldo_bruto(),
            listaEmpleados.get(0).getNombre(),
            listaEmpleados.get(0).getEdad());
    
    lista = new ArrayList();
        lista.add( listaEmpleados.get(3));
    Directivo d2= new Directivo
            ("vicepresidente",lista,  
            listaEmpleados.get(2).getSueldo_bruto(),
            listaEmpleados.get(2).getNombre(),
            listaEmpleados.get(2).getEdad());
                System.out.println("Directivos" );
    System.out.println( d1.mostrar());
    System.out.println( d2.mostrar());
            System.out.println( );
    }
    public static void  obtener_cliente(){
         listaClientes= new ArrayList();
        Cliente c1 = new Cliente("111111111","Pepe",50);
        listaClientes.add(c1);
         Cliente c2 = new Cliente("111111112","Paula",42);
        listaClientes.add(c2);
         Cliente c3 = new Cliente("111111113","Paco",44);
        listaClientes.add(c3);
         Cliente c4 = new Cliente("111111114","Eneko",32);
        listaClientes.add(c4);
                    System.out.println( "Clientes");
        System.out.println( c1.mostrar());
        System.out.println( c2.mostrar());
        System.out.println( c3.mostrar());
        System.out.println( c4.mostrar());
                System.out.println( );
    }
    public static void  obtener_empresa(){
        
    ArrayList <Empleado> empleados = new ArrayList();
    ArrayList <Cliente> clientes = new ArrayList();
    
    empleados.add(listaEmpleados.get(0));
    empleados.add(listaEmpleados.get(1));
    clientes.add(listaClientes.get(0));
    clientes.add(listaClientes.get(2));
    listaEmpresas[0]=new Empresa("infornatica andy",empleados,clientes);
    
    
    empleados = new ArrayList();
    clientes = new ArrayList();
    empleados.add(listaEmpleados.get(2));
    clientes.add(listaClientes.get(1));
    clientes.add(listaClientes.get(2));
    listaEmpresas[1]=new Empresa("fruteria iosu",empleados,clientes);

    }
    public static void  buscar_max_subordinados(){
            // En estudio No tengo las películas
        // contador de peliculas de cada estudio
        // arrays coincidentes
        int [] numerosubordinados = new int[5];
        Arrays.fill(numerosubordinados, 0);
        
        // Por cada Estudio recorro la lista de todas las películas para ver si está o no.
        for(int z = 0;z < listaEmpleados.size(); z++)
            for(int x=0; x < listaDirectivos.size();x++)
            {
                boolean salir = false;
                for(int y=0; y < listaDirectivos.get(x).getListaEmpleados().size() && !salir; y++)
                {
                    //if (listaPeliculas.get(x).getListaEstudios().get(y)== listaEstudios[z])
                    if (listaDirectivos.get(x).getListaEmpleados().get(y).equals(listaEmpleados.get(z)))
                    {
                        numerosubordinados[z]+= 1;
                        salir = true;                    
                    }
                }
            }
        
        // Busco el máximo contador
        int maximo = 0;
        int posicion = 0;
        for (int x = 0; x < numerosubordinados.length; x++)
            if(numerosubordinados[x] > maximo)
            {
                maximo = numerosubordinados[x];
                posicion = x;
            }
    }
}
