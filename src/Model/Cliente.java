package Model;

import java.util.ArrayList;
import java.sql.SQLException;
import DAO.ClienteDAO;

public class Cliente {

    // ATRIBUTOS
    private int id_clientes;
    private String nome;
    private String email;
    private String celular;
    private String endereco;

    private final ClienteDAO dao;

    // CONSTRUTOR OBJETO VAZIO
    public Cliente() {
        this.dao = new ClienteDAO();
    }
    
    // CONSTRUTOR COMPLETO
    public Cliente(int id_clientes, String nome, String email, String celular, String endereco) {
        this.id_clientes = id_clientes;
        this.nome = nome;
        this.email = email;
        this.celular = celular;
        this.endereco = endereco;
        this.dao = new ClienteDAO();
    }

    // GETTERS E SETTERS
    public int getId_clientes() {
        return id_clientes;
    }

    public void setId_clientes(int id_clientes) {
        this.id_clientes = id_clientes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // toString
    @Override
    public String toString() {
        return "\nID: " + this.id_clientes
                + "\nNome: " + this.nome
                + "\nEmail: " + this.email
                + "\nCelular: " + this.celular
                + "\nEndereço: " + this.endereco
                + "\n----------------------------";
    }

    // ===============================
    // MÉTODOS LIGADOS AO DAO
    // ===============================

    // Retorna lista de objetos Cliente
    public ArrayList getMinhaLista() {
        return dao.getMinhaLista();
    }

    // INSERIR CLIENTE
    public boolean InsertClienteBD(String nome, String email, String celular, String endereco) throws SQLException {
        int id = this.maiorID() + 1;
        Cliente obj = new Cliente(id, nome, email, celular, endereco);
        dao.InsertClienteBD(obj);
        return true;
    }

    // DELETAR CLIENTE
    public boolean DeleteClienteBD(int id_clientes) {
        dao.DeleteClienteBD(id_clientes);
        return true;
    }

    // ATUALIZAR CLIENTE
    public boolean UpdateClienteBD(int id_clientes, String nome, String email, String celular, String endereco) {
        Cliente obj = new Cliente(id_clientes, nome, email, celular, endereco);
        dao.UpdateClienteBD(obj);
        return true;
    }

    // CARREGAR CLIENTE (por ID)
    public Cliente carregaCliente(int id_clientes) {
        return dao.carregaCliente(id_clientes);
    }

    // RETORNAR MAIOR ID
    public int maiorID() throws SQLException {
        return dao.maiorID();
    }
}