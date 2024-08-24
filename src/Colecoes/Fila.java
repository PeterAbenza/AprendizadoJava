package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		// Primiro que entrar na fila sera servido;
		Queue<String> fila = new LinkedList<>();

		// offer e add adiciona na fila;
		fila.add("Lucas");
		fila.offer("Bia"); // retorna falso caso a fila esteja cheia;
		fila.add("Carlos"); // lançará uma exceção caso a fila esteja cheia;
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// peek e element tras o proximo da fila (sem remover);
		System.out.println(fila.peek()); // caso a fila esteja vazia retorna null;
		System.out.println(fila.element()); // caso a fila esteja vazia retorna Error;
		
		fila.isEmpty(); // saber se a fila esta vazia;
		
		// poll e remove tras o proximo da fila (e remove);
		System.out.println(fila.poll()); // retorna o primeiro elemento da fila;
		
	}
}
