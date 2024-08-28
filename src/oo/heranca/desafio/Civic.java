package oo.heranca.desafio;

public class Civic extends Carro implements Esportivo{

	public Civic() {
		super(100); // ou this();
	}

	@Override // @Override para dizer que esta sobrescrevendo o metodo do carro;
	public boolean acelerar() {
		if (velocidade + 15 > velocidade_Maxima) {
			velocidade = velocidade_Maxima;
		} else {
			velocidade += 15;
			return true;
		}

		return false;
	}
	
	@Override
	public boolean ligarTurbo() {
		if (velocidade + 20 > velocidade_Maxima && ligado) {
			velocidade = velocidade_Maxima;
		} else {
			velocidade += 20;
			return true;
		}
		
		return false;
	}
	
	@Override
	public boolean desligarTurbo() {
		if(ligado) {
			acelerar();
			return true;
		}
		
		return false;
	}
}
