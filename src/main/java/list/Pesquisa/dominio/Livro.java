package main.java.list.Pesquisa.dominio;

public class Livro {
    private String titulo;
    private String autor;
    private int anoDePublicacao;

    public Livro(String titulo, String autor, int anoDePublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
    }

    @Override
    public String toString() {
        return "==========Livros==========" +
                "\nTitulo = " + titulo +
                "\nAutor = " + autor +
                "\nAno De Publicação = " + anoDePublicacao+
                "\n";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setAnoDePublicacao(int anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }
}
