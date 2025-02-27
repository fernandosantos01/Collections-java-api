package main.java.list.Ordenacao.dominio;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> items;

    public CarrinhoDeCompras() {
        this.items = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        items.add(new Item(quantidade, nome, preco));
    }

    public void removerItem(String nome) {
        List<Item> itemListRemover = new ArrayList<>();
        for (Item item : items) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                itemListRemover.add(item);
            }
        }
        items.removeAll(itemListRemover);
    }

    public double calcularValorTotal(){
        double valorFinal = 0.0;
        for (Item item : items){
            valorFinal += item.getQuantidade()*item.getPreco();
        }
        return valorFinal;
    }

    public void exibirItens(){
        System.out.println(items);
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
