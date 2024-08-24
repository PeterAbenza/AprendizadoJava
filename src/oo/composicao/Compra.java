package oo.composicao;

import java.util.ArrayList;

public class Compra {

	String cliente;
	ArrayList<Item2> itens = new ArrayList<Item2>();
	
	public double totalCompra() {	
		double total = 0;
		
		for(Item2 iten: itens) {
			total += iten.quantidade * iten.preco;
		}
		
		return total;
	}
}
