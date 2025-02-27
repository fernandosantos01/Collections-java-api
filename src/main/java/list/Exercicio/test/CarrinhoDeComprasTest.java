package main.java.list.Exercicio.test;

import main.java.list.Exercicio.dominio.CarrinhoDeCompras;

public class CarrinhoDeComprasTest {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho1 = new CarrinhoDeCompras();

        carrinho1.adicionarItem("Carrinho De Controle Remoto", 12, 2);
        carrinho1.adicionarItem("Carrinho De Controle Remoto", 12, 2);
        carrinho1.adicionarItem("Carrinho", 12, 2);
        System.out.println("O valor total do carrinho: "+carrinho1.calcularValorTotal());
        carrinho1.exibirItens();
        carrinho1.removerItem("Carrinho");
        System.out.println("O valor total do carrinho: "+carrinho1.calcularValorTotal());
        System.out.println("-------------------");
        carrinho1.exibirItens();
    }
}
