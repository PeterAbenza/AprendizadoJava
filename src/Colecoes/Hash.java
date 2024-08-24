package Colecoes;

import java.util.HashSet;

public class Hash {
	
	public static void main(String[] args) {
		
		HashSet<usuario> usuarios = new HashSet<usuario>();
		
		usuarios.add(new usuario("João"));
		usuarios.add(new usuario("Ana"));
		usuarios.add(new usuario("Felipe"));
		
		boolean resultado = usuarios.contains(new usuario("Ana"));
		System.out.println(resultado);
	}
}
