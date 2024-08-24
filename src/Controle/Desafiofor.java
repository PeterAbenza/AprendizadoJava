package Controle;

//não pode usar valor numerico pra controlar laço;

public class Desafiofor {
	public static void main(String[] args) {
		
		for(String i = "#"; !i.equals("######") ; i += "#" ) {
			System.out.println(i);
		}
	}
}
