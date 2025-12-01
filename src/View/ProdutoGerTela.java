package View;

import Model.Produto;
import DAO.ProdutoDAO;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ProdutoGerTela extends javax.swing.JFrame {
    
    private final ProdutoDAO dao;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ProdutoGerTela.class.getName());

    public ProdutoGerTela() {
        initComponents();
        this.dao = new ProdutoDAO();
        carregaTabela();
        
        jTableProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProdutosMouseClicked(evt);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProdutos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        c_nome = new javax.swing.JTextField();
        c_descricao = new javax.swing.JTextField();
        c_estoque = new javax.swing.JTextField();
        c_preco = new javax.swing.JTextField();
        b_alterar = new javax.swing.JButton();
        b_apagar = new javax.swing.JButton();
        b_cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(100, 149, 237));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("Gerenciar Produtos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(196, 196, 196))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "ID", "Nome", "Descrição", "Estoque", "Preço"
            }
        ));
        jScrollPane1.setViewportView(jTableProdutos);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(32, 32, 32));
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(32, 32, 32));
        jLabel3.setText("Descrição:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(32, 32, 32));
        jLabel4.setText("Estoque:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(32, 32, 32));
        jLabel5.setText("Preço:");

        c_nome.setBackground(new java.awt.Color(204, 204, 204));
        c_descricao.setBackground(new java.awt.Color(204, 204, 204));
        c_estoque.setBackground(new java.awt.Color(204, 204, 204));
        c_preco.setBackground(new java.awt.Color(204, 204, 204));

        b_alterar.setBackground(new java.awt.Color(204, 204, 204));
        b_alterar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b_alterar.setText("Alterar");
        b_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_alterarActionPerformed(evt);
            }
        });

        b_apagar.setBackground(new java.awt.Color(204, 204, 204));
        b_apagar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b_apagar.setText("Apagar");
        b_apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_apagarActionPerformed(evt);
            }
        });

        b_cancelar.setBackground(new java.awt.Color(204, 204, 204));
        b_cancelar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        b_cancelar.setText("Cancelar");
        b_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelarActionPerformed(evt);
            }
        });

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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(c_nome, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(c_descricao)
                            .addComponent(c_estoque)
                            .addComponent(c_preco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(b_alterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b_apagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(c_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_alterar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(c_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_apagar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(c_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_cancelar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(c_preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void jTableProdutosMouseClicked(java.awt.event.MouseEvent evt) {
        if (jTableProdutos.getSelectedRow() != -1) {
            c_nome.setText(jTableProdutos.getValueAt(jTableProdutos.getSelectedRow(), 1).toString());
            c_descricao.setText(jTableProdutos.getValueAt(jTableProdutos.getSelectedRow(), 2).toString());
            c_estoque.setText(jTableProdutos.getValueAt(jTableProdutos.getSelectedRow(), 3).toString());
            c_preco.setText(jTableProdutos.getValueAt(jTableProdutos.getSelectedRow(), 4).toString());
        }
    }

    private void b_alterarActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            if (jTableProdutos.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "Selecione um produto para alterar.");
                return;
            }

            int id = Integer.parseInt(jTableProdutos.getValueAt(jTableProdutos.getSelectedRow(), 0).toString());
            String nome = c_nome.getText();
            String descricao = c_descricao.getText();
            int estoque = Integer.parseInt(c_estoque.getText());
            double preco = Double.parseDouble(c_preco.getText());
            Date data = new Date(); // Mantém data atual na alteração ou poderia buscar a original

            Produto p = new Produto(id, nome, descricao, estoque, preco, data);

            if (dao.UpdateProdutoBD(p)) {
                JOptionPane.showMessageDialog(null, "Produto alterado com sucesso!");
                limparCampos();
                carregaTabela();
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Verifique os campos numéricos.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }

    private void b_apagarActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            if (jTableProdutos.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "Selecione um produto para apagar.");
                return;
            }

            int id = Integer.parseInt(jTableProdutos.getValueAt(jTableProdutos.getSelectedRow(), 0).toString());
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente apagar este produto?", "Confirmação", JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.YES_OPTION) {
                if (dao.DeleteProdutoBD(id)) {
                    JOptionPane.showMessageDialog(null, "Produto apagado com sucesso!");
                    limparCampos();
                    carregaTabela();
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }

    private void limparCampos() {
        c_nome.setText("");
        c_descricao.setText("");
        c_estoque.setText("");
        c_preco.setText("");
    }

    private void carregaTabela() {
        DefaultTableModel modelo = (DefaultTableModel) jTableProdutos.getModel();
        modelo.setRowCount(0);

        ArrayList<Produto> lista = dao.getMinhaLista();
        for (Produto p : lista) {
            modelo.addRow(new Object[]{
                p.getId(),
                p.getNome(),
                p.getDescricao(),
                p.getEstoque(),
                p.getPreco()
            });
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new ProdutoGerTela().setVisible(true));
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton b_alterar;
    private javax.swing.JButton b_apagar;
    private javax.swing.JButton b_cancelar;
    private javax.swing.JTextField c_descricao;
    private javax.swing.JTextField c_estoque;
    private javax.swing.JTextField c_nome;
    private javax.swing.JTextField c_preco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProdutos;
    // End of variables declaration                   
}
