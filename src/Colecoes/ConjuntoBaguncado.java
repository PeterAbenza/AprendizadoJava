package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "unchecked", "rawtypes" }) // coloca uma obervação nos erros;
	public static void main(String[] args) {

		HashSet conjunto = new HashSet(); // começa pelo 1 não pelo 0;

		conjunto.add("Peter"); // HashSet faz a conversão automatica de tipo primitivo;
		conjunto.add(12356); // int -- Integer;
		conjunto.add("P85M"); // String
		conjunto.add(true); // boolean -- Boolean

		System.out.println("tamanho é: " + conjunto.size()); // .size() pega o tamanho da "array";

		conjunto.add("Peter"); // HashSet não aceita Repetição exp: "Peter", "Peter";
		System.out.println("tamanho agr é: " + conjunto.size());

		System.out.println(conjunto.remove(12356)); // retorna true e false;
		System.out.println("tamanho agr é: " + conjunto.size());
		System.out.println(conjunto.contains(12356)); // Retorna se existe true ou false;

		Set nums = new HashSet(); // pode usar set e dps dar new HashSet;

		nums.add("Peter");
		nums.add(1);
		nums.add(2);
		nums.add(3);

		System.out.println(nums);

		// conjunto.addAll(nums); // aqui juntei conjunto e nums;
		// System.out.println(conjunto); // Set não mantem a união, ele não segue um
		// padrão

		conjunto.retainAll(nums); // apenas o que for igual continua, se tiver 2 Peter, apenas essa parte fica;
		System.out.println(conjunto);

		conjunto.clear(); // limpa tudo;
		System.out.println(conjunto);
	}
}
