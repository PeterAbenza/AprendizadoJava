package Classe;

public class AreaCirc {
	final static double pi = 3.14; //usando "final" o valor da class não mudara mais, com ose fosse const do javascript;
	double raio;

	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double Area() {
		return pi * Math.pow(raio, 2);
	}
}
