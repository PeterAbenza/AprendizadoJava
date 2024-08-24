package oo.heranca.desafio.teste;

import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Fusca;

public class Estrada {

	public static void main(String[] args) {

		Civic carroCivic = new Civic();
		Fusca carroFusca = new Fusca();

		// ligar carros;
		System.out.println(carroCivic.ligarCarro());
		System.out.println(carroFusca.ligarCarro());

		// acelerar
		for (int i = 0; i < 16; i++) {
			carroCivic.acelerar();
			carroFusca.acelerar();

			// ver velocidade
			System.out.println(carroCivic.velocidade);
			System.out.println(carroFusca.velocidade);
		}
	}
}
