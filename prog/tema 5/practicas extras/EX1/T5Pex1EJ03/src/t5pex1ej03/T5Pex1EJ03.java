/**
url:
https://www.discoduroderoer.es/ejercicios-propuestos-y-resueltos-basicos-listas-enlazadas-en-java/
 */
package t5pex1ej03;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class T5Pex1EJ03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Producto> pr= new ArrayList();
        genlistaprod(pr);
        
        String ticket="************Cantidad***Precio***Total\n";
        double precioTotal=0;
        Producto productoActual;
         for(int i=0;!pr.isEmpty();i++){
             
            productoActual=pr.remove(0);
            precioTotal+=productoActual.precioFinal();
            ticket+="Producto "+(i+1)+" \t"+productoActual.getCantidad()+
                    " \t"+productoActual.getPrecio()+
                    " \t"+productoActual.precioFinal()+" \n";
             
        }
         
        ticket+="Precio final \t\t\t"+precioTotal;       
       JOptionPane.showMessageDialog(null, ticket);
         
    }
        public static void genlistaprod(ArrayList <Producto> pr){
       int numeroproductos=generaNumeroAleatorio(1,8);
         int cantidad;
         double precio;
       for(int i=0;i<numeroproductos;i++){
           cantidad=generaNumeroAleatorio(1, 9);
           precio=generaNumeroRealAleatorio(0.05, 50);
           pr.add(new Producto(cantidad,precio));
       }        
    }
    public static int generaNumeroAleatorio(int minimo, int maximo){
         
        int num=(int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
        return num;
    } 
    public static double generaNumeroRealAleatorio(double minimo, double maximo){
         
        double num=Math.rint(Math.floor(Math.random()*(minimo-((maximo*100)+1))+((maximo*100)+1)))/100;
        return num;
         
    }
}
