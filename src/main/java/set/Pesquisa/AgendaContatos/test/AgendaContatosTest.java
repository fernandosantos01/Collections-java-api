package main.java.set.Pesquisa.AgendaContatos.test;

import main.java.set.Pesquisa.AgendaContatos.dominio.AgendaContatos;

public class AgendaContatosTest {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Nome 1", 1234);
        agendaContatos.adicionarContato("Nome 1", 1123);
        agendaContatos.adicionarContato("Nome 1 opi", 1123);
        agendaContatos.adicionarContato("Nome 2", 4321);
        agendaContatos.adicionarContato("Nome 3", 6789);
        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Nome 1"));

        System.out.println("Contato Atualizado " + agendaContatos.atualizarNumeroContato("Nome 1", 9537));

        agendaContatos.exibirContatos();
    }
}
