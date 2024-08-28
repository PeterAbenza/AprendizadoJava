package Lambdas;

import java.util.function.BinaryOperator;

public class index3 {

	public static void main(String[] args) {
		// tipo "BinaryOperator";
		BinaryOperator<Double> soma = (x, y) -> { // função anonima que é do proprio java.util;
			return x + y;
		};
		
		System.out.println(soma.apply(2.0, 3.0));

		soma = (x, y) -> x * y; // quando usa sem chaves retorna oq coloquei;
		System.out.println(soma.apply(2.0, 3.0));
	}
}
