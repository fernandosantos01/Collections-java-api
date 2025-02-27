package main.java.list.Ordenacao.dominio;

public class Item {
    private int quantidade;
    private String nome;
    private double preco;

    public Item(int quantidade, String nome, double preco) {
        this.quantidade = quantidade;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "====Item====" +
                "\nQuantidade = " + quantidade +
                "\nNome = '" + nome + '\'' +
                "\nPreco = " + preco +
                ' ';
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
