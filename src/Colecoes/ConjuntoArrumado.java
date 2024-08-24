package Colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoArrumado {

	public static void main(String[] args) {

//      Set<String> ListaAprovados = new HashSet<String>(); se eu coloco <Tipo>, digo que é obrigatorio essa lista ser desse tipo;

		SortedSet<String> listaAprovados = new TreeSet<>(); // TreeSet tenta manter ordem por alfabeto;
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");

		for (String Aprovados : listaAprovados) {
			System.out.println(Aprovados);
		}

		Set<Integer> nums = new HashSet<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);

		for (Integer n : nums) {
			System.out.println(n);
		}
	}
}
