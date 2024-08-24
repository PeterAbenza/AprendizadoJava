package Classe;

public class ProdutoTeste {

	public static void main(String[] args) {

		Produto ProdutoOne = new Produto(); //importar classes de outras files passando new;
		ProdutoOne.Nome = "Computador";
		ProdutoOne.Descricao = "Computador de ultima geração e roda tudo!";
		ProdutoOne.Price = 5360.99;
		ProdutoOne.Desconto = 10.00;

		double valorDesconto = ProdutoOne.Price * (ProdutoOne.Desconto / 100); // assim calcula o desconto;
		double precoFinal = ProdutoOne.Price - valorDesconto;

		System.out.println("\n" + ProdutoOne.Descricao);
		System.out.printf("Preço original: R$ %.2f%n", ProdutoOne.Price);
		System.out.printf("Percentual de desconto: %.2f%%%n", ProdutoOne.Desconto);
		System.out.printf("Valor do desconto: R$ %.2f%n", valorDesconto);
		System.out.printf("Preço final após desconto: R$ %.2f%n", precoFinal);

		var ProdutoTwo = new Produto(); //outra maneira de importar classes de outras files passando new;
		ProdutoTwo.Nome = "Notebook";
		ProdutoTwo.Descricao = "Notebook para desenvolvedores!";
		ProdutoTwo.Price = 4240.99;
		ProdutoTwo.Desconto = 00.55;
		
		double valorDescontoTwo = ProdutoTwo.Price * (ProdutoTwo.Desconto / 100); //assim calcula o desconto;
		double precoFinalTwo = ProdutoTwo.Price - valorDesconto;

		System.out.println("\n" + ProdutoTwo.Descricao);
		System.out.printf("Preço original: R$ %.2f%n", ProdutoTwo.Price);
		System.out.printf("Percentual de desconto: %.2f%%%n", ProdutoTwo.Desconto);
		System.out.printf("Valor do desconto: R$ %.2f%n", valorDescontoTwo);
		System.out.printf("Preço final após desconto: R$ %.2f%n", precoFinalTwo);

	}
}
