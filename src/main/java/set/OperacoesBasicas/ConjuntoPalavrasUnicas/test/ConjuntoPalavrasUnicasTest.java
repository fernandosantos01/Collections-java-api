package main.java.set.OperacoesBasicas.ConjuntoPalavrasUnicas.test;

import main.java.set.OperacoesBasicas.ConjuntoPalavrasUnicas.dominio.ConjuntoPalavrasUnicas;

public class ConjuntoPalavrasUnicasTest {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("diamante");
        conjuntoPalavrasUnicas.adicionarPalavra("diamante");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        conjuntoPalavrasUnicas.adicionarPalavra("ouro");
        conjuntoPalavrasUnicas.adicionarPalavra("platina");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        conjuntoPalavrasUnicas.removerPalavra("ouro");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }
}
