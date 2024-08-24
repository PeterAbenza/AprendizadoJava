package Classe;

public class Pessoa {
	String nome;
	double peso;
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	double comer(String nomeComida, double pesoComida) {
		return this.peso += pesoComida;
	}
}
