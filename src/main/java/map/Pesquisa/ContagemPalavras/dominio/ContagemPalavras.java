package main.java.map.Pesquisa.ContagemPalavras.dominio;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contagemPalavrasMap;

    public ContagemPalavras() {
        this.contagemPalavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        contagemPalavrasMap.put(palavra, contagem);
    }
    public boolean removerPalavra(String palavra){
        if (contagemPalavrasMap.isEmpty()) return false;
        contagemPalavrasMap.remove(palavra);
        return true;
    }
    public int exibirContagemPalavras(){
        int contagemTotalPalavras = 0;
        for (int contagem : contagemPalavrasMap.values()){
            contagemTotalPalavras += contagem;
        }
        return contagemTotalPalavras;
    }
    public String encontrarPalavraMaisFrequente(){
        String palavraMaisFrequente = null;
        int maiorNumero = 0;
        if (!contagemPalavrasMap.isEmpty()){
            for (Map.Entry<String, Integer> entry: contagemPalavrasMap.entrySet()){
                if (entry.getValue()>maiorNumero){
                    maiorNumero = entry.getValue();
                    palavraMaisFrequente = entry.getKey();
                }
            }
        }
        return palavraMaisFrequente;
    }
}
