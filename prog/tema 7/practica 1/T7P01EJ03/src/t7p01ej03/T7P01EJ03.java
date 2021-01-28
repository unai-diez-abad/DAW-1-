/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t7p01ej03;

import Clases.Alumno;
import Clases.Curso;
import Vistas.alumnos;
import java.util.ArrayList;

/**
 *
 * @author unai diez
 */
public class T7P01EJ03 {
    private static alumnos a1;
    private static ArrayList<Alumno> listaAlumnos;
    private static ArrayList<Curso> todocursos;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        insertarcursos();
        
        listaAlumnos = new ArrayList();
        a1= new alumnos();
        a1.setVisible(true);
    }
        public static void insertarcursos(){
            String[] z= new String [16];
            int x=0,y=0;
            do{
            z[x]=y+"A";
            x++;
            z[x]=y+"B";
            x++;
            z[x]=y+"C";
            x++;
            z[x]=y+"D";
            x++;
            y++;
            }while(x<z.length);
            todocursos= new ArrayList();
        for(x=0;x<z.length;x++)
            todocursos.add(new Curso(z[x]));
    }
        public static boolean validarDni(String dni){
        // Comprobamos que no está repetido
        int x;
        for(x = 0; x < listaAlumnos.size() && listaAlumnos.get(x).getDni().compareTo(dni)!= 0; x++){}
        if (x == listaAlumnos.size())
            return true;
        return false;
    }
        public static boolean validarCurso(String curso){
        // Comprobamos que no está repetido
        int x;
        for(x = 0; x < listaAlumnos.size() && listaAlumnos.get(x).getDni().compareTo(curso)!= 0; x++){}
        if (x == listaAlumnos.size())
            return true;
        return false;
    }
     public static boolean altaalumno(String dni,String nombre, String apellidos,String curso)
    {
        try
        {
            listaAlumnos.add(new Alumno(dni,nombre,apellidos,curso));
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }   
}
