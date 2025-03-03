package main.java.map.OperacoesBasicas.AgendaContatos.dominio;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContMap;

    public AgendaContatos() {
        this.agendaContMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer numero) {
        agendaContMap.put(nome, numero);
    }

    public boolean removerContato(String nome) {
        if (agendaContMap.isEmpty()) return false;

        agendaContMap.remove(nome);
        return true;
    }

    public void exibirContatos() {
        System.out.println(agendaContMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContMap.isEmpty()) {
            numeroPorNome = agendaContMap.get(nome);
        }
        return numeroPorNome;
    }
}
