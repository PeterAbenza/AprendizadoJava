package Colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {

		// Map começa pelo 0 não 1;
		Map<Integer, String> usuarios = new HashMap<>();
		// put é pra adicionar quanto para alterar;
		usuarios.put(1, "Felipe");
		usuarios.put(2, "Rebeca");
		usuarios.put(3, "João");

		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty()); // esta vazio? retorna false ou true;

		System.out.println(usuarios.keySet()); // retorna as chaves;
		System.out.println(usuarios.values()); // retorna os valores;
		System.out.println(usuarios.entrySet()); // retorna chaves e valores;

		System.out.println(usuarios.containsKey(2));
		System.out.println(usuarios.containsValue("Rebeca"));

		System.out.println(usuarios.get(1)); // retorna valor encima da chave;
		
		for(int chave : usuarios.keySet()) { // percorrer chaves;
			System.out.println(chave);
		}
		
		for(String nome : usuarios.values()) { // percorrer valores;
			System.out.println(nome);
		}
		
		for(Entry<Integer, String> registro : usuarios.entrySet()) { // percorrer chaves e valores;
			System.out.println(registro);
		}
		
//		for(int i = 0; i <= 10 ; i++) {
//			usuarios.put(i , "Teste");
//		}
//		
//		System.out.println(usuarios.entrySet());
	}
}
