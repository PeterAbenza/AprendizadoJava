package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class DesafioMap {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		// 1. numero para string binaria... 6 => "110"; 
		Function<Integer, String> binarios = num -> Integer.toBinaryString(num); 
		// 2. inverter a String... "110" => "011";
        Function<String, String> inverter = bin -> new StringBuilder(bin).reverse().toString();
        // 3. converter de volta para inteiro... "011" => 3;
        Function<String, Integer> converter = num -> Integer.parseInt(num, 2); // O segundo argumento 2 é para indicar base binária;
        
        nums.stream()
            // map é uma operação intermediária que aplica uma função a cada elemento do stream, produzindo um novo stream com os resultados.
			.map(binarios) 
			.map(inverter)
			.map(converter)
			.forEach(result -> {
                if (result != null) { // Verifica se o resultado não é nulo
                    System.out.println(result);
                }
            });
			//.collect(Collectors.joining(" ")); // Junta todas as strings binárias com um espaço como delimitador;
	}
}
