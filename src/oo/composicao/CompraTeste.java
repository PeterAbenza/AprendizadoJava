package oo.composicao;

public class CompraTeste {

	// um pra muitos;
	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		
		compra1.cliente = "Peter";
		compra1.itens.add(new Item2("Monitor", 1, 1260.99));
		compra1.itens.add(new Item2("Mouse", 1, 239.99));
		compra1.itens.add(new Item2("Teclado", 1, 538.60));
		
		System.out.println(compra1.totalCompra());
	}
}
