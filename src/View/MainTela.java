
package View;


public class MainTela extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MainTela.class.getName());

    
    public MainTela() {
        initComponents();
        setExtendedState (MainTela.MAXIMIZED_BOTH) ;
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        b_cliente = new javax.swing.JButton();
        b_produto = new javax.swing.JButton();
        b_pedidos = new javax.swing.JButton();
        b_inventario = new javax.swing.JButton();
        b_dashboard = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(0, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(150, 150));

        b_cliente.setBackground(new java.awt.Color(204, 204, 204));
        b_cliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        b_cliente.setForeground(new java.awt.Color(32, 32, 32));
        b_cliente.setText("Cliente");
        b_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_clienteActionPerformed(evt);
            }
        });

        b_produto.setBackground(new java.awt.Color(204, 204, 204));
        b_produto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        b_produto.setForeground(new java.awt.Color(32, 32, 32));
        b_produto.setText("Produto");
        b_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_produtoActionPerformed(evt);
            }
        });

        b_pedidos.setBackground(new java.awt.Color(204, 204, 204));
        b_pedidos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        b_pedidos.setForeground(new java.awt.Color(32, 32, 32));
        b_pedidos.setText("Pedidos");
        b_pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_pedidosActionPerformed(evt);
            }
        });

        b_inventario.setBackground(new java.awt.Color(204, 204, 204));
        b_inventario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        b_inventario.setForeground(new java.awt.Color(32, 32, 32));
        b_inventario.setText("Inventário");
        b_inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_inventarioActionPerformed(evt);
            }
        });

        b_dashboard.setBackground(new java.awt.Color(204, 204, 204));
        b_dashboard.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        b_dashboard.setForeground(new java.awt.Color(32, 32, 32));
        b_dashboard.setText("Dashboard");
        b_dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_dashboardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_produto, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(b_pedidos, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(b_inventario, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(b_dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(b_cliente)
                .addGap(33, 33, 33)
                .addComponent(b_produto)
                .addGap(32, 32, 32)
                .addComponent(b_pedidos)
                .addGap(39, 39, 39)
                .addComponent(b_inventario)
                .addGap(30, 30, 30)
                .addComponent(b_dashboard)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 650, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(100, 149, 237));

        jLabel2.setBackground(new java.awt.Color(100, 149, 237));
        jLabel2.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Sistema de gestão da loja");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_inventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_inventarioActionPerformed

    private void b_dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_dashboardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_dashboardActionPerformed

    private void b_pedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_pedidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_pedidosActionPerformed

    private void b_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_produtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_produtoActionPerformed

    private void b_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_clienteActionPerformed
        // Cria uma instância da tela de escolha de cliente
    ClienteEscTela telaCliente = new ClienteEscTela();
    
    // Exibe a nova tela
    telaCliente.setVisible(true);
    }//GEN-LAST:event_b_clienteActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new MainTela().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_cliente;
    private javax.swing.JButton b_dashboard;
    private javax.swing.JButton b_inventario;
    private javax.swing.JButton b_pedidos;
    private javax.swing.JButton b_produto;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
