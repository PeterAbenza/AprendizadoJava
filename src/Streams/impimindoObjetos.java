package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.stream.Stream;

public class impimindoObjetos {

	public static void main(String[] args) {
		// Arrays.asList converte um array para uma lista;
		List<String> aprovados = Arrays.asList("Lu", "Gui", "luca", "Ana");

		System.out.println("\nForma Foreach...");
		for (String p : aprovados) {
			System.out.println(p);
		}

		System.out.println("\nUsando Iterator...");

		Iterator<String> iterator = aprovados.iterator();
		while (iterator.hasNext()) { // .hasNext() tem proximo?
			System.out.println(iterator.next()); // tem proximo?
		}

		System.out.println("\nUsando Stream...");

		// usando stream() vc usou o build dele, e agr tem acesso as int. ops;
		Stream<String> stream = aprovados.stream(); 
		stream.forEach(System.out::println); // laço interno;
	}
}
