/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.app.vista;

import ec.edu.ups.app.modelo.ClienteFactura;
import ec.edu.ups.app.modelo.Parametos;
import ec.edu.ups.app.modelo.ParametrosFactura;
import ec.edu.ups.app.modelo.RecargaFactura;
import ec.edu.ups.app.modelo.Respuesta;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;

/**
 *
 * @author vinny
 */
public class Ventana extends javax.swing.JFrame {

    private String WS_SAVE_RECARGA = "http://localhost:8080/BarzalloVinicioCajeraJEE/ws/cooperativa/recarga";
    private String WS_SAVE_FACTURA = "http://localhost:8080/BarzalloVinicioSRIJEE/ws/consumir/ingresar";

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCedula = new javax.swing.JTextField();
        lblNCuenta = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        lblRecarga = new javax.swing.JLabel();
        lblCelular = new javax.swing.JLabel();
        txtSaldo = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        bntGuardar = new javax.swing.JButton();
        txtIdCuenta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtCedula.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });

        lblNCuenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNCuenta.setText("Número de cuenta:");

        lblCedula.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCedula.setText("Cédula:");

        lblRecarga.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRecarga.setText("Valor de recarga:");

        lblCelular.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCelular.setText("Número celular:");

        txtSaldo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaldoActionPerformed(evt);
            }
        });

        txtCelular.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelularActionPerformed(evt);
            }
        });

        bntGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bntGuardar.setText("Guardar");
        bntGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntGuardarActionPerformed(evt);
            }
        });

        txtIdCuenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtIdCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdCuentaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Cliente SWING");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(195, 195, 195))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(bntGuardar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblNCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblRecarga, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCelular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtSaldo)
                            .addComponent(txtCedula, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdCuenta, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNCuenta))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCedula))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRecarga)
                    .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCelular)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(bntGuardar)
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void txtSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSaldoActionPerformed

    private void txtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelularActionPerformed

    private void bntGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntGuardarActionPerformed
        // TODO add your handling code here:
        Parametos p = new Parametos();
        p.setCedula(txtCedula.getText());
        p.setIdCuenta(txtIdCuenta.getText());
        p.setNumeroCelular(txtCelular.getText());
        p.setSaldo(Double.valueOf(txtSaldo.getText()));

        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(WS_SAVE_RECARGA);
        Respuesta respuesta = target.request().post(Entity.json(p), Respuesta.class);
        System.out.println("respuesta" + respuesta);

        insertarfactura(txtCedula.getText(), txtIdCuenta.getText(), txtCelular.getText(), Double.valueOf(txtSaldo.getText()));
    }//GEN-LAST:event_bntGuardarActionPerformed

    private void txtIdCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdCuentaActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    public void insertarfactura(String cedula, String nombre, String numerocelular, double saldo) {
        ClienteFactura cl = new ClienteFactura();
        cl.setCedula(cedula);
        cl.setNombre(nombre);
        cl.setNumeroCeular(numerocelular);
        cl.setSaldo(saldo);

        RecargaFactura recarga = new RecargaFactura();
        recarga.setValor(saldo);

        ParametrosFactura pfactura = new ParametrosFactura();

        pfactura.setCliente(cl);
        pfactura.setRecarga(recarga);

        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(WS_SAVE_FACTURA);
        Respuesta respuesta = target.request().post(Entity.json(pfactura), Respuesta.class);
        System.out.println("respuesta" + respuesta);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntGuardar;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblNCuenta;
    private javax.swing.JLabel lblRecarga;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtIdCuenta;
    private javax.swing.JTextField txtSaldo;
    // End of variables declaration//GEN-END:variables
}
