package Classe;

public class Desafio25Desconto {
	static double desconto = 0.25;
	String name;
	double preco;
	
	Desafio25Desconto(String nameProduto, double precoProduto){
		name = nameProduto;
		preco = precoProduto;
	}
	
	double aplicarDesconto() {
		
		return preco * (1 - desconto);
	}
}
