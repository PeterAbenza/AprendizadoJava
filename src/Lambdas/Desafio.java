package Lambdas;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Produto produto = new Produto("Celular", 1234.50, 0.10);

		// Cria uma instância de NumberFormat para o Brasil;
		NumberFormat formatoMonetario = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

		Function<Produto, Double> precoDesconto = (prod) -> prod.preco * (1 - prod.desconto);

		UnaryOperator<Double> impostoMunicipal = (p) -> p >= 2500 ? p * 0.085 : p;

		UnaryOperator<Double> frete = (p) -> p >= 3000 ? p + 100 : p + 50;

		UnaryOperator<Double> arredondar = (p) -> {
			BigDecimal valorDecimal = new BigDecimal(p);
			return valorDecimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
		};

		// Função para formatar o valor monetário
		Function<Double, String> formatar = (valorFinal) -> formatoMonetario.format(valorFinal); 

		System.out.println(precoDesconto
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(produto));

		/*
		 * 1. partir do produto calcular o preco com desconto; 
		 * 2. imposto municipal: >= 2500 (8,5%)/ < 2500 (isento) ;
		 * 3. frete: >= 3000 (100)/ < 3000 (50) ;
		 * 4. arredondar: deixar duas casas decimais 
		 * 5. formatar: R$1234,56
		 */
	}
}
