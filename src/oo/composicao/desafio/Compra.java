package oo.composicao.desafio;

import java.util.ArrayList;

import oo.composicao.Item2;

public class Compra {

	final ArrayList<Item> items = new ArrayList<>();
	
	void addItem(Produto p, int quantidade) {
		this.items.add(new Item(p, quantidade));
	}
	
	void addItem(String nome, double preco ,int quantidade) {
		this.items.add(new Item(new Produto(nome, preco), quantidade));
	}
	
	double valorTotal() {
        double total = 0;
		
	    for(Item iten: items) {
			total += iten.quantidade * iten.produto.preco;
		}
		
		return total;
	}
}
