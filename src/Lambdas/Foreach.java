package Lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {

		List<String> aprovados = Arrays.asList("João", "Ana", "Felipe", "Lucas");

		System.out.println("Forma lambda #01");
		aprovados.forEach((nome) -> System.out.println(nome)); // função que recebe função anonima;
		
		System.out.println("\nForma lambda #02");
		aprovados.forEach((nome) -> Imprimir(nome)); // função que recebe função anonima;
		
		System.out.println("\nMethod Reference... #01");
		aprovados.forEach(System.out::println); // passando uma referencia pra essa função;
		
		System.out.println("\nMethod Reference... #02");
		// forEach cada vez que percorrer os elementos chama a função passando os elementos;
		aprovados.forEach(Foreach::Imprimir); // passando uma referencia pra essa função;
	}
	
	static void Imprimir(String nome) {
		System.out.println("Bem vindo " + nome + "!");
	}
}
