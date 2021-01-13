/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6p02ej02;

import java.util.ArrayList;

/**
 *
 * @author unai diez
 */
public class Pelicula{
    private String titulo;
    private char[] año;
    private float duracion;
    private String tipo;

    private ArrayList<Estudio>listaEstudio;

    public Pelicula(String titulo, char[] año, float duracion, String tipo, ArrayList<Estudio> listaEstudio) {
        this.titulo = titulo;
        this.año = año;
        this.duracion = duracion;
        this.tipo = tipo;
        this.listaEstudio = listaEstudio;
    }
    



 


    
    public void nuevaPelicula(){
        //supuestamente esto es el constructor
    }
     public void modificarPelicula(){
        
    }   
    public void despliegaPelicula(){
        
    }
    public void eliminaPelicula(){
        
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Estudio> getListaEstudio() {
        return listaEstudio;
    }

    public void setListaEstudio(ArrayList<Estudio> listaEstudio) {
        this.listaEstudio = listaEstudio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public char[] getAño() {
        return año;
    }

    public void setAño(char[] año) {
        this.año = año;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    
}
