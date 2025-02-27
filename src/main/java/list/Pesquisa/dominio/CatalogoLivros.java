package main.java.list.Pesquisa.dominio;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livros;

    public CatalogoLivros() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void pesquisarPorAutor(String autor) {
        List<Livro> resulPesquisaLivros = new ArrayList<>();
        if (!livros.isEmpty()) {
            for (Livro livro : livros) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    resulPesquisaLivros.add(livro);
                }
            }
        }
        System.out.println(resulPesquisaLivros);
    }

    public void pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> resulPesquisaLivros = new ArrayList<>();
        if (!livros.isEmpty()) {
            for (Livro livro : livros) {
                if (livro.getAnoDePublicacao() >= anoInicial && livro.getAnoDePublicacao() <= anoFinal) {
                    resulPesquisaLivros.add(livro);
                }
            }
        }
        System.out.println(resulPesquisaLivros);
    }

    public void pesquisarPorTitulo(String titulo) {
        List<Livro> resulPesquisaLivros = new ArrayList<>();
        if (!livros.isEmpty()) {
            for (Livro livro : livros) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    resulPesquisaLivros.add(livro);
                    break;
                }
            }
        }
        System.out.println(resulPesquisaLivros);
    }
}
