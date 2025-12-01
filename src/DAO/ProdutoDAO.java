package DAO;

import Model.Produto;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProdutoDAO {

    // Lista cache (opcional)
    public static ArrayList<Produto> MinhaLista = new ArrayList<>();

    // Configurações do banco
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String SERVER = "localhost";
    private static final String DATABASE = "db_produtos";
    private static final String URL = "jdbc:mysql://" + SERVER + ":3306/" + DATABASE + "?useTimezone=true&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "bcd127";

    public ProdutoDAO() {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Driver JDBC não encontrado!");
            e.printStackTrace();
        }
    }

    // Conexão com o banco
    public Connection getConexao() {
        try {
            Connection con = DriverManager.getConnection(URL, USER, PASS);
            if (con != null) {
                System.out.println("Status: Conectado!");
            } else {
                System.out.println("Status: NÃO CONECTADO!");
            }
            return con;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    // Retorna o maior ID já cadastrado
    public int maiorID() {
        String sql = "SELECT MAX(id) AS id FROM tb_produtos";
        try (Connection con = getConexao();
             Statement stmt = con != null ? con.createStatement() : null;
             ResultSet rs = stmt != null ? stmt.executeQuery(sql) : null) {

            if (rs != null && rs.next()) {
                return rs.getInt("id");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar maior ID: " + e.getMessage());
            e.printStackTrace();
        }
        return 0;
    }

    // Retorna a lista completa
    public ArrayList<Produto> getMinhaLista() {
        MinhaLista.clear();
        String sql = "SELECT * FROM tb_produtos";

        try (Connection con = getConexao();
             Statement stmt = con != null ? con.createStatement() : null;
             ResultSet rs = stmt != null ? stmt.executeQuery(sql) : null) {

            if (rs != null) {
                while (rs.next()) {
                    Produto p = new Produto(
                            rs.getInt("id"),
                            rs.getString("nome"),
                            rs.getString("descricao"),
                            rs.getInt("estoque"),
                            rs.getDouble("preco"),
                            rs.getDate("data_cadastro")
                    );
                    MinhaLista.add(p);
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar produtos: " + e.getMessage());
            e.printStackTrace();
        }

        return MinhaLista;
    }

    // Insere um novo produto
    public boolean InsertProdutoBD(Produto p) {
        // Inclui o ID pois não é AUTO_INCREMENT no banco
        String sql = "INSERT INTO tb_produtos(id, nome, descricao, estoque, preco, data_cadastro) VALUES(?,?,?,?,?,?)";

        try (Connection con = getConexao();
             PreparedStatement stmt = con != null ? con.prepareStatement(sql) : null) {

            if (stmt == null) return false;

            stmt.setInt(1, p.getId());
            stmt.setString(2, p.getNome());
            stmt.setString(3, p.getDescricao());
            stmt.setInt(4, p.getEstoque());
            stmt.setDouble(5, p.getPreco());
            stmt.setDate(6, new java.sql.Date(p.getDataCadastro().getTime()));

            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir produto: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    // Deleta um produto pelo ID
    public boolean DeleteProdutoBD(int id) {
        String sql = "DELETE FROM tb_produtos WHERE id = ?";
        try (Connection con = getConexao();
             PreparedStatement stmt = con != null ? con.prepareStatement(sql) : null) {

            if (stmt == null) return false;

            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar produto: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    // Atualiza um produto
    public boolean UpdateProdutoBD(Produto p) {
        String sql = "UPDATE tb_produtos SET nome = ?, descricao = ?, estoque = ?, preco = ?, data_cadastro = ? WHERE id = ?";

        try (Connection con = getConexao();
             PreparedStatement stmt = con != null ? con.prepareStatement(sql) : null) {

            if (stmt == null) return false;

            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getDescricao());
            stmt.setInt(3, p.getEstoque());
            stmt.setDouble(4, p.getPreco());
            stmt.setDate(5, new java.sql.Date(p.getDataCadastro().getTime()));
            stmt.setInt(6, p.getId());

            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar produto: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    // Carrega um produto específico
    public Produto carregaProduto(int id) {
        Produto produto = new Produto();
        produto.setId(id);

        String sql = "SELECT * FROM tb_produtos WHERE id = ?";

        try (Connection con = getConexao();
             PreparedStatement stmt = con != null ? con.prepareStatement(sql) : null) {

            if (stmt == null) return produto;

            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    produto.setNome(rs.getString("nome"));
                    produto.setDescricao(rs.getString("descricao"));
                    produto.setEstoque(rs.getInt("estoque"));
                    produto.setPreco(rs.getDouble("preco"));
                    produto.setDataCadastro(rs.getDate("data_cadastro"));
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar produto: " + e.getMessage());
            e.printStackTrace();
        }

        return produto;
    }
}