package Controle;

import java.util.Scanner;

public class DesafioSemana {
	public static void main(String[] args) {
		/*
		 * Domingo - 1
		 * Segunda - 2
		 * Terça - 3
		 * Quarta - 4
		 * Quinta - 5
		 * Sexta - 6
		 * Sabado - 7
		 * */
		
		System.out.println("Escolha uma dia da semana: \n" 
				            + "A - Domingo \n"
				            + "B - Segunda \n"
				            + "C - Terça \n"
				            + "D - Quarta \n"
				            + "E - Quinta \n"
				            + "F - Sexta \n"
				            + "G - Sabado \n");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o dia: ");
		String RespostaCliente = entrada.nextLine();
		
		if(RespostaCliente.equalsIgnoreCase("A")) {
			System.out.println("Seu dia é 1.");
		}else if(RespostaCliente.equalsIgnoreCase("B")) {
			System.out.println("Seu dia é 2.");
		}else if(RespostaCliente.equalsIgnoreCase("C")) {
			System.out.println("Seu dia é 3.");
		}else if(RespostaCliente.equalsIgnoreCase("D")) {
			System.out.println("Seu dia é 4.");
		}else if(RespostaCliente.equalsIgnoreCase("E")) {
			System.out.println("Seu dia é 5.");
		}else if(RespostaCliente.equalsIgnoreCase("F")) {
			System.out.println("Seu dia é 6.");
		}else if(RespostaCliente.equalsIgnoreCase("G")) {
			System.out.println("Seu dia é 7.");
		}else {
			System.out.println("Dia inválida!");
		}
		
		
		entrada.close();
	}
}
