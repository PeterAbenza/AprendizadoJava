package Controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		/*
		 * Do While tem que ser executado pelo menos 1 vez, 
		 * diferente dos os laços que pode ou não;
		 * 
		 * Do sentença; While {};
		 * */
		
		Scanner entrada = new Scanner(System.in);
		
		String CloseText = "";
		System.out.println("PROPAGANDA DO PENIS MAIOR!!!\n"
				            + "Compre agora o remedio que promete 20cm maior!\n");
		
		do {
			System.out.print("Digite Close para sair ou Quero para aderir: ");
			CloseText = entrada.next();
			
			if(CloseText.equalsIgnoreCase("close")) {
				System.out.println("Voce saiu!");
				
			} else if(CloseText.equalsIgnoreCase("quero")) {
				System.out.println("Cartão de credito clonado com Sucesso! flw seu bosta");
				CloseText = "close";
				
			}else {
				System.out.println("Escreve certo retardado\n");
				
			}
		} while(!CloseText.equalsIgnoreCase("close")); //expressão fica em ultimo; e ! é diferente;
		
		entrada.close();
	}
}
