package main.java.set.Ordenacao.ListaDeAlunos.test;

import main.java.set.Ordenacao.ListaDeAlunos.dominio.GerenciadorAlunos;

public class GerenciadoAlunosTest {
    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Nome1", 1L, 8);
        gerenciadorAlunos.adicionarAluno("Nome2", 1L, 8);
        gerenciadorAlunos.adicionarAluno("Nome5", 2L, 7);
        gerenciadorAlunos.adicionarAluno("Nome3", 4L, 9.9);
        gerenciadorAlunos.adicionarAluno("Nome4", 3L, 5.7);

        gerenciadorAlunos.exibirAlunos();

        gerenciadorAlunos.removerAluno(1L);
        gerenciadorAlunos.exibirAlunos();

        System.out.println("Lista de Alunos Ordenados por nome\n" + gerenciadorAlunos.exibirAlunosPorNome());


        System.out.println("Lista de Alunos Ordenados por Media\n" + gerenciadorAlunos.exibirAlunosPorNota());
    }
}
