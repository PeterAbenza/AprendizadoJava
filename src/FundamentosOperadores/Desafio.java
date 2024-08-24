package FundamentosOperadores;

import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {
		//ler 2 numeros
		//ler qual soma que o cliente quer: +, *, - ...
		
		Scanner Entrada = new Scanner(System.in);
		
		System.out.println("Valor 1:");
		double Valorone = Entrada.nextDouble();
		
		System.out.println("Quer qual Operação?:");
		String OP = Entrada.next();
		
		System.out.println("Valor 2:");
		double Valortwo = Entrada.nextDouble();
		
		
		double resultado = "+".equals(OP) ? Valorone + Valortwo : 0;
		resultado = "-".equals(OP) ? Valorone - Valortwo : resultado;
		resultado = "*".equals(OP) ? Valorone * Valortwo : resultado;
		resultado = "/".equals(OP) ? Valorone / Valortwo : resultado;
		resultado = "%".equals(OP) ? Valorone % Valortwo : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", Valorone, OP, Valortwo, resultado); //"%.2f na frente com texto" e o parametro no mesmo lugar ocupa;
		
		Entrada.close();
	}
}
