package main.java.map.Ordenacao.dominio;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate localDate, String nome, String atracao) {
        eventoMap.put(localDate, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventoOrdenado = new TreeMap<>(eventoMap);
        System.out.println(eventoOrdenado);
    }

    public void obterProximoEvento() {
        Map<LocalDate, Evento> eventoOrdenado = new TreeMap<>(eventoMap);
        LocalDate dataAtual = LocalDate.now();
        if (!eventoMap.isEmpty()) {
            for (Map.Entry<LocalDate, Evento> entry : eventoMap.entrySet()) {
                if (entry.getKey().equals(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                    System.out.println("O proximo evento: " + entry.getValue() + " acontecerá na data: " + entry.getKey());
                    break;
                }
            }
        }

    }
}
