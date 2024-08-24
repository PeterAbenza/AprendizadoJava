package oo.composicao;

public class CarroTeste {
	
	// um pra um;
	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		
		c1.ligar();
		System.out.println(c1.estaLigado());
		
		for(int i = 0; i < 10 ; i++) {
			
		    System.out.println(c1.motor.giros());
		    c1.frear();
		    c1.frear();
		    c1.frear();
		    c1.frear();
		    c1.frear();
		    c1.frear();
		    c1.frear();
		    c1.frear();
		    c1.frear();
		    c1.frear();
		    c1.frear();
		    c1.frear();
		    c1.frear();
		    c1.frear();
		    c1.frear();
		    System.out.println(c1.motor.giros());
		}
		
		
	}
}
