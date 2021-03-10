/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Main.Controlador;
import ModeloUML.Persona;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author unai diez
 */
public class Accion extends javax.swing.JFrame {

    private int opciones,x=0;
    private ArrayList<Persona> listaPersona;
    public Accion() throws Exception  {
        opciones=Controlador.obteneropcion();
        initComponents();
        realizaraccion();
    }

    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bNegativo = new javax.swing.JButton();
        bPositivo = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        bAceptar = new javax.swing.JButton();
        txtEdad = new javax.swing.JFormattedTextField();
        txtTelefono = new javax.swing.JFormattedTextField();
        txtNombre = new javax.swing.JFormattedTextField();
        txtProfesion = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Personas");

        jLabel2.setText("Nombre");

        jLabel3.setText("Edad");

        jLabel4.setText("Profesion");

        jLabel5.setText("Telefono");

        bNegativo.setText("<");
        bNegativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNegativoActionPerformed(evt);
            }
        });

        bPositivo.setText(">");
        bPositivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPositivoActionPerformed(evt);
            }
        });

        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        bAceptar.setText("Aceptar");
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarActionPerformed(evt);
            }
        });

        txtEdad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##"))));
        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });

        txtTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#########"))));
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtProfesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProfesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bAceptar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(131, 131, 131)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addGap(32, 32, 32)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtEdad, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addComponent(txtNombre)
                                .addComponent(txtProfesion)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(145, 145, 145)
                            .addComponent(bNegativo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bPositivo)
                            .addGap(18, 18, 18)
                            .addComponent(bSalir))))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bNegativo)
                    .addComponent(bPositivo)
                    .addComponent(bSalir))
                .addGap(18, 18, 18)
                .addComponent(bAceptar)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        Controlador.mostrarinicio();
    }//GEN-LAST:event_bSalirActionPerformed

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
        Boolean accion=Controlador.insertarpersona(txtNombre.getText(), Integer.parseInt(txtEdad.getText()), txtProfesion.getText(), txtTelefono.getText());
        if (accion)
            JOptionPane.showMessageDialog(this, "Nueva persona insertada");
        else
             JOptionPane.showMessageDialog(this, "Error al insertar la nueva persona");
        Controlador.mostrarinicio();
    }//GEN-LAST:event_bAceptarActionPerformed

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
         txtEdad.setEnabled(false);
        txtProfesion.setEnabled(true);
        txtProfesion.requestFocus();
    }//GEN-LAST:event_txtEdadActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
       
        bAceptar.setEnabled(true);
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void bPositivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPositivoActionPerformed
       x++;
       insertardatos();
       comprobarx();
    }//GEN-LAST:event_bPositivoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
 if(opciones ==1){  
          try {
          Persona p1 = Controlador.obtenerconsulta(txtNombre.getText(),1);
          if(p1!=null)
          throw new Exception("no existe dicho nombre");
                else{
          txtNombre.setEnabled(false); 
          txtEdad.setEnabled(true);
          txtEdad.requestFocus();}
          } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "error inesperado");
          }
    }
      else
     if(opciones ==2){
            try {
            Persona p1 = Controlador.obtenerconsulta(txtNombre.getText(),2);
                if(p1==null)
                    throw new Exception("no existe dicho nombre");
                else{
                txtNombre.setEnabled(false);   
                txtEdad.setText(Integer.toString(p1.getEdad()));
                txtProfesion.setText(p1.getProfesion());
                txtTelefono.setText(p1.getProfesion());
                } 
            } catch (Exception x) {
                JOptionPane.showMessageDialog(this, "error inesperado");
            }
                    }        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtProfesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProfesionActionPerformed
txtProfesion.setEnabled(false);
       txtTelefono.setEnabled(true);
       txtTelefono.requestFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_txtProfesionActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Controlador.mostrarinicio();
    }//GEN-LAST:event_formWindowClosing

    private void bNegativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNegativoActionPerformed
       x--;
        insertardatos();
       comprobarx();
    }//GEN-LAST:event_bNegativoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Accion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Accion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Accion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Accion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Accion().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(Accion.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bNegativo;
    private javax.swing.JButton bPositivo;
    private javax.swing.JButton bSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JFormattedTextField txtEdad;
    private javax.swing.JFormattedTextField txtNombre;
    private javax.swing.JFormattedTextField txtProfesion;
    private javax.swing.JFormattedTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    private void realizaraccion() throws Exception {
                txtNombre.setEnabled(false);
                txtEdad.setEnabled(false);
                txtProfesion.setEnabled(false);
                txtTelefono.setEnabled(false);
        switch(opciones){
            
            case 1:
                txtNombre.setEnabled(true);
                bNegativo.setEnabled(false);
                bPositivo.setEnabled(false);
                bSalir.setEnabled(false);
                bAceptar.setEnabled(false);
                break;
            case 2:
                txtNombre.setEnabled(true);
                bNegativo.setEnabled(false);
                bPositivo.setEnabled(false);
                bSalir.setEnabled(true);
                bAceptar.setEnabled(false);
                break;
            case 3:
                listaPersona=Controlador.obtenerpersona();
                insertardatos();
                comprobarx();
                bSalir.setEnabled(true);
                bAceptar.setEnabled(false);
                break;
    }
    }

    private void insertardatos() {
        txtNombre.setText(listaPersona.get(x).getNombre());
                txtEdad.setText(Integer.toString(listaPersona.get(x).getEdad()));
                txtProfesion.setText(listaPersona.get(x).getProfesion());
                txtTelefono.setText(listaPersona.get(x).getTelefono());
                comprobarx();
    }

    private void comprobarx() {
        bNegativo.setEnabled(true);
            bPositivo.setEnabled(true);
        if(x==0)
        {
            bNegativo.setEnabled(false);
        }
        
            if(x==listaPersona.size()-1)
            {
                bPositivo.setEnabled(false);
            }
        
            
            
        
        
    }
}
