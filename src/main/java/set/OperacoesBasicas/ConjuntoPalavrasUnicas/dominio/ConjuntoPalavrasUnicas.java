package main.java.set.OperacoesBasicas.ConjuntoPalavrasUnicas.dominio;

import main.java.set.OperacoesBasicas.ConjutoConvidados.dominio.ConjuntoConvidados;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<PalavrasUnicas> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicasSet.add(new PalavrasUnicas(palavra));
    }

    public void removerPalavra(String palavra) {
        PalavrasUnicas unicas = null;
        for (PalavrasUnicas unicas1 : palavrasUnicasSet) {
            if (unicas1.getPalavra().equalsIgnoreCase(palavra)) {
                unicas = unicas1;
            }
        }
        palavrasUnicasSet.remove(unicas);
    }

    public boolean verificarPalavra(String palavra) {
        for (PalavrasUnicas p : palavrasUnicasSet) {
            if (p.getPalavra().equalsIgnoreCase(palavra)) {
                System.out.println(palavra + " está presente no conjunto de palavras");
                break;
            }else {
                return false;
            }
        }
        return true;
    }
    public void exibirPalavrasUnicas(){
        System.out.println(palavrasUnicasSet);
    }
}
