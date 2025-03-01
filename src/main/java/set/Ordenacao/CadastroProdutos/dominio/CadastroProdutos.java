package main.java.set.Ordenacao.CadastroProdutos.dominio;

import java.util.*;

public class CadastroProdutos {
    Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(int codigo, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtoOrdenadoPorNome = new TreeSet<>(produtoSet);
        return produtoOrdenadoPorNome;
    }
    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosOrdenadoPorPreco =  new TreeSet<>(new ComparadorPreco());
        produtosOrdenadoPorPreco.addAll(produtoSet);
        return produtosOrdenadoPorPreco;
    }

    @Override
    public String toString() {
        return "CadastroProdutos{" +
                "produtoSet=" + produtoSet +
                '}';
    }
}
class ComparadorPreco implements Comparator<Produto>{

    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}
