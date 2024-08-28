package Lambdas;

import java.util.function.Function;

public class functions {

	public static void main(String[] args) {

		// Function recebe Integer e retorna String;
		// operador ternario ? se for : se não;
		Function<Integer, String> parOuImpar = (num) -> num % 2 == 0 ? "Par" : "Ímpar"; 
		
		Function<String, String> oResultado = (valor) -> "Resultado: " + valor; 
		
		Function<String, String> empolgado = (valor) -> valor + "!!!"; 
		
		String resultadoFinal = parOuImpar.andThen(oResultado).andThen(empolgado).apply(32); // andThen() então chame a função;
		
		// System.out.println(parOuImpar.apply(32));	
		System.out.println(resultadoFinal);
	}
}
