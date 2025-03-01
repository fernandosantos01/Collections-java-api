package main.java.set.Pesquisa.AgendaContatos.dominio;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato>contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }
    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }
    public void exibirContatos(){
        System.out.println(contatoSet);
    }
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPesquisa = new HashSet<>();
        for (Contato c : contatoSet){
            if (c.getNome().startsWith(nome)){
                contatoPesquisa.add(c);
            }
        }
        return contatoPesquisa;
    }
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoMudarNumero = null;
        for (Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumeroTelefone(novoNumero);
                contatoMudarNumero = c;
                break;
            }
        }
        return contatoMudarNumero;
    }
}
