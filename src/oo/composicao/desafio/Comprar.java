package oo.composicao.desafio;


public class Comprar {
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Peter");
		
		Compra compra1 = new Compra();
		compra1.addItem("Caneta", 1, 5);
		compra1.addItem(new Produto("Caderno", 18), 1);
		
		Compra compra2 = new Compra();
		compra1.addItem("Estojo", 13, 1);
		compra1.addItem(new Produto("Bolsa", 80), 1);
		
		cliente.addCompra(compra1);
		cliente.compras.add(compra2);
		
		System.out.println(cliente.compras.get(0));
	}
}
