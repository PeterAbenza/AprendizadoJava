package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Resuces {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		// Binary recebe dois tipos diferentes, e retorna algo diferente;
		BinaryOperator<Integer> soma = (acumulador, valorAtual) -> acumulador + valorAtual;

		// pegando o valor de get;
		int total = nums.stream().reduce(soma).get(); 

		System.out.println(total);

		// se iniciar o valor do acumulador, reduce tem que retornar integer tbm;
		int total2 = nums.parallelStream().reduce(100, soma);						 

		System.out.println(total2);
	}
}
