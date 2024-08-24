package oo.encapsulamento.casaB;
import oo.encapsulamento.casaA.Ana;

public class Joao extends Ana {
	
	Ana mae = new Ana();
	
	void acesso() {
//		segredo 
//		dentroDeCasa
//		formaFalar
//		todosSabem

//		System.out.println(mae.segredo);
//		System.out.println(mae.dentroDeCasa);
		System.out.println(formaFalar); // ou super.formaFalar;
		System.out.println(mae.todosSabem);
	}
}
