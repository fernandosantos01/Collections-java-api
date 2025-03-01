package main.java.set.Ordenacao.ListaDeAlunos.dominio;

import java.util.Objects;

public class Aluno implements Comparable<Aluno>{
    private String nome;
    private Long matricula;
    private double media;

    public Aluno(String nome, Long matricula, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aluno alunos = (Aluno) o;
        return Objects.equals(getMatricula(), alunos.getMatricula());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getMatricula());
    }

    @Override
    public int compareTo(Aluno a) {
        return nome.compareToIgnoreCase(a.getNome());
    }

    @Override
    public String toString() {
        return "Alunos{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", media=" + media +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public double getMedia() {
        return media;
    }
}
