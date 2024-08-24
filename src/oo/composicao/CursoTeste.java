package oo.composicao;

public class CursoTeste {
	
	// muito pra muitos;
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Ana");
		Aluno aluno3 = new Aluno("Felipe");
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Desing");
		Curso curso3 = new Curso("JavaScript Completo");
		
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		curso3.adicionarAluno(aluno1);
		curso3.adicionarAluno(aluno2);
		curso3.adicionarAluno(aluno3);
	
		for(Aluno aluno: curso3.alunos) {
			System.out.println("Matriculado: " + aluno.nome);
		}
		
		System.out.println("\n" + aluno3.nome);
		
		for(Curso curso: aluno3.cursos) {
			System.out.println(curso.nome);
		}
	}
}
