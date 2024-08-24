package Controle;

import java.util.Random;
import java.util.Scanner;

/*
 * Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. 
 * Armazene um numero aleatório em uma variável. 
 * O Jogador tem 10 tentativas para adivinhar o número gerado.
 * Ao final de cada tentativa, imprima a quantidade de tentativas restantes,
 * e imprima se o número inserido é maior ou menor do que o número armazenado.
 * */

public class DesafioControle2 {
	public static void main(String[] args) {

		Random random = new Random(); // gera um numero aleatorio
		int numeroAleatorio = random.nextInt(101);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Jogo da adivinhação! \nTente adivinhar um número entre 0 - 100.\n");

		Integer tentativasRestantes = 10;

		while (tentativasRestantes > 0) {
			System.out.print("Digite o seu palpite: ");
			int palpite = scanner.nextInt();

			if (palpite < numeroAleatorio) {
				System.out.println("O número é maior do que " + palpite + ".\n");
			} else if (palpite > numeroAleatorio) {
				System.out.println("O número é menor do que " + palpite + ".\n");
			} else {
				System.out.println("Parabéns! Você adivinhou o número!");
				break;
			}
			
			tentativasRestantes--;
			
			if(tentativasRestantes.equals(0)) {
				System.out.println("Você perdeu! O número era " + numeroAleatorio + ".");
			}
			
		}

		scanner.close();

	}
}
