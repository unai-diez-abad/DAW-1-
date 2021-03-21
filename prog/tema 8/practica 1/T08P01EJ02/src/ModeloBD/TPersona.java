/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import ModeloUML.Persona;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TPersona {
    private Connection con;

    public TPersona(Connection con) {
        this.con = con;
    }
    public void insertar(Persona p) 
    {
        try{
        String plantilla = "INSERT INTO persona VALUES (?,?,?,?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        
        ps.setString(1,p.getNombre());
        ps.setString(2,p.getDNI() );
        ps.setString(3, p.getTelefono());
        ps.setString(4, p.getListaEmpresa());
        int n = ps.executeUpdate();
        ps.close();
        if (n < 1)
            throw new Exception("No se ha insertado correctamente ");
        else
          JOptionPane.showMessageDialog(null, "Persona Añadida al evento");  
    }
       catch (Exception ex){
       JOptionPane.showMessageDialog(null, ex.getMessage());
       }
    }
     public ArrayList<Persona>  Consultageneral(String a)
    {
         try{
        ArrayList<Persona> lista = new ArrayList();
        String plantilla = "SELECT * FROM persona Where nombre=?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
       
        ps.setString(1,a);
      ResultSet resultado = ps.executeQuery();
       while(resultado.next())
       {
                Persona p = new Persona();
                p.setNombre(resultado.getString("Nombre"));
                p.setDNI(resultado.getString("Dni"));
                
                lista.add(p);
       }
       return lista;
       }
       catch (Exception ex){
       JOptionPane.showMessageDialog(null, "no existe esa persona");
       return null;
       }
    }
    
}
