package main.java.set.OperacoesBasicas.ConjutoConvidados.test;

import main.java.set.OperacoesBasicas.ConjutoConvidados.dominio.ConjuntoConvidados;

public class ConjutoConvidadosTest {
    public static void main(String[] args) {
        ConjuntoConvidados convidados = new ConjuntoConvidados();

        System.out.println("Existem " + convidados.contarConvidados() + " convidados(s) na lista");
        convidados.adicionarConvidado("Nome1", 1234);
        convidados.adicionarConvidado("Nome2", 1234);
        convidados.adicionarConvidado("Nome3", 1235);
        convidados.adicionarConvidado("Nome4", 1236);
        System.out.println("Existem " + convidados.contarConvidados() + " convidados(s) na lista");
        convidados.removerConvidadoPorCodigoConvite(1234);
        System.out.println("Existem " + convidados.contarConvidados() + " convidados(s) na lista");

        convidados.exibirConvidados();
    }
}
