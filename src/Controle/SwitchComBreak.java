package Controle;

import java.util.Scanner;

public class SwitchComBreak {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escolha um numero de 1 a 10,\n"
				+ "qual mensagem de deus vc tem pra receber hoje?\n");
		
		System.out.print("1 a 10: ");		
		int Valor = entrada.nextInt();
		
		switch (Valor) {
		case 1:
			System.out.println("Aqui esta a mensagem: \n"
					            + "Hoje mesmo voce recebera uma pika em seu anus entrais! 🥵");
			break;
		case 2:
			System.out.println("Aqui esta a mensagem: \n"
		            + "Voce vai morrer no dia em que lula liberar a maconha! se fudeu 🤡");
			break;
		case 3:
			System.out.println("Aqui esta a mensagem: \n"
		            + "Voce vai comer comida entragada! 🤢");
			break;
		case 4:
			System.out.println("Aqui esta a mensagem: \n"
		            + "Voce vai ser pobre! tomo no cu 🤣");
			break;
		case 5:
			System.out.println("Aqui esta a mensagem: \n"
		            + "Voce vai ficar com o cu assado! 😬");
			break;
		case 6:
			System.out.println("Aqui esta a mensagem: \n"
		            + "Voce vai ser corno amanha! 👀");
			break;
		case 7:
			System.out.println("Aqui esta a mensagem: \n"
		            + "Voce vai pisar na bosta na rua ai vai escorregar, bater a cabeça e morrer! ☠️");
			break;
		case 8:
			System.out.println("Aqui esta a mensagem: \n"
		            + "Voce vai ter caganeira! 💩");
			break;
		case 9:
			System.out.println("Aqui esta a mensagem: \n"
		            + "Voce vai ser pego batendo punheta! 👌");
			break;
		case 10:
			System.out.println("Aqui esta a mensagem: \n"
		            + "Voce vai virar um crakudo! 😰😱");
			break;
		default:
			System.out.println("Vc sabe ler? 1 a 10 idiota 💢");
		}
		
		entrada.close();
	}
}
