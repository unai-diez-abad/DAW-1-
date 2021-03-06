/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6p02ej02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author unai diez
 */
public class T6P02EJ02 {
    public static ArrayList<Estudio> listaEstudio=new ArrayList();
    public static ArrayList<Pelicula> listaPeliculas=new ArrayList();
    public static DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        crearEstudio();
        crearPeli();
        buscarpeli();
        buscarestudio();
    }

    public static void crearEstudio() throws ParseException {
       
        ArrayList <Pelicula> listado =new ArrayList();
        listado.add(listaPeliculas.get(0));
        listado.add(listaPeliculas.get(2));
        SimpleDateFormat objSDF = new SimpleDateFormat("dd-mm-yyyy"); 
        ArrayList telefonos = new ArrayList();
        telefonos.add("123456789");
        telefonos.add("943228617");
        
        listaEstudio.add(new Estudio("Universal","madrid","c/ parroquia","Universal.com",objSDF.parse("20-08-1981"),"españa",telefonos,listado));
     telefonos = new ArrayList();
        telefonos.add("444444444");
        telefonos.add("444444445");
        listado =new ArrayList();
        listado.add(listaPeliculas.get(0));
        listado.add(listaPeliculas.get(3));
        listaEstudio.add( new Estudio("Paramount", "Los Angeles"," C/ d","www.paramount.es",objSDF.parse("1955-09-23"),"EEUU",telefonos,listado));
        
        
        
        telefonos = new ArrayList();
        telefonos.add("555555555");
        telefonos.add("555555556");
        listado =new ArrayList();
        listado.add(listaPeliculas.get(1));
        listado.add(listaPeliculas.get(2));
        listaEstudio.add(new Estudio("20Th Century Fox", "Los Angeles"," C/ e","www.fox.es",objSDF.parse("1953-09-23"),"EEUU",telefonos,listado));
    
    
    
    }

    
    
    
    
    
    
    
    
    public static void crearPeli() {
        char[] año =new char[4];
        año[0]=1;
        año[1]=1;
        año[2]=1;
        año[3]=1;
        ArrayList <Estudio> listado =new ArrayList();
        listado.add(listaEstudio.get(0));
        listado.add(listaEstudio.get(2));
        listaPeliculas.add(new Pelicula("El rey leoon",año,90.7f,"infantil",listado));
      }

    public static void buscarpeli() {
        float tiempo=0;
        String nombrepeli="";
        for (int x=0;x<listaPeliculas.size();x++){
            if(tiempo<listaPeliculas.get(x).getDuracion())
              tiempo=listaPeliculas.get(x).getDuracion();
            nombrepeli=listaPeliculas.get(x).getTitulo();
        }
        JOptionPane.showMessageDialog(null, "la pelicula mas larga es "+nombrepeli);
    }

    public static void buscarestudio() {
       int[] contador =new int[listaEstudio.size()];
      for(int x=0;x<listaEstudio.size();x++) {
          contador[x]=0;
          for(int y=0;y<listaPeliculas.size();y++){
           if (listaPeliculas.get(y).getListaEstudio().equals(listaEstudio.get(x)))
               contador[x]++;
          }
      }
        int  cuenta=0;
        String estudioguay="";
        for (int x=0;x<listaEstudio.size();x++){
            if(cuenta==contador[x])
            estudioguay+=" y "+  listaEstudio.getClass().getName();
            else
            if  (cuenta<contador[x])  
            estudioguay=listaEstudio.getClass().getName();
        }      
     JOptionPane.showMessageDialog(null, "El estudio con mas peliculas es "+estudioguay);
   
    }
    
}
