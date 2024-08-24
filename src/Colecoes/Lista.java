package Colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {

		// ArrayList e uma array em ordem e começa por 0 não 1;
		// e ArrayList aceita repetição;
		ArrayList<usuario> lista = new ArrayList<usuario>(); // criando um tipo obj usuario;

		usuario u1 = new usuario("Ana");
		lista.add(u1);

		lista.add(new usuario("Carlos"));
		lista.add(new usuario("Lia"));
		lista.add(new usuario("Bia"));
		lista.add(new usuario("Manu"));

		System.out.println(lista); // e usando metodo toString por padrão vem o return dele;
		System.out.println(lista.get(2).nome); // get na posição para acessar oq qr;

		for (usuario u : lista) {
			System.out.println(u.nome);
		}

		System.out.println(lista.contains(new usuario("Carlos"))); // não consigo usar sem hashCode e equals;

	}
}
