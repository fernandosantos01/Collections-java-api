package main.java.set.Pesquisa.ListaTarefas.test;

import main.java.set.Pesquisa.ListaTarefas.dominio.ListaTarefas;

public class ListarTarefasTest {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Tarefa 01");
        listaTarefas.adicionarTarefa("Tarefa 01");
        listaTarefas.adicionarTarefa("Tarefa 02");
        listaTarefas.adicionarTarefa("Tarefa 03");
        listaTarefas.adicionarTarefa("Tarefa 04");
        listaTarefas.adicionarTarefa("Tarefa 05");

        System.out.println("Quantidade de Tarefas: " + listaTarefas.contarTarefas());

        listaTarefas.exibirTarefas();

        listaTarefas.marcarTarefaConcluida("Tarefa 02");
        listaTarefas.marcarTarefaConcluida("Tarefa 03");
        listaTarefas.marcarTarefaConcluida("Tarefa 04");

        listaTarefas.exibirTarefas();

        System.out.println("As Tarefas pendentes são: " + listaTarefas.obterTarefasPendentes());
        System.out.println("As Tarefas concluidas são: " + listaTarefas.obterTarefasConcluidas());

        listaTarefas.removerTarefa("Tarefa 03");
        listaTarefas.exibirTarefas();

        listaTarefas.marcarTarefaPendente("Tarefa 02");
        listaTarefas.exibirTarefas();

        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();

    }
}
