package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumers {

	public static void main(String[] args) {

		Consumer<Produto> imprimir = (prod) -> System.out.println(prod.nome);

		Produto produto1 = new Produto("Tenis1", 320.00, 0.05);
		Produto produto2 = new Produto("Tenis2", 420.00, 0.08);
		Produto produto3 = new Produto("Tenis3", 640.00, 0.10);
		Produto produto4 = new Produto("Tenis4", 200.00, 0.07);
		Produto produto5 = new Produto("Tenis5", 230.00, 0.03);

		imprimir.accept(produto1);

		List<Produto> produto = Arrays.asList(produto1, produto2, produto3, produto4, produto5);

		produto.forEach(imprimir);
	}
}
