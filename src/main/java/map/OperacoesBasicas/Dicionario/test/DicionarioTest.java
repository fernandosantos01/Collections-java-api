package main.java.map.OperacoesBasicas.Dicionario.test;

import main.java.map.OperacoesBasicas.Dicionario.dominio.Dicionario;

public class DicionarioTest {
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.exibirPalavras();

        dicionario.adicionarPalavra("Palavra 1", "Blablabla");
        dicionario.adicionarPalavra("Palavra 1", "Definição 2");
        dicionario.adicionarPalavra("Palavra 3", "Definição 3");
        dicionario.adicionarPalavra("Palavra 7", "Definição 4");
        dicionario.adicionarPalavra("Palavra 2", "Definição 5");
        dicionario.adicionarPalavra("Palavra 4", "Definição 6");

        dicionario.exibirPalavras();

        System.out.println("Resultado da Pesquisa: " + dicionario.pesquisarPorPalavra("Palavra 4"));

        System.out.println("A palavra foi removida: " + dicionario.removerPalavra("Palavra 2"));
        dicionario.exibirPalavras();
    }
}
