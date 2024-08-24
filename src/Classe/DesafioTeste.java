package Classe;

import java.util.Scanner;

public class DesafioTeste {
	public static void main(String[] args) {
		
		Desafio alfabeto = new Desafio();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número entre 0 e 26: ");
       
        int RespostaCliente = scanner.nextInt();
        
        if(RespostaCliente > 0 && RespostaCliente <= 26) {
        	alfabeto.Alfabeto(RespostaCliente);
        } else {
        	System.out.print("Numero Inválido!");
        }
        
        scanner.close();
	}
}
