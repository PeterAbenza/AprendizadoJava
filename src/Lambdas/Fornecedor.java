package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
	
	public static void main(String[] args) {
		// Supplier não tem .and(), .andThen()...
		Supplier<List<String>> umaLista = () -> Arrays.asList("Ana", "Bia", "Gui");
		
		System.err.println(umaLista.get());
	}
}
