/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage.gui;

import javax.swing.JOptionPane;
import mypackage.connector.LocalConnector;
import mypackage.entities.Gasto;
import mypackage.repositories.interfaces.I_GastoRepository;
import mypackage.repositories.jdbc.GastoRepository;

/**
 *
 * @author andre
 */
public class JFrameMenuGestorGastos extends javax.swing.JFrame {

    private I_GastoRepository gastoRepository = new GastoRepository(LocalConnector.getLocalConnection());

    /** Creates new form JFrameMenuGastos */
    public JFrameMenuGestorGastos() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelPrecioCompras = new javax.swing.JLabel();
        jTextFieldPrecioCompras = new javax.swing.JTextField();
        jLabelComentarioCompras = new javax.swing.JLabel();
        jTextFieldPrecioServicios = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelPrecioServicios = new javax.swing.JLabel();
        jTextFieldComentarioCompras = new javax.swing.JTextField();
        jTextFieldComentarioTransporte = new javax.swing.JTextField();
        jLabelComentarioTransporte = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabelPrecioTransporte = new javax.swing.JLabel();
        jTextFieldPrecioTransporte = new javax.swing.JTextField();
        jLabelComentarioServicios = new javax.swing.JLabel();
        jTextFieldComentarioServicios = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jButtonLimpiar = new javax.swing.JButton();
        jButtonAgregar = new javax.swing.JButton();
        jButtonVerGastos = new javax.swing.JButton();
        jLabelFecha = new javax.swing.JLabel();
        jTextFieldFecha = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jButtonAnalytics = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setForeground(new java.awt.Color(18, 16, 66));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Arial Black", 1, 28)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("GESTOR DE GASTOS");
        jDesktopPane1.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, 50));

        jLabelPrecioCompras.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelPrecioCompras.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPrecioCompras.setText("Precio de Compras: $");
        jDesktopPane1.add(jLabelPrecioCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, 50));

        jTextFieldPrecioCompras.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextFieldPrecioCompras.setText("0.0");
        jDesktopPane1.add(jTextFieldPrecioCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 190, 30));

        jLabelComentarioCompras.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelComentarioCompras.setForeground(new java.awt.Color(255, 255, 255));
        jLabelComentarioCompras.setText("Comentario :");
        jDesktopPane1.add(jLabelComentarioCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, 50));

        jTextFieldPrecioServicios.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextFieldPrecioServicios.setText("0.0");
        jDesktopPane1.add(jTextFieldPrecioServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 190, 30));
        jDesktopPane1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 360, 10));

        jLabelPrecioServicios.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelPrecioServicios.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPrecioServicios.setText("Precio de Servicios: $");
        jDesktopPane1.add(jLabelPrecioServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, 50));

        jTextFieldComentarioCompras.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jDesktopPane1.add(jTextFieldComentarioCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 260, 60));

        jTextFieldComentarioTransporte.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jDesktopPane1.add(jTextFieldComentarioTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 260, 60));

        jLabelComentarioTransporte.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelComentarioTransporte.setForeground(new java.awt.Color(255, 255, 255));
        jLabelComentarioTransporte.setText("Comentario :");
        jDesktopPane1.add(jLabelComentarioTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, -1, 50));
        jDesktopPane1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 362, 360, 10));
        jDesktopPane1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 52, 360, 20));

        jLabelPrecioTransporte.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelPrecioTransporte.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPrecioTransporte.setText("Precio de Transporte: $");
        jDesktopPane1.add(jLabelPrecioTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, 50));

        jTextFieldPrecioTransporte.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextFieldPrecioTransporte.setText("0.0");
        jDesktopPane1.add(jTextFieldPrecioTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 190, 30));

        jLabelComentarioServicios.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelComentarioServicios.setForeground(new java.awt.Color(255, 255, 255));
        jLabelComentarioServicios.setText("Comentario :");
        jDesktopPane1.add(jLabelComentarioServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, 50));

        jTextFieldComentarioServicios.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jDesktopPane1.add(jTextFieldComentarioServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 270, 60));
        jDesktopPane1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 522, 390, 10));

        jButtonLimpiar.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButtonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 650, 110, 50));

        jButtonAgregar.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 650, 110, 50));

        jButtonVerGastos.setBackground(new java.awt.Color(0, 34, 103));
        jButtonVerGastos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonVerGastos.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVerGastos.setText("VER GASTOS");
        jButtonVerGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerGastosActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButtonVerGastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 740, 150, 50));

        jLabelFecha.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelFecha.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFecha.setText("Fecha:");
        jDesktopPane1.add(jLabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 540, 60, 40));

        jTextFieldFecha.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jDesktopPane1.add(jTextFieldFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 540, 190, 30));
        jDesktopPane1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 580, 290, -1));

        jButtonAnalytics.setBackground(new java.awt.Color(0, 34, 103));
        jButtonAnalytics.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonAnalytics.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAnalytics.setText("ANALYTICS");
        jButtonAnalytics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnalyticsActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButtonAnalytics, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 740, 150, 50));

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 780));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed

        jTextFieldPrecioCompras.setText("0.0");
        jTextFieldComentarioCompras.setText("");
        jTextFieldPrecioServicios.setText("0.0");
        jTextFieldComentarioServicios.setText("");
        jTextFieldPrecioTransporte.setText("0.0");
        jTextFieldComentarioTransporte.setText("");
        jTextFieldFecha.setText("");
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonVerGastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerGastosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVerGastosActionPerformed

    private void jButtonAnalyticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnalyticsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAnalyticsActionPerformed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        boolean flagAgregarNuevogasto = true;

        if (jTextFieldPrecioCompras.getText().equals("0.0")
                && jTextFieldPrecioServicios.getText().equals("0.0")
                && jTextFieldPrecioTransporte.getText().equals("0.0")
                && jTextFieldFecha.getText().equals("0.0")) {

            flagAgregarNuevogasto = false;

            JOptionPane.showMessageDialog(null, "HAY QUE INGRESAR AL MENOS UN GASTO  CON FECHA!");

        } else if (jTextFieldFecha.getText().equals("")
                || (  jTextFieldPrecioCompras.getText().equals("0.0")
                            && jTextFieldPrecioServicios.getText().equals("0.0")
                            && jTextFieldPrecioTransporte.getText().equals("0.0")
                            
                )) {

            flagAgregarNuevogasto = false;

            JOptionPane.showMessageDialog(null, "SE DEBE INGRESAR UNA FECHA Y UN GASTO");

        } else if (jTextFieldComentarioCompras.getText().length() > 22
                || jTextFieldComentarioServicios.getText().length() > 22
                || jTextFieldComentarioTransporte.getText().length() > 22) {

            flagAgregarNuevogasto = false;

            JOptionPane.showMessageDialog(null, "LOS COMENTARIOS NO DEBEN SUPERAR LOS 22 CARACTERES");

        } else {
            if (flagAgregarNuevogasto) {

                Gasto nuevoGasto
                        = new Gasto(
                                Float.valueOf(jTextFieldPrecioCompras.getText()),
                                jTextFieldComentarioCompras.getText(),
                                Float.valueOf(jTextFieldPrecioServicios.getText()),
                                jTextFieldComentarioServicios.getText(),
                                Float.valueOf(jTextFieldPrecioTransporte.getText()),
                                jTextFieldComentarioTransporte.getText(),
                                jTextFieldFecha.getText()
                        );

                gastoRepository.save(nuevoGasto);

                String separador = "--------------------------------------------------------------------";
                String salto="\n";

                JOptionPane.showMessageDialog(null,
                        "NUEVO GASTO AGREGADO!\n"
                        + separador
                        + "\nID:                                 " + nuevoGasto.getId()
                        + salto
                        + "\nCOMPRAS:               $" + nuevoGasto.getPrecio_compras()
                        + "\nCOMENTARIO:         " + nuevoGasto.getComentario_compras()
                        + salto
                        + "\nSERVICIOS:                $" + nuevoGasto.getPrecio_servicios()
                        + "\nCOMENTARIO:           " + nuevoGasto.getComentario_servicios()
                        + salto
                        + "\nTRANSPORTE:           $ " + nuevoGasto.getPrecio_transporte()
                        + "\nCOMENTARIO:             " + nuevoGasto.getComentario_transporte()
                        + salto
                        + "\nFECHA:                              " + nuevoGasto.getFecha() + "\n"
                        + separador
                );

            }

        }
    }//GEN-LAST:event_jButtonAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameMenuGestorGastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMenuGestorGastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMenuGestorGastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMenuGestorGastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMenuGestorGastos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonAnalytics;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonVerGastos;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabelComentarioCompras;
    private javax.swing.JLabel jLabelComentarioServicios;
    private javax.swing.JLabel jLabelComentarioTransporte;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelPrecioCompras;
    private javax.swing.JLabel jLabelPrecioServicios;
    private javax.swing.JLabel jLabelPrecioTransporte;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField jTextFieldComentarioCompras;
    private javax.swing.JTextField jTextFieldComentarioServicios;
    private javax.swing.JTextField jTextFieldComentarioTransporte;
    private javax.swing.JTextField jTextFieldFecha;
    private javax.swing.JTextField jTextFieldPrecioCompras;
    private javax.swing.JTextField jTextFieldPrecioServicios;
    private javax.swing.JTextField jTextFieldPrecioTransporte;
    // End of variables declaration//GEN-END:variables
}
