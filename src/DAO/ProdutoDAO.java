package DAO;

import Model.Produto;
import java.util.ArrayList;

public class ProdutoDAO {

    // “Banco de dados” em memória
    private static ArrayList<Produto> minhaLista = new ArrayList<>();

    public ProdutoDAO() {}

    // Retorna o maior ID já cadastrado
    public int maiorID() {
        int maiorID = 0;

        for (Produto p : minhaLista) {
            if (p.getId() > maiorID) {
                maiorID = p.getId();
            }
        }

        return maiorID;
    }

    // Retorna a lista completa
    public ArrayList<Produto> getMinhaLista() {
        return minhaLista;
    }

    // Insere um novo produto
    public boolean insertProduto(Produto objeto) {
        minhaLista.add(objeto);
        return true;
    }

    // Deleta um produto pelo ID
    public boolean deleteProduto(int id) {
        minhaLista.removeIf(p -> p.getId() == id);
        return true;
    }

    // Atualiza um produto
    public boolean updateProduto(Produto objeto) {

        for (int i = 0; i < minhaLista.size(); i++) {
            if (minhaLista.get(i).getId() == objeto.getId()) {
                minhaLista.set(i, objeto);
                return true;
            }
        }

        return false;
    }

    // Carrega um produto específico
    public Produto carregaProduto(int id) {
        for (Produto p : minhaLista) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }
}