/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t5p1ej01;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author unai diez
 */
public class T5P1EJ01 {

    public static ArrayList <Float> lista = new ArrayList();
    public static void main(String[] args) {
        rellenalista();
        try{
        int menu;
            do
            {
        menu=pedirmenu();            

            switch(menu)
                {
                case 1:
                    maxmin();
                break;
                case 2:
                    busqueda();
                break;
                case 3:
                    borrabusqueda();
                break;
                case 4:
                    aunarray();
                break;
                case 5:
                    contenidoelementos();
                break;
                case 6:
                    insertarfinal();
                break;
                case 7:
                    insertarsolicitud();
                break;
                case 8:
                    borrarsolicitud();
                break;
                case 9:
                    sumaymedia();
                break;
                case 10:
                    JOptionPane.showMessageDialog(null, "Finalizando");
                break;

                }       
            }while(menu!=10);
        }
        
        catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Problemas "+e.getClass());
                }

        
    }
    public static void rellenalista(){
             
        int continuar=0;
        do{
            try{
                lista.add(Float.parseFloat(JOptionPane.showInputDialog("inserta un valor")));
              continuar=JOptionPane.showConfirmDialog(null, "continuar?", "opciones", JOptionPane.YES_NO_OPTION);  
            }
        catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Problemas "+e.getClass());
                }
                    
        }while(continuar==0);   
    }
    public static int  pedirmenu(){
        boolean borrador=false;
        int menu=0;
        do
        { 
            try{
                menu=Integer.parseInt(JOptionPane.showInputDialog("Menu:\n"
                + "\n1=Visualizar el maximio y el minimo"
                + "\n2=buscar un numero"
                + "\n3=borrar un numero"
                + "\n4=convertir desde el arraylist a un array"
                + "\n5=ver contenido de elementos"
                + "\n6=insertar un elemento en la parte final"
                + "\n7=insertar un elemento en la parte seleccionada"
                + "\n8=borrar un elemento en la parte seleccionada"
                + "\n9=suma y media del contenido"
                + "\n10=Finalizar"));
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "no se ha puesto un numero ");
            }
            if(menu<1 ||menu>10)
            JOptionPane.showMessageDialog(null, "no se ha puesto un numero adecuado ante las opciones actuales ");
            else
             borrador=true;   
        }while(!borrador);
                  
                  return menu;
    }
        public static void maxmin(){
        float max=0,min=20000;
        for(int x=0;x<lista.size();x++){
            if(lista.get(x)<min)
                min=lista.get(x);
            if(lista.get(x)>max)
                max=lista.get(x);
        }
        JOptionPane.showMessageDialog(null, "El valor maximo es: "+max+"\nEl valor minimo es: "+min);
    }
        public static void busqueda(){
       float busqueda=Float.parseFloat(JOptionPane.showInputDialog("inserta un valor para buscar"));
       if(lista.contains(busqueda))
       JOptionPane.showMessageDialog(null, "El numero "+busqueda+" SI existe ");
       else
       JOptionPane.showMessageDialog(null, "El numero "+busqueda+" NO existe ");
    }
        public static void borrabusqueda(){
       float busqueda=Float.parseFloat(JOptionPane.showInputDialog("inserta un valor para borrarlo"));
       if(lista.contains(busqueda)){
       lista.remove(busqueda);
       JOptionPane.showMessageDialog(null, "El numero "+busqueda+" se ha borrado en la lista ");    
       }
       else
       JOptionPane.showMessageDialog(null, "El numero "+busqueda+" NO existe ");        
    }
        public static void aunarray(){
            String visualizar="todoslos valores del array";
       float[] matriz=new float[lista.size()];  
       for(int i = 0; i < matriz.length;i++) {
        matriz[i] = new Float(lista.get(i));
        visualizar+="\n "+ matriz[i];
        }
      JOptionPane.showMessageDialog(null,visualizar); 
    } 
        public static void contenidoelementos(){
        JOptionPane.showMessageDialog(null, "Se ha introducido "+lista.size()+" numeros");  
    }
        public static void insertarfinal(){
      int continuar=0;
        do{
            try{
                lista.add(Float.parseFloat(JOptionPane.showInputDialog("inserta un nuevo numero en el final")));
              continuar=1;  
            }
        catch(Exception e){
                    JOptionPane.showMessageDialog(null, "No se ha puesto un  numero");
                }   
        }while(continuar==0);     
    }
        public static void insertarsolicitud(){
         int continuar=0,posicion;
        do{
            try{
                posicion=(Integer.parseInt(JOptionPane.showInputDialog("inserta la posicion del nuevo numero ")));
                lista.add(posicion, Float.parseFloat(JOptionPane.showInputDialog("inserta un nuevo numero en la posicion "+posicion)));
              continuar=1;  
            }
        catch(Exception e){
                    JOptionPane.showMessageDialog(null, "No se ha puesto un  numero");
                }   
        }while(continuar==0);         
    }
        public static void borrarsolicitud(){
         int continuar=0,posicion;
        do{
            try{
                posicion=(Integer.parseInt(JOptionPane.showInputDialog("inserta la posicion del numero  que quieres borrar")));
                lista.remove(posicion);
                JOptionPane.showMessageDialog(null, "se ha eliminado el numero en la cual estaba en la posicion "+posicion);
               
              continuar=1;  
            }
        catch(Exception e){
                    JOptionPane.showMessageDialog(null, "No se ha puesto un  numero");
                }   
        }while(continuar==0);       
    }
        public static void sumaymedia(){
            float suma=0;
            for(int i = 0; i < lista.size();i++) {
        suma+= lista.get(i);
        }
         JOptionPane.showMessageDialog(null, "la suma de los "+lista.size()+" numeros es de: "+suma
         + "\n y la media es de: "+(suma/lista.size()));
                  
    }
}
