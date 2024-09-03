package Streams;

import java.util.Arrays;
import java.util.List;

public class Filter {

	public static void main(String[] args) {
		
		List<Aluno> alunos = Arrays.asList(new Aluno("Felipe", 4, 6), new Aluno("João", 6, 8), 
				new Aluno("Ana", 8, 9), new Aluno("Bia", 9, 9));
		
		// filter retorna true e false, se true continua oq tiver na array e se for false não continua
	    // (exp na posição 0, se não for true ela sai);
	    // map para ajudar a converter em string ou qualquer outra coisa;
		alunos.stream()
		      .filter(a -> a.getNota()>= 7)
		      .map(a -> "Aluno " + a.getNome() + " foi aprovado, Parabéns!\n")
		      .forEach(System.out::print);
	}
}
