/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t5pex1ej02;

public class Persona {
    
    private int edad;
    
    /**
     * Constructor por defecto
     * @param edad
     */
    public Persona(int edad){
        this.edad=edad;
    }

    /**
     * Devuelve la edad
     * @return Edad acutal
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Modifica la edad
     * @param edad Valor edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}