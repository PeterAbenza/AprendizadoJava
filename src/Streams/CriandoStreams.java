package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {

		// recebe algo e não retorna nada;
		Consumer<String> print = System.out::println;
		Consumer<Object> println = System.out::println;

		System.out.println("\nForma 1");
		Stream<String> langs = Stream.of("Java", "Lua", "Js"); // metodo .of acessa direto na classe Stream;
		langs.forEach(print);

		System.out.println("\nForma 2");
		String[] maisLangs = { "Python", "Lisp", "Perl", "Go" };
		Stream.of(maisLangs).forEach(print);

		System.out.println("\nForma 3");
		Arrays.stream(maisLangs).forEach(print);
		
		System.out.println("\nForma 4");
		Arrays.stream(maisLangs, 1, 3).forEach(print); // pegando na posição 1 até a posição 3, mas 3 não é incluso
		
		System.out.println("\nForma 5");
		List<String> outrasLangs = Arrays.asList("C", "PHP", "Kotlin");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);
		
		System.out.println("\nForma 6");
		//Stream.generate(() -> "a").forEach(print);
		Stream.iterate(0, (n) -> n + 1).forEach(println);
	}
}
