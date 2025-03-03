package main.java.map.OperacoesBasicas.Dicionario.dominio;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public boolean removerPalavra(String palavra) {
        if (dicionarioMap.isEmpty()) return false;

        dicionarioMap.remove(palavra);
        return true;
    }

    public void exibirPalavras() {
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra) {
        String resulPesquisa = null;
        if (!dicionarioMap.isEmpty()) {
            resulPesquisa = dicionarioMap.get(palavra);
        }
        return resulPesquisa;
    }

}
