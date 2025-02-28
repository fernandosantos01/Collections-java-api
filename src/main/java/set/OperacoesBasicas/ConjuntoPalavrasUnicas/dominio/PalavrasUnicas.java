package main.java.set.OperacoesBasicas.ConjuntoPalavrasUnicas.dominio;

import java.util.Objects;

public class PalavrasUnicas {
    private String palavra;

    public PalavrasUnicas(String palavra) {
        this.palavra = palavra;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PalavrasUnicas that = (PalavrasUnicas) o;
        return Objects.equals(getPalavra(), that.getPalavra());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getPalavra());
    }

    @Override
    public String toString() {
        return "palavrasUnicas{" +
                "palavra='" + palavra + '\'' +
                '}';
    }

    public String getPalavra() {
        return palavra;
    }
}
