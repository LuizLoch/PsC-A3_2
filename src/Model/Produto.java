package Model;

import java.util.Date;
import java.util.*;
import DAO.ProdutoDAO;
import java.sql.SQLException;

public class Produto {

    // Atributos
    private int id;
    private String nome;
    private String descricao;
    private int estoque;
    private double preco;
    private Date dataCadastro;

    private final ProdutoDAO dao;

    // Construtor padrão
    public Produto() {
        this.dao = new ProdutoDAO();
    }

    // Construtor com atributos
    public Produto(int id, String nome, String descricao, int estoque, double preco, Date dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.estoque = estoque;
        this.preco = preco;
        this.dataCadastro = dataCadastro;

        this.dao = new ProdutoDAO();
    }

    // GETTERS E SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override
    public String toString() {
        return "\n ID: " + this.getId()
                + "\n Nome: " + this.getNome()
                + "\n Descrição: " + this.getDescricao()
                + "\n Estoque: " + this.getEstoque()
                + "\n Preço: " + this.getPreco()
                + "\n Data Cadastro: " + this.getDataCadastro()
                + "\n -----------";
    }

    /*
        MÉTODOS EM CAMADAS QUE USAM O DAO
    */

    // Retorna lista de produtos
    public ArrayList<Produto> getMinhaLista() {
        return dao.getMinhaLista();
    }

    // Cadastrar novo produto
    public boolean InsertProdutoBD(int id, String nome, String descricao, int estoque, double preco, Date dataCadastro) throws SQLException {
        // ID não é auto-increment, precisa ser fornecido
        Produto p = new Produto(id, nome, descricao, estoque, preco, dataCadastro);
        dao.InsertProdutoBD(p);
        return true;
    }

    // Deletar produto por ID
    public boolean DeleteProdutoBD(int id) {
        dao.DeleteProdutoBD(id);
        return true;
    }

    // Atualizar produto
    public boolean UpdateProdutoBD(int id, String nome, String descricao, int estoque, double preco, Date dataCadastro) {
        Produto p = new Produto(id, nome, descricao, estoque, preco, dataCadastro);
        dao.UpdateProdutoBD(p);
        return true;
    }

    // Carregar 1 produto pelo ID
    public Produto carregaProduto(int id) {
        return dao.carregaProduto(id);
    }

    // Retorna maior ID do banco
    public int maiorID() throws SQLException {
        return dao.maiorID();
    }

}