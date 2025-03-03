package main.java.map.Ordenacao.test;

import main.java.map.Ordenacao.dominio.AgendaEventos;

import java.time.LocalDate;

public class AgendaEventosTest {
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2026,3, 2), "Nome 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2023,3, 2), "Nome 2", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2028,3, 2), "Nome 3", "Atração 1");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }
}
