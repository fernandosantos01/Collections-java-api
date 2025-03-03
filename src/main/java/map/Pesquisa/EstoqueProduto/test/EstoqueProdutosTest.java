package main.java.map.Pesquisa.EstoqueProduto.test;

import main.java.map.Pesquisa.EstoqueProduto.dominio.EstoqueProdutos;

public class EstoqueProdutosTest {
    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.exibirProdutos();

        estoqueProdutos.adicionarProduto(12L, "Produto 1", 10, 2d);
        estoqueProdutos.adicionarProduto(12L, "Produto 2", 1, 2d);
        estoqueProdutos.adicionarProduto(17L, "Produto 3", 13, 5d);
        estoqueProdutos.adicionarProduto(15L, "Produto 4", 1, 10d);
        estoqueProdutos.adicionarProduto(19L, "Produto 5", 3, 23d);
        estoqueProdutos.adicionarProduto(21L, "Produto 6", 5, 5d);
        estoqueProdutos.adicionarProduto(2L, "Produto 7", 9, 7d);

        estoqueProdutos.exibirProdutos();

        System.out.println("Valor Total em Estoque: R$" + estoqueProdutos.calculaValorTotalEstoque());

        System.out.println("Produto Mais Barato: " + estoqueProdutos.obterProdutoMaisBarato().getNome());

        System.out.println("Produto Mais Caro: " + estoqueProdutos.obterProdutoMaisCaro().getNome());

        System.out.println("Produto mais caro(Produto*Quantidade): " + estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }
}
