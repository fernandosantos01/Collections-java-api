package main.java.set.Ordenacao.ListaDeAlunos.dominio;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        Aluno alunoParaRemover = null;

        for (Aluno a : alunoSet) {
            if (a.getMatricula() == matricula) {
                alunoParaRemover = a;
                break;
            }
        }
        alunoSet.remove(alunoParaRemover);
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosOrdenadosPorNome = new TreeSet<>(alunoSet);
        return alunosOrdenadosPorNome;
        //return new TreeSet<>(alunoSet);
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosOrdenadosPorNota = new TreeSet<>(new AlunosOrdenadosPorNota());
        alunosOrdenadosPorNota.addAll(alunoSet);
        return alunosOrdenadosPorNota;
    }

    public void exibirAlunos() {
        System.out.println(alunoSet);
    }

}

class AlunosOrdenadosPorNota implements Comparator<Aluno> {

    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a2.getMedia(), a1.getMedia());
    }
}
