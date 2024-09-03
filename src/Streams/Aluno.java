package Streams;

public class Aluno {
	
	private final String nome;
	private final double nota;
	private final double notaProvas;
	
	public Aluno(String nome, double nota, double notaProvas) {
		this.nome = nome;
		this.nota = nota;
		this.notaProvas = notaProvas;
	}

	public String getNome() {
		return nome;
	}

	public double getNota() {
		return nota;
	}

	public double getNotaProvas() {
		return notaProvas;
	}
}
