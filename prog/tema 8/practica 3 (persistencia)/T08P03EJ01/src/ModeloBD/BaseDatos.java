/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;
import java.sql.*;
/**
 *
 * @author unai diez
 */
public class BaseDatos {
    private Connection con;
    public void conectar(){
       try{
               // Identificamos el driver
                Class.forName("com.mysql.jdbc.Driver");
                 //obtenemos la conexión
                 String bd="el8101";
                 String url = "jdbc:mysql://localhost:3306/"+bd;
                 String login="root";
                 String password = "usbw";
                 con = DriverManager.getConnection(url,login,password);
 
                if (con==null){
                       throw new Exception("Problemas con la conexión");
                 }
          }
       catch(Exception e)
       {
           System.out.println(e.getMessage());
       }
       
   }
    public void desconectar(){
       try
       {
            con.close();
       }
       catch(Exception e)
       {
           System.out.println("Problemas cerrando la conexión");
       }
   }
   
   public Connection getCon()
   {
       return con;
   }
}
