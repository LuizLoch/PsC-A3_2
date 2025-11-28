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



    // Construtor padrão
    public Produto() {
        
    }

    // Construtor com atributos
    public Produto(int id, String nome, String descricao, int estoque, double preco, Date dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.estoque = estoque;
        this.preco = preco;
        this.dataCadastro = dataCadastro;

        
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
        (Mesmo padrão que você usava em Aluno.java)
    */

}
