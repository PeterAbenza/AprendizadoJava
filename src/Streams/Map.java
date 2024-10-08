package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

	public static void main(String[] args) {

		Consumer<String> print = System.out::print;

		List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");
		// Usando a Streams API para filtrar e transformar os dados; forEach termina.
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);

		
//      ou usando classes;
//		UnaryOperator<String> maiuscula = (n) -> n.toUpperCase();
//		UnaryOperator<String> primeiraLetra = (n) -> n.charAt(0) + "";
//		UnaryOperator<String> grito = (n) -> n + "!!!";

		// System.out.println(maiuscula.andThen(primeiraLetra).andThen(grito).apply("BMW"));
		System.out.println("\nUsando Composição...");
		marcas.stream()
		      .map(Utilitarios.maiuscula) // ou usando lambada;
		      .map(Utilitarios.primeiraLetra)
		      .map(Utilitarios::grito) // ou usando referencia;
		      .forEach(print);
	}
}
