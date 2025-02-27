package main.java.list.OperacoesBasicas.test;

import main.java.list.OperacoesBasicas.dominio.ListaTarefas;

public class ListaTarefasTest {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println("O numero Total de Elementos: " + listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        System.out.println("O numero Total de Elementos: " + listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.removerTarefa("tarefa 2");
        System.out.println("O numero Total de Elementos: " + listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.obterDescricoesTarefas();
    }
}
