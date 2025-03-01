package main.java.set.Ordenacao.CadastroProdutos.test;

import main.java.set.Ordenacao.CadastroProdutos.dominio.CadastroProdutos;

public class CadastroProdutosTest {
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto(10, "Produto 1", 29.90, 12);
        cadastroProdutos.adicionarProduto(10, "Produto 2", 99.90, 2);
        cadastroProdutos.adicionarProduto(11, "Produto 4", 9.90, 52);
        cadastroProdutos.adicionarProduto(12, "Produto 3", 35.90, 23);
        cadastroProdutos.adicionarProduto(13, "Produto 5", 56.90, 5);

        System.out.println(cadastroProdutos);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println("--------------------------------------");
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
        System.out.println("---------------------------------------");


    }
}
