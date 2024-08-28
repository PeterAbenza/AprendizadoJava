package oo.abstrato;

public class TesteAbstract {

	public static void main(String[] args) {
		
		Animal Cachorro1 = new Cachorro();
		Mamifero Cachorro2 = new Cachorro();
		
		System.out.println(Cachorro1.mover());
		System.out.println(Cachorro2.mover());
		System.out.println(Cachorro2.mamar());
	}
}
