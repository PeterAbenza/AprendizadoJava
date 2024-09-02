package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DesafioEmpregado {

	public static void main(String[] args) {
		
		List<Empregado> empregados = Arrays.asList(
				new Empregado("Lucas", 1540.99),
				new Empregado("Bia", 1834.99),
				new Empregado("Joana", 2133.99), 
				new Empregado("Ana", 2434.99)
			);
		
		Consumer<Object> println = System.out::println;
		
		// filtrar os empregados cujo nome começa com uma letra específica;
		
		Predicate<Empregado> filterPessoas = (e) -> e.getNome().startsWith(String.valueOf("L"));
		
		
		
	}
}
