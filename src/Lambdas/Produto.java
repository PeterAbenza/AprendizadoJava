package Lambdas;

public class Produto extends Object { // por padrão toda classe extends Object, colocando ou não;
	
	 final String nome;
	 final double preco;
	 final double desconto;
	
	public Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
}