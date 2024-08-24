package Classe;

public class Jantar {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Peter", 63.50);
		Comida comidaWhey = new Comida("WheyProten", 0.25);
		Comida comidaBanana = new Comida("Banana", 0.16);
		
		System.out.println(pessoa.nome + " bebeu " +  comidaWhey.nome + " e ganhou\n" 
				          + comidaWhey.peso + " gramas a mais, e ficou com "
				          + pessoa.comer(comidaWhey.nome, comidaWhey.peso));
		
		
		System.out.println(pessoa.nome + " dps comeu " +  comidaBanana.nome + " e ganhou\n" 
		          + comidaBanana.peso + " gramas a mais, e ficou com "
		          + pessoa.comer(comidaBanana.nome, comidaBanana.peso));
	}
}
