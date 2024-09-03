package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Resuces {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		// Binary recebe dois tipos diferentes, e retorna algo diferente;
		BinaryOperator<Integer> soma = (acumulador, valorAtual) -> acumulador + valorAtual;

		// se não passar o valor inicial para o acumulador, tem que usar get pra pegar o resultado;
		int total = nums.stream().reduce(soma).get(); 
		// System.out.println(total);

		// se iniciar o valor do acumulador, reduce tem que retornar integer tbm;
		// primeiro parametro da um valor inicial para cada um da array;
		int total2 = nums.stream().reduce(100, soma);
		// System.out.println(total2);
		// se usar parallelStream o valor 100 sera 945, pq usou o 100 muitas vezes
		// int total2 = nums.parallelStream().reduce(100, soma); 

		// Resultado foi um Opcinal<Integer>
		nums.stream()
		    .filter(n -> n > 5)
		    .reduce(soma)
		    .ifPresent(System.out::println); // se o resultado estiver presente chama ela;
	}
}
