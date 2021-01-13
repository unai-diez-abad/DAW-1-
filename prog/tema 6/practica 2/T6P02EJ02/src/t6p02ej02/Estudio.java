/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6p02ej02;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author unai diez
 */
public class Estudio{
    
    
    private String nombre;
    private String ciudad;
    private String direcion;
    private String dirWeb;
    //LocalDate en vez de date suele ser mejor pero pide Date
    private Date fechaFundacion;
    private String pais;
    private ArrayList<Integer> telefonos;

    private ArrayList<Pelicula>ListaPeli;
    
    public void nuevoEstudio(){
        //supuestamente esto es el constructor
    }
     public void modificaEstudio(){
        
    }
      public void cierraEstudio(){
        
    }
      public ArrayList<Estudio> despliegaEstudio(){
        return null;
        
    }

    public Estudio(String nombre, String ciudad, String direcion, String dirWeb, Date fechaFundacion, String pais, ArrayList<Integer> telefonos) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direcion = direcion;
        this.dirWeb = dirWeb;
        this.fechaFundacion = fechaFundacion;
        this.pais = pais;
        this.telefonos = telefonos;
    }

    public Estudio(String nombre, String ciudad, String direcion, String dirWeb, Date fechaFundacion, String pais, ArrayList<Integer> telefonos, ArrayList<Pelicula> ListaPeli) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direcion = direcion;
        this.dirWeb = dirWeb;
        this.fechaFundacion = fechaFundacion;
        this.pais = pais;
        this.telefonos = telefonos;
        this.ListaPeli = ListaPeli;
    }

    public ArrayList<Pelicula> getListaPeli() {
        return ListaPeli;
    }

    public void setListaPeli(ArrayList<Pelicula> ListaPeli) {
        this.ListaPeli = ListaPeli;
    }

   





    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDirecion() {
        return direcion;
    }

    public void setDirecion(String direcion) {
        this.direcion = direcion;
    }

    public String getDirWeb() {
        return dirWeb;
    }

    public void setDirWeb(String dirWeb) {
        this.dirWeb = dirWeb;
    }

    public Date getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(Date fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }


    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public ArrayList<Integer> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(ArrayList<Integer> telefonos) {
        this.telefonos = telefonos;
    }
    
    
}
