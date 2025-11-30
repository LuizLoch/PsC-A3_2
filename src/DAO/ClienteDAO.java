package DAO;

import Model.Cliente;
import java.util.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class ClienteDAO {

    // Lista cache (opcional)
    public static ArrayList<Cliente> MinhaLista = new ArrayList<>();

    // Configurações do banco
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String SERVER = "localhost";
    private static final String DATABASE = "db_produtos"; // ajuste conforme necessário
    private static final String URL = "jdbc:mysql://" + SERVER + ":3306/" + DATABASE + "?useTimezone=true&serverTimezone=UTC";
    private static final String USER = "root"; // seu usuário
    private static final String PASS = "bcd127"; // sua senha

    public ClienteDAO() {
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

    // Retorna o maior ID
    public int maiorID() {
        String sql = "SELECT MAX(id_clientes) AS id FROM tb_clientes";
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

    // Lista todos os clientes
    public ArrayList<Cliente> getMinhaLista() {
        MinhaLista.clear();
        String sql = "SELECT * FROM tb_clientes";

        try (Connection con = getConexao();
             Statement stmt = con != null ? con.createStatement() : null;
             ResultSet rs = stmt != null ? stmt.executeQuery(sql) : null) {

            if (rs != null) {
                while (rs.next()) {
                    Cliente c = new Cliente(
                            rs.getInt("id_clientes"),
                            rs.getString("nome"),
                            rs.getString("email"),
                            rs.getString("celular"),
                            rs.getString("endereco")
                    );
                    MinhaLista.add(c);
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar clientes: " + e.getMessage());
            e.printStackTrace();
        }

        return MinhaLista;
    }

    // Inserir cliente
    public boolean InsertClienteBD(Cliente c) {
        String sql = "INSERT INTO tb_clientes(id_clientes, nome, email, celular, endereco) VALUES(?,?,?,?,?)";

        try (Connection con = getConexao();
             PreparedStatement stmt = con != null ? con.prepareStatement(sql) : null) {

            if (stmt == null) return false;

            stmt.setInt(1, c.getId_clientes());
            stmt.setString(2, c.getNome());
            stmt.setString(3, c.getEmail());
            stmt.setString(4, c.getCelular());
            stmt.setString(5, c.getEndereco());

            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir cliente: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    // Atualizar cliente
    public boolean UpdateClienteBD(Cliente c) {
        String sql = "UPDATE tb_clientes SET nome = ?, email = ?, celular = ?, endereco = ? WHERE id_clientes = ?";

        try (Connection con = getConexao();
             PreparedStatement stmt = con != null ? con.prepareStatement(sql) : null) {

            if (stmt == null) return false;

            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getEmail());
            stmt.setString(3, c.getCelular());
            stmt.setString(4, c.getEndereco());
            stmt.setInt(5, c.getId_clientes());

            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar cliente: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    // Deletar cliente
    public boolean DeleteClienteBD(int id) {
        String sql = "DELETE FROM tb_clientes WHERE id_clientes = ?";
        try (Connection con = getConexao();
             PreparedStatement stmt = con != null ? con.prepareStatement(sql) : null) {

            if (stmt == null) return false;

            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar cliente: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    // Carregar cliente por ID
    public Cliente carregaCliente(int id) {
        Cliente cliente = new Cliente();
        cliente.setId_clientes(id);

        String sql = "SELECT * FROM tb_clientes WHERE id_clientes = ?";

        try (Connection con = getConexao();
             PreparedStatement stmt = con != null ? con.prepareStatement(sql) : null) {

            if (stmt == null) return cliente;

            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    cliente.setNome(rs.getString("nome"));
                    cliente.setEmail(rs.getString("email"));
                    cliente.setCelular(rs.getString("celular"));
                    cliente.setEndereco(rs.getString("endereco"));
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar cliente: " + e.getMessage());
            e.printStackTrace();
        }

        return cliente;
    }
}