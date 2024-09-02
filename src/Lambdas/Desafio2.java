package Lambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Desafio2 {

	public static void main(String[] args) {

		List<Pessoa> pessoas = Arrays.asList(
				new Pessoa("Felipe", 18), 
				new Pessoa("Bia", 19), 
				new Pessoa("João", 12),
				new Pessoa("Joana", 20), 
				new Pessoa("Pedro", 22), 
				new Pessoa("Lucas", 13)
			);

		Predicate<Pessoa> listaPessoasMais18 = (pessoa) -> pessoa.getIdade() >= 18;

		Comparator<Pessoa> ordenarPorNome = Comparator.comparing(Pessoa::getNome);

		// Usando a Streams API para filtrar e transformar os dados
		List<String> nomes = pessoas.stream()
				.filter(listaPessoasMais18)
				.sorted(ordenarPorNome)
				.map(Pessoa::getNome)
				.collect(Collectors.toList());

		System.out.println(nomes);
	}
}
