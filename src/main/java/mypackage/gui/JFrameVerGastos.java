/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage.gui;

import java.util.List;
import javax.swing.JOptionPane;
import mypackage.connector.LocalConnector;
import mypackage.repositories.interfaces.I_GastoRepository;
import mypackage.repositories.jdbc.GastoRepository;
import mypackage.utils.swing.Table;

/**
 *
 * @author andre
 */
public class JFrameVerGastos extends javax.swing.JFrame {

    private I_GastoRepository gastoRepository = new GastoRepository(LocalConnector.getLocalConnection());

    /** Creates new form JFrameMenuVesrGastos */
    public JFrameVerGastos() {
        initComponents();
        listarGastos();
        
    }

    public void listarGastos() {

        new Table().cargar(jTableListaGastos, gastoRepository.getAll());
    }
    
    public  double total(){
        float sum=0;
        try {
             for(int i=0; i<jTableListaGastos.getRowCount(); i++){
            sum +=Float.parseFloat(jTableListaGastos.getValueAt(i,1).toString());
        }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
       
        return sum;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListaGastos = new javax.swing.JTable();
        jButtonEliminar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jLabelBusqueda = new javax.swing.JLabel();
        jTextFieldBusquedaGastos = new javax.swing.JTextField();
        jComboBoxBusquedaGastos = new javax.swing.JComboBox<>();
        jButtonRefrescarLista = new javax.swing.JButton();
        jButtonAnalytics = new javax.swing.JButton();
        jTextFieldTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabelTitulo.setFont(new java.awt.Font("Arial Black", 1, 28)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("LISTA DE GASTOS");

        jTableListaGastos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N
        jTableListaGastos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTableListaGastos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableListaGastos.setToolTipText("");
        jScrollPane1.setViewportView(jTableListaGastos);

        jButtonEliminar.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButtonEliminar.setText("ELIMINAR");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonActualizar.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButtonActualizar.setText("ACTUALIZAR");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jLabelBusqueda.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabelBusqueda.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBusqueda.setText("Buscar por :");

        jTextFieldBusquedaGastos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextFieldBusquedaGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBusquedaGastosActionPerformed(evt);
            }
        });
        jTextFieldBusquedaGastos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldBusquedaGastosKeyReleased(evt);
            }
        });

        jComboBoxBusquedaGastos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jComboBoxBusquedaGastos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "ID", "PRECIO DE COMPRAS", "COMENTARIO DE COMPRAS", "PRECIO DE SERVICIOS", "COMENTARIO DE SERVICIOS", "PRECIO DE TRANSPORTE", "COMENTARIO DE TRANSPORTE", "FECHA" }));

        jButtonRefrescarLista.setBackground(new java.awt.Color(0, 34, 103));
        jButtonRefrescarLista.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonRefrescarLista.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRefrescarLista.setText("REFRESCAR LISTA");
        jButtonRefrescarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefrescarListaActionPerformed(evt);
            }
        });

        jButtonAnalytics.setBackground(new java.awt.Color(0, 34, 103));
        jButtonAnalytics.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonAnalytics.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAnalytics.setText("ANALYTICS");
        jButtonAnalytics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnalyticsActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabelTitulo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButtonEliminar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButtonActualizar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabelBusqueda, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextFieldBusquedaGastos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jComboBoxBusquedaGastos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButtonRefrescarLista, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButtonAnalytics, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextFieldTotal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelBusqueda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxBusquedaGastos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jTextFieldBusquedaGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(431, 431, 431)
                        .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelTitulo)
                        .addGap(361, 361, 361))))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButtonAnalytics, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(jButtonActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145)
                .addComponent(jButtonRefrescarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelBusqueda, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jComboBoxBusquedaGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldBusquedaGastos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jButtonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(14, 14, 14))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonRefrescarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonAnalytics, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed

        
        int filaTablaGasto=jTableListaGastos.getSelectedRow();
       
        
        if(filaTablaGasto == -1){
              
            JOptionPane.showMessageDialog(this, "SELECCIONE ALGUN GASTO QUE DESEE ELIMINAR DE LA LISTA!");
          
            return;
        }
        
        int idGasto=(int)jTableListaGastos.getValueAt(filaTablaGasto, 0);
        
        
        if(JOptionPane.showConfirmDialog(this, "ESTA POR ELIMINAR EL GASTO CON EL ID "+idGasto+"!!")!=0){
          
            return;
            
        }
        
         gastoRepository.remove( gastoRepository.getById(idGasto));
         
           listarGastos();

    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
         new JFrameActualizarGastos().setVisible(true);
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jTextFieldBusquedaGastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBusquedaGastosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBusquedaGastosActionPerformed

    private void jTextFieldBusquedaGastosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBusquedaGastosKeyReleased

        if (jComboBoxBusquedaGastos.getSelectedItem().equals("ID")) {
            
            new Table().cargar(jTableListaGastos, gastoRepository.getLikeId(jTextFieldBusquedaGastos.getText()));

        } else if (jComboBoxBusquedaGastos.getSelectedItem().equals("PRECIO DE COMPRAS")) {

            new Table().cargar(jTableListaGastos, gastoRepository.getLikePrecioCompras(jTextFieldBusquedaGastos.getText()));

        } else if (jComboBoxBusquedaGastos.getSelectedItem().equals("COMENTARIO DE COMPRAS")) {

            new Table().cargar(jTableListaGastos, gastoRepository.getLikeComentarioCompras(jTextFieldBusquedaGastos.getText()));

        } else if (jComboBoxBusquedaGastos.getSelectedItem().equals("PRECIO DE SERVICIOS")) {

            new Table().cargar(jTableListaGastos, gastoRepository.getLikePrecioServicios(jTextFieldBusquedaGastos.getText()));

        } else if (jComboBoxBusquedaGastos.getSelectedItem().equals("COMENTARIO DE SERVICIOS")) {

            new Table().cargar(jTableListaGastos, gastoRepository.getLikeComentarioServicios(jTextFieldBusquedaGastos.getText()));

        } else if (jComboBoxBusquedaGastos.getSelectedItem().equals("PRECIO DE TRANSPORTE")) {

            new Table().cargar(jTableListaGastos, gastoRepository.getLikePrecioTransporte(jTextFieldBusquedaGastos.getText()));

        } else if (jComboBoxBusquedaGastos.getSelectedItem().equals("COMENTARIO DE TRANSPORTE")) {

            new Table().cargar(jTableListaGastos, gastoRepository.getLikeComentarioTransporte(jTextFieldBusquedaGastos.getText()));

        } else if (jComboBoxBusquedaGastos.getSelectedItem().equals("FECHA")) {

            new Table().cargar(jTableListaGastos, gastoRepository.getLikeFecha(jTextFieldBusquedaGastos.getText()));

        } 
        
        

    }//GEN-LAST:event_jTextFieldBusquedaGastosKeyReleased

    private void jButtonRefrescarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefrescarListaActionPerformed
      
        new Table().cargar(jTableListaGastos, gastoRepository.getAll());
    }//GEN-LAST:event_jButtonRefrescarListaActionPerformed

    private void jButtonAnalyticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnalyticsActionPerformed
       new JFrameAnalytics().setVisible(true);
       
        //Enviamos lso datos al jframe de analytics
        //IMPORTANTE-->EL JTEXTFIELD DEL OTRO JFRAME DEBERA ESTAR EN PUBLIC Y STATIC
        JFrameAnalytics.jTextFieldTotalCompras.setText(String.valueOf(total()));
    }//GEN-LAST:event_jButtonAnalyticsActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameVerGastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameVerGastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameVerGastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameVerGastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameVerGastos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonAnalytics;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonRefrescarLista;
    private javax.swing.JComboBox<String> jComboBoxBusquedaGastos;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabelBusqueda;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListaGastos;
    private javax.swing.JTextField jTextFieldBusquedaGastos;
    private javax.swing.JTextField jTextFieldTotal;
    // End of variables declaration//GEN-END:variables
}
