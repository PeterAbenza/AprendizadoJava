package Lambdas;

public class Soma implements Calculo { // obriga a implementa as funcoes do Calculo;

	@Override
	public double executar(double a, double b) {
		return a + b;
	} 
}
