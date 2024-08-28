package Lambdas;

import java.util.function.Predicate;

public class Predicado {
	
	public static void main(String[] args) {
		
		double limiteCaro = 7550.00;
			
		Predicate<Produto> isCaro = prod -> (prod.preco * (1 -  prod.desconto)) >= limiteCaro;
		
		Produto produto = new Produto("Computador", 9877.00, 0.15);
		
		System.out.println(isCaro.test(produto));
	} 	
}
