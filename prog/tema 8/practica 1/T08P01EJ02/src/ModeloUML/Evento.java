/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloUML;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author unai diez
 */
public class Evento {
    private String Nombre;
    private String Direccion;
    private LocalDate fecha;
    private LocalTime horainicio;
    private LocalTime  horafin;
    private int maxpersona;

    private ArrayList<Persona> listaasistentes;
    public Evento() {
    }

    public Evento(String Nombre) {
        this.Nombre = Nombre;
    }

    public Evento(String Nombre, String Direccion, LocalDate fecha, LocalTime horainicio, LocalTime horafin, int maxpersona) {
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.fecha = fecha;
        this.horainicio = horainicio;
        this.horafin = horafin;
        this.maxpersona = maxpersona;
        this.listaasistentes = new ArrayList();
    }

    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHorainicio() {
        return horainicio;
    }

    public void setHorainicio(LocalTime horainicio) {
        this.horainicio = horainicio;
    }

    public LocalTime getHorafin() {
        return horafin;
    }

    public void setHorafin(LocalTime horafin) {
        this.horafin = horafin;
    }

    public int getMaxpersona() {
        return maxpersona;
    }

    public void setMaxpersona(int maxpersona) {
        this.maxpersona = maxpersona;
    }

    public ArrayList<Persona> getListaasistentes() {
        return listaasistentes;
    }

    public void setListaasistentes(ArrayList<Persona> listaasistentes) {
        this.listaasistentes = listaasistentes;
    }

   

    
    
    
    
}
