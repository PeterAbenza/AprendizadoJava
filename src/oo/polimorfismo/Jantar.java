package oo.polimorfismo;

public class Jantar {
	
	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(60.40);
		System.out.println(convidado.getPeso());
		
		Arroz ingrediente1 = new Arroz(0.25);
		Feijao ingrediente2 = new Feijao(0.35);
		Sorvete ingrediente3 = new Sorvete(0.15);
		
		
		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);
		convidado.comer(ingrediente3);
		
		
		System.out.println(convidado.getPeso());
		
	}
}
