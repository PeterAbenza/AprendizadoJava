package Controle;

import java.util.Scanner;

/*
 * Criar um programa que receba um número e verifique
 * se ele está entre 0 e 10 e é par;
 * */

public class DesafioControle { //"Class" define um bloco de codigo e tbm é uma estrutura;
	
	public static void main(String[] args) { //"metodo" main e tbm define um bloco de codigo;;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escolha um numero entre 0 a 10, \n"
				           + "para saber se é impar ou par! \n");
		
		int valor = entrada.nextInt();
		
		entrada.close();
		
		if(valor >= 0 && valor <= 10) {
			if(valor % 2 == 0) {
				System.out.println("É um numero par");
			} else {
				System.out.println("É um numero impar");
			}
		} else {
			System.out.println("Ele não esta entre 0 a 10!");
		}
	}
}
