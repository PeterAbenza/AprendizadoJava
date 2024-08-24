package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double[] notas = new double[11];

		double total = 0;
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Informe a nota " + (i + 1) + ": ");
			notas[i] = entrada.nextInt();
			total += notas[i];
		}

		entrada.close();

		System.out.println("Notas aluno: " + Arrays.toString(notas));
		System.out.println("Media do aluno: " + total / notas.length);

	}
}
