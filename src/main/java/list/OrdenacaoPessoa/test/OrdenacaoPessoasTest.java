package main.java.list.OrdenacaoPessoa.test;

import main.java.list.OrdenacaoPessoa.dominio.OrdenacaoPessoas;

public class OrdenacaoPessoasTest {
    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Nome1", 18, 1.20);
        ordenacaoPessoas.adicionarPessoa("Nome2", 20, 2.20);
        ordenacaoPessoas.adicionarPessoa("Nome3", 15, 1.75);
        ordenacaoPessoas.adicionarPessoa("Nome4", 12, 1.30);

        System.out.println(ordenacaoPessoas);
//        System.out.println("--------------------");
//        System.out.println(ordenacaoPessoas.ordenacaoPorAltura());
        System.out.println("------------------------");
        System.out.println(ordenacaoPessoas.ordenacaoPorIdade());

    }
}
