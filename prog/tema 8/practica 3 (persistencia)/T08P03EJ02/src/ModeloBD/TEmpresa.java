/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import ModeloUML.Empresa;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TEmpresa {
    private Connection con;

    public TEmpresa(Connection con) {
        this.con = con;
    }

    public boolean buscarempresa(String a) {
      try{
        String plantilla = "SELECT * FROM empresa WHERE Nif=?";
        PreparedStatement ps = con.prepareStatement(plantilla);
        
        ps.setString(1,a);
       // int n = ps.executeUpdate();
       ResultSet resultado = ps.executeQuery();
      // resultado es una fila o nada..
       if (resultado.next() )
       
        return true;
       
       else
         return false;
    }
       catch (Exception ex){
       JOptionPane.showMessageDialog(null, "Erro inesperado en la base de datos");
       return false;
       }  
        
    }
    

    
    
}
