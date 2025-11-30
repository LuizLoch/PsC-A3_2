package View;

import Model.Cliente;
import DAO.ClienteDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ClienteGerTela extends javax.swing.JFrame {
    
    private final ClienteDAO dao; // DAO para manipulação de clientes
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ClienteGerTela.class.getName());

   
    public ClienteGerTela() {
        initComponents();
        this.dao = new ClienteDAO();
        carregaTabela();
// Adiciona listeners
        jTableclientes.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableclientesMouseClicked(evt);
    }
});

b_apagar.addActionListener(evt -> b_apagarActionPerformed());
        b_cancelar.addActionListener(evt -> this.dispose());
    
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableclientes = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        c_nome = new javax.swing.JTextField();
        c_email = new javax.swing.JTextField();
        c_celular = new javax.swing.JTextField();
        c_endereco = new javax.swing.JTextField();
        b_alterar = new javax.swing.JButton();
        b_apagar = new javax.swing.JButton();
        b_cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(100, 149, 237));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("Clientes");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTableclientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id Clientes", "Nome", "Email", "Celular", "Endereço"
            }
        ));
        jScrollPane1.setViewportView(jTableclientes);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(32, 32, 32));
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(32, 32, 32));
        jLabel3.setText("Email:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(32, 32, 32));
        jLabel4.setText("Celular");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(32, 32, 32));
        jLabel5.setText("Endereço:");

        c_nome.setBackground(new java.awt.Color(204, 204, 204));
        c_nome.setForeground(new java.awt.Color(32, 32, 32));

        c_email.setBackground(new java.awt.Color(204, 204, 204));
        c_email.setForeground(new java.awt.Color(32, 32, 32));

        c_celular.setBackground(new java.awt.Color(204, 204, 204));
        c_celular.setForeground(new java.awt.Color(32, 32, 32));

        c_endereco.setBackground(new java.awt.Color(204, 204, 204));
        c_endereco.setForeground(new java.awt.Color(32, 32, 32));

        b_alterar.setBackground(new java.awt.Color(204, 204, 204));
        b_alterar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b_alterar.setForeground(new java.awt.Color(32, 32, 32));
        b_alterar.setText("Alterar");
        b_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_alterarActionPerformed(evt);
            }
        });

        b_apagar.setBackground(new java.awt.Color(204, 204, 204));
        b_apagar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b_apagar.setForeground(new java.awt.Color(32, 32, 32));
        b_apagar.setText("Apagar");

        b_cancelar.setBackground(new java.awt.Color(204, 204, 204));
        b_cancelar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        b_cancelar.setForeground(new java.awt.Color(32, 32, 32));
        b_cancelar.setText("Cancelar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(c_email, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_alterar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c_endereco, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(c_celular))
                        .addGap(229, 229, 229)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b_apagar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b_cancelar, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(c_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(b_alterar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(c_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c_celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(b_apagar)
                        .addGap(34, 34, 34)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(b_cancelar))
                .addGap(0, 40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

// -------- MÉTODOS ---------
    private void jTableclientesMouseClicked(java.awt.event.MouseEvent evt) {
        if (jTableclientes.getSelectedRow() != -1) {
            c_nome.setText(jTableclientes.getValueAt(jTableclientes.getSelectedRow(), 1).toString());
            c_email.setText(jTableclientes.getValueAt(jTableclientes.getSelectedRow(), 2).toString());
            c_celular.setText(jTableclientes.getValueAt(jTableclientes.getSelectedRow(), 3).toString());
            c_endereco.setText(jTableclientes.getValueAt(jTableclientes.getSelectedRow(), 4).toString());
        }
    }

    private void b_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_alterarActionPerformed
            try {
            if (jTableclientes.getSelectedRow() == -1) {
                throw new Mensagens("Selecione um cliente para alterar.");
            }

            int id = Integer.parseInt(jTableclientes.getValueAt(jTableclientes.getSelectedRow(), 0).toString());
            String nome = c_nome.getText();
            String email = c_email.getText();
            String celular = c_celular.getText();
            String endereco = c_endereco.getText();

            if (nome.length() < 2)
                throw new Mensagens("Nome deve ter pelo menos 2 caracteres.");

            Cliente cli = new Cliente(id, nome, email, celular, endereco);

            if (dao.UpdateClienteBD(cli)) {
                JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso!"); // aqui usamos null
                limparCampos();
            }

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            carregaTabela();
        }
    }

    private void b_apagarActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            if (jTableclientes.getSelectedRow() == -1)
                throw new Mensagens("Selecione um cliente para apagar.");

            int id = Integer.parseInt(jTableclientes.getValueAt(jTableclientes.getSelectedRow(), 0).toString());
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente apagar este cliente?", "Confirmação", JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.YES_OPTION) {
                if (dao.DeleteClienteBD(id)) {
                    JOptionPane.showMessageDialog(null, "Cliente apagado com sucesso!");
                    limparCampos();
                }
            }

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            carregaTabela();
        }
    }//GEN-LAST:event_b_alterarActionPerformed
       private void b_apagarActionPerformed() {
        try {
            if (jTableclientes.getSelectedRow() == -1)
                throw new Mensagens("Selecione um cliente para apagar.");

            int id = Integer.parseInt(jTableclientes.getValueAt(jTableclientes.getSelectedRow(), 0).toString());
            int resposta = JOptionPane.showConfirmDialog(this, "Deseja realmente apagar este cliente?", "Confirmação", JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.YES_OPTION) {
                if (dao.DeleteClienteBD(id)) {
                    JOptionPane.showMessageDialog(this, "Cliente apagado com sucesso!");
                    limparCampos();
                }
            }

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        } finally {
            carregaTabela();
        }
    }

    private void limparCampos() {
        c_nome.setText("");
        c_email.setText("");
        c_celular.setText("");
        c_endereco.setText("");
    }

    private void carregaTabela() {
        DefaultTableModel modelo = (DefaultTableModel) jTableclientes.getModel();
        modelo.setRowCount(0);

        ArrayList<Cliente> lista = dao.getMinhaLista();
        for (Cliente c : lista) {
            modelo.addRow(new Object[]{
                c.getId_clientes(),
                c.getNome(),
                c.getEmail(),
                c.getCelular(),
                c.getEndereco()
            });
        }
    }
   
    
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
        java.awt.EventQueue.invokeLater(() -> new ClienteGerTela().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_alterar;
    private javax.swing.JButton b_apagar;
    private javax.swing.JButton b_cancelar;
    private javax.swing.JTextField c_celular;
    private javax.swing.JTextField c_email;
    private javax.swing.JTextField c_endereco;
    private javax.swing.JTextField c_nome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableclientes;
    // End of variables declaration//GEN-END:variables

    
        
    }

