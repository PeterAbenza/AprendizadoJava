package oo.heranca.desafio;

public interface Esportivo {
	
	boolean ligarTurbo();
	boolean desligarTurbo();
	
	default int nivelTurbo() { // default diz que a classe não é obrigada a usar essa metodo;
		return 1;
	}
}
