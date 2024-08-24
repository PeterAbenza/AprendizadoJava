package arrays;

import java.util.Arrays;

public class Exercicios {
	public static void main(String[] args) {

		double[] notasAlunoA = new double[3]; // avisar quantos espaços vai ter;

		System.out.println(Arrays.toString(notasAlunoA));

		notasAlunoA[0] = 8;
		notasAlunoA[1] = 7.3;
		notasAlunoA[2] = 3.5;

		System.out.println(Arrays.toString(notasAlunoA));

		double totalAlunoA = 0;

		for (int i = 0; i < notasAlunoA.length; i++) { // length é o comprimento do array;
			totalAlunoA += notasAlunoA[i];
		}

		System.out.println(totalAlunoA / notasAlunoA.length);

		double[] notasAlunoB = { 7.7, 8.7, 5.5 };

		

	}
}
