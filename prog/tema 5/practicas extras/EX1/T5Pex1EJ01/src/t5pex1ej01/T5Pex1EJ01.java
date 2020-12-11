/**
url:
https://www.discoduroderoer.es/ejercicios-propuestos-y-resueltos-basicos-listas-enlazadas-en-java/
 */
package t5pex1ej01;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class T5Pex1EJ01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Persona> cola = new ArrayList();
        generarcola(cola);
       double recaudacion,recaudaciontotal=0.0;
       Persona actual;
       int edadact;
       JOptionPane.showMessageDialog(null, "hay "+cola.size()+" personas para entrar al cine");
 
       while(!cola.isEmpty())
       {
                    
           actual=cola.get(0);
           edadact=actual.getEdad();
           
           if (edadact>=5 &&edadact<=10){
               recaudacion=1.0;
           }
           else{
               if (edadact>=11 &&edadact<=17){
               recaudacion=2.5;
           }
               else{
                   recaudacion=3.5;
               }
           }
           JOptionPane.showMessageDialog(null, "Una persona de "+edadact+" años se le ha cobrado " +recaudacion+ " euros"
                   + "\nqueda "+(cola.size()-1)+" personas");
           recaudaciontotal+=recaudacion;
           cola.remove(0);
       }
        JOptionPane.showMessageDialog(null, "La recaudacion total es de "+recaudaciontotal+" euros");
          
    }
    public static void generarcola(ArrayList <Persona> cola){
       int numeroPersonas=generaNumeroAleatorio(1,50);
         
       for(int i=0;i<numeroPersonas;i++){
           cola.add(new Persona(generaNumeroAleatorio(5, 60)));
       }        
    }
       public static int generaNumeroAleatorio(int minimo, int maximo){
         
        int num=(int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
        return num;
    } 
}
