package main.java.map.OperacoesBasicas.AgendaContatos.test;

import main.java.map.OperacoesBasicas.AgendaContatos.dominio.AgendaContatos;

public class AgendaContatosTest {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();
        agendaContatos.adicionarContato("Nome 1", 1234);
        agendaContatos.adicionarContato("Nome 1", 4321);
        agendaContatos.adicionarContato("Nome 2", 1233);
        agendaContatos.adicionarContato("Nome 4", 1333);
        agendaContatos.adicionarContato("Nome 3", 1444);
        agendaContatos.exibirContatos();

        System.out.println("Resultado do numero pesquisado: " + agendaContatos.pesquisarPorNome("Nome 3"));

        System.out.println("Contato Removido: " + agendaContatos.removerContato("Nome 2"));
        agendaContatos.exibirContatos();
    }
}
