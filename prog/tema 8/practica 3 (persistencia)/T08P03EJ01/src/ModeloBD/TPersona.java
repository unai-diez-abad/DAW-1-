/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import ModeloUML.Persona;
import java.sql.*;
import java.util.ArrayList;

public class TPersona {
    private Connection con;

    public TPersona(Connection con) {
        this.con = con;
    }
    public void insertar(Persona p) throws Exception
    {
        // Preparar y ejecutar la sentencia sql.
        
        String plantilla = "INSERT INTO persona VALUES (?,?,?,?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        
        ps.setString(1,p.getNombre());
        ps.setInt(2,p.getEdad() );
        ps.setString(3, p.getProfesion());
        ps.setString(4, p.getTelefono());
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas insertado no es uno");
    }
    public Persona Consultaruno(String  nombre, int opcion) throws Exception
    {
        // Preparar y ejecutar la sentencia sql.
        
        String plantilla = "SELECT * FROM persona WHERE Nombre=?";
        PreparedStatement ps = con.prepareStatement(plantilla);
        
        ps.setString(1,nombre);
       // int n = ps.executeUpdate();
       ResultSet resultado = ps.executeQuery();
      // resultado es una fila o nada..
       if (resultado.next() )
       {
           // Crear objeto
           Persona p1 = new Persona();
           // resultado.get para coger el contenido de la columna dni
           p1.setNombre(resultado.getString("nombre"));
           p1.setEdad(resultado.getInt("Edad"));
           p1.setProfesion(resultado.getString("profesion"));
           p1.setTelefono(resultado.getString("telefono"));
           return p1;                   
       }
       else
            throw new Exception("El número de filas insertado no existe");
        
    }
     public ArrayList<Persona>  Consultageneral() throws Exception 
    {
        // Esta nueva versión busca los vehiculos de una persona
        ArrayList<Persona> lista = new ArrayList();
        String plantilla = "SELECT * FROM persona;";
        PreparedStatement ps = con.prepareStatement(plantilla);
       
      ResultSet resultado = ps.executeQuery();
       while(resultado.next())
       {
                Persona p = new Persona();
                p.setNombre(resultado.getString("Nombre"));
                p.setEdad(resultado.getInt("Edad"));
                p.setProfesion(resultado.getString("Profesion"));
                p.setTelefono(resultado.getString("Telefono"));
                
                lista.add(p);
       }
       return lista;
    }
    
}
