/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import ModeloUML.Persona;
import ModeloUML.Evento;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TAsistencias {
    private Connection con;

    public TAsistencias(Connection con) {
        this.con = con;
    }

}
