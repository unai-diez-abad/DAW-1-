/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6p02ej03;

/**
 *
 * @author unai diez
 */
public class Cliente extends Persona{
    private String telefono_de_contacto;

    public Cliente(String telefono_de_contacto, String nombre, int edad) {
        super(nombre, edad);
        this.telefono_de_contacto = telefono_de_contacto;
    }

    public String getTelefono_de_contacto() {
        return telefono_de_contacto;
    }

    public void setTelefono_de_contacto(String telefono_de_contacto) {
        this.telefono_de_contacto = telefono_de_contacto;
    }

    @Override
    public String mostrar() {
        return super.mostrar()+ "telefono_de_contacto=" + telefono_de_contacto + '}';
    }
    
    
}
