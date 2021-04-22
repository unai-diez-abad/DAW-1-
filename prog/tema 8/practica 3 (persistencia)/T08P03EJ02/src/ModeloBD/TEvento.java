/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import ModeloUML.Evento;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author unai diez
 */
public class TEvento {
    private Connection con;

    public TEvento(Connection con) {
        this.con = con;
    }
   public void anadirevento (Evento e) {
       try{
        String plantilla = "INSERT INTO Empresa VALUES (?,?,?,?,?,?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        
        ps.setString(1,e.getNombre());
        ps.setString(2,e.getDireccion() );
        ps.setDate(3, conversionDate(e.getFecha()));
        ps.setTime(4, conversionTime(e.getHorainicio()));
        ps.setTime(5, conversionTime(e.getHorafin()));
        ps.setInt(6, e.getMaxpersona());
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("No se ha insertado ");
        else
          JOptionPane.showMessageDialog(null, "Evento Añadido");  
    }
       catch (Exception ex){
       JOptionPane.showMessageDialog(null, ex.getMessage());
       }
   }
public static java.sql.Date conversionDate(LocalDate fecha)
    {
        // Conversion LocalDate en java.sql.Date
        return java.sql.Date.valueOf(fecha);
        
    }
    
    public static java.sql.Time conversionTime(LocalTime hora)
    {
         // Conversion java.time.LocalTime en java.sql.Time
        return java.sql.Time.valueOf(hora);
    }
    

    public void modificaevento(Evento e) {
       try{
        String plantilla = "UPDATE evento "
                + "SET Direccion=?,"
                + "fecha=? ,"
                + "hora_inicio=? ,"
                + "hora_fin=? ,"
                + "max_personas=? "
                + "WHERE Nombre=? ;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        
       
        ps.setString(1,e.getDireccion());
        ps.setDate(2, conversionDate(e.getFecha()));
        ps.setTime(3, conversionTime(e.getHorainicio()));
        ps.setTime(4, conversionTime(e.getHorafin()));
        ps.setInt(5, e.getMaxpersona());
         ps.setString(6,e.getNombre());
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("No se ha modificado correctamente ");
        else
          JOptionPane.showMessageDialog(null, "Evento Modificado");  
    }
       catch (Exception ex){
       JOptionPane.showMessageDialog(null, ex.getMessage());
       }
    }

    public Evento buscarevento(String a) {
      try{
        String plantilla = "SELECT * FROM evento WHERE Nombre=?";
        PreparedStatement ps = con.prepareStatement(plantilla);
        
        ps.setString(1,a);
       // int n = ps.executeUpdate();
       ResultSet resultado = ps.executeQuery();
      // resultado es una fila o nada..
       if (resultado.next() )
       {
           // Crear objeto
           Evento e1 = new Evento();
           // resultado.get para coger el contenido de la columna dni
           e1.setNombre(resultado.getString("Nombre"));
           e1.setDireccion(resultado.getString("Direccion"));
           e1.setFecha(resultado.getDate("fecha").toLocalDate());
           e1.setHorainicio(resultado.getTime("hora_inicio").toLocalTime());
           e1.setHorafin(resultado.getTime("hora_fin").toLocalTime());
           e1.setMaxpersona(Integer.parseInt(resultado.getString("max_personas")));
           return e1;                   
       }
       else
            throw new Exception("El nombre buscado no existe");
    }
       catch (Exception ex){
       JOptionPane.showMessageDialog(null, ex.getMessage());
       return null;
       }  
    }

    public void borrarevento(String a) {
        try{
        String plantilla = " DELETE FROM evento WHERE Nombre=? ;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        
        ps.setString(1,a);
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("No existe el evento ");
        else
          JOptionPane.showMessageDialog(null, "Evento Eliminado");  
    }
       catch (Exception ex){
       JOptionPane.showMessageDialog(null, ex.getMessage());
       }
    }
    public ArrayList<String> listarempresa() {
      try{
         ArrayList<String> listado=new ArrayList();
        String plantilla = "SELECT Nombre FROM evento";
        PreparedStatement ps = con.prepareStatement(plantilla);
        
       // int n = ps.executeUpdate();
       ResultSet resultado = ps.executeQuery();
      // resultado es una fila o nada..
       
          while(resultado.next()){
           listado.add(resultado.getString("Nombre"));
          }
           return listado;                   
       
    }
       catch (Exception ex){
       JOptionPane.showMessageDialog(null, ex.getMessage());
       return null;
       }  
    }    
    public ArrayList<String> listarempresa2() {
      try{
         ArrayList<String> listado=new ArrayList();
        String plantilla = "SELECT Nombre FROM evento Where Fecha>?";
        PreparedStatement ps = con.prepareStatement(plantilla);
        
        ps.setDate(1,conversionDate(LocalDate.now()));
       ResultSet resultado = ps.executeQuery();
      // resultado es una fila o nada..
       if (resultado.next() )
       {
          while(resultado.next()){
           listado.add(resultado.getString("Nombre"));
          }
           return listado;                   
       }
       else
            throw new Exception("El nombre buscado no existe");
    }
       catch (Exception ex){
       JOptionPane.showMessageDialog(null, ex.getMessage());
       return null;
       }  
    }   
    
}
