package main.java.list.Pesquisa.test;

import main.java.list.Pesquisa.dominio.CatalogoLivros;
import main.java.list.Pesquisa.dominio.Livro;

public class CatalogoLivrosTest {
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        Livro livro01 = new Livro("A volta dos que não foram", "Caipora", 2018);
        Livro livro02 = new Livro("A volta dos Pertubados", "Canapu", 2019);
        Livro livro03 = new Livro("A volta dos Pertubados", "Canapu", 2019);
        Livro livro04 = new Livro("Pinguela", "Trocao", 2020);

        catalogoLivros.adicionarLivro(livro01);
        catalogoLivros.adicionarLivro(livro02);
        catalogoLivros.adicionarLivro(livro03);
        catalogoLivros.adicionarLivro(livro04);

        System.out.println("-------------PESQUISA POR AUTOR--------------");
        catalogoLivros.pesquisarPorAutor("Canapu");
        System.out.println("-------------PESQUISA POR INTERVALOS DE ANOS--------------");
        catalogoLivros.pesquisarPorIntervaloAnos(2018, 2019);
        System.out.println("-------------PESQUISA POR TITULO--------------");
        catalogoLivros.pesquisarPorTitulo("A volta dos Pertubados");

    }
}
