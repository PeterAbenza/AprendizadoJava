package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {

		List<Aluno> alunos = Arrays.asList(new Aluno("Felipe", 4, 6), new Aluno("João", 6, 8), 
				new Aluno("Ana", 8, 9), new Aluno("Bia", 9, 9));
		
		Predicate<Aluno> notaBoa = a -> a.getNota() >= 6;
		Predicate<Aluno> notaProvas = a -> a.getNotaProvas() > 6;
		Function<Aluno, String> Aprovados = a -> "Aluno " + a.getNome() + " foi aprovado, Parabéns!\n";

		alunos.stream()
			  .filter(notaBoa) 
			  .filter(notaProvas)
			  .map(Aprovados)
			  .forEach(System.out::print);
	}
}
