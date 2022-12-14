/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registrar;

import Clases.PilaPrestamo;
import Clases.Prestamo;
import Interfaces.frmMenu;
import static Registrar.frmRegistrarAlumno.mensajeDeAlerta;

/**
 *
 * @author HECTOR MAURICIO
 */
public class frmRegistrarPrestamo extends javax.swing.JFrame {

    frmMenu principal;
    PilaPrestamo pilaPrestamo;
    
    int diasPrestado; 
    int cantidad;
    String fechaRealizado;
    String fechaDevuelto;
     
    
    
    public frmRegistrarPrestamo(frmMenu menu, PilaPrestamo datoE) 
    {
        initComponents();
        
        this.principal = menu;
        this.pilaPrestamo = datoE;
        
        int diasPrestado = 0; 
        int cantidad = 0;
        String fechaRealizado = "";
        String fechaDevuelto = "";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfDiasPrestamo = new javax.swing.JTextField();
        jtfCantidadLibros = new javax.swing.JTextField();
        jtfFechaPrestamo = new javax.swing.JTextField();
        jtfFechaDevuelto = new javax.swing.JTextField();
        jbnPush = new javax.swing.JButton();
        jbnPop = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbnRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Fecha devuelto");

        jLabel5.setText("Registrar prestamo");

        jbnPush.setText("Registrar");
        jbnPush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnPushActionPerformed(evt);
            }
        });

        jbnPop.setText("Pop");
        jbnPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnPopActionPerformed(evt);
            }
        });

        jLabel1.setText("Dias prestado");

        jbnRegresar.setText("Regresar");
        jbnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnRegresarActionPerformed(evt);
            }
        });

        jLabel2.setText("Cantidad de Libros");

        jLabel3.setText("Fecha del prestamo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbnPop)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1)))
                                .addComponent(jLabel4)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfDiasPrestamo)
                                    .addComponent(jtfCantidadLibros)
                                    .addComponent(jtfFechaPrestamo)
                                    .addComponent(jtfFechaDevuelto, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                                .addComponent(jbnPush)
                                .addGap(159, 159, 159)
                                .addComponent(jbnRegresar)))))
                .addGap(119, 119, 119))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel5)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfDiasPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfCantidadLibros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfFechaPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfFechaDevuelto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbnPush)
                    .addComponent(jbnPop)
                    .addComponent(jbnRegresar))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbnPushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnPushActionPerformed
        // TODO add your handling code here:
        diasPrestado = Integer.parseInt(jtfDiasPrestamo.getText());
        cantidad = Integer.parseInt(jtfCantidadLibros.getText());
        fechaRealizado = jtfFechaPrestamo.getText();
        fechaDevuelto = jtfFechaDevuelto.getText();

        pilaPrestamo.pushPrestamo(diasPrestado, cantidad, fechaRealizado, fechaDevuelto);
        jtfDiasPrestamo.setText("");
        jtfCantidadLibros.setText("");
        jtfFechaPrestamo.setText("");
        jtfFechaDevuelto.setText("");
        jtfDiasPrestamo.requestFocus();

        mensajeDeAlerta("Usuario Registrado" , "Registro" );
    }//GEN-LAST:event_jbnPushActionPerformed

    private void jbnPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnPopActionPerformed
        // TODO add your handling code here:
        pilaPrestamo.pop();
        mensajeDeAlerta("Usuario Eliminado" , "Eliminado" );
    }//GEN-LAST:event_jbnPopActionPerformed

    private void jbnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnRegresarActionPerformed
        // TODO add your handling code here:
        principal.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jbnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(frmRegistrarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new frmRegistrarPrestamo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbnPop;
    private javax.swing.JButton jbnPush;
    private javax.swing.JButton jbnRegresar;
    private javax.swing.JTextField jtfCantidadLibros;
    private javax.swing.JTextField jtfDiasPrestamo;
    private javax.swing.JTextField jtfFechaDevuelto;
    private javax.swing.JTextField jtfFechaPrestamo;
    // End of variables declaration//GEN-END:variables
}
