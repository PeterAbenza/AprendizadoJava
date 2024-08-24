package oo.heranca.desafio;

public class Carro {

	public final int velocidade_Maxima;
	public int velocidade = 0;
	private boolean ligado = false;

	protected Carro(int velocidadeMaxima) {
		velocidade_Maxima = velocidadeMaxima;
	}

	public boolean ligarCarro() {
		if (ligado == false) {
			ligado = true;

			return true;
		}

		return false;
	}

	public boolean desligarCarro() {
		if (ligado == true) {
			ligado = false;

			return true;
		}

		return false;
	}

	public boolean acelerar() {
		if (ligado == true) {
			if (velocidade + 5 > velocidade_Maxima) {
				velocidade = velocidade_Maxima;
			} else {
				velocidade += 5;
				return true;
			}
		}

		return false;
	}

	public boolean frear() {
		if (ligado == true && velocidade >= 0) {
			velocidade -= 5;

			return true;
		}

		return false;
	}
}
