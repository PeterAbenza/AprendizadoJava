package Lambdas;

public class index2 {

	public static void main(String[] args) {
		
		// tipo "Calculo";
		Calculo soma = (x, y) -> { // função que não tem nome, empressão lambda;
			return x + y;
		};
		System.out.println(soma.executar(2, 3));
		
		soma = (x, y) -> x * y; // quando usa sem chaves retorna oq coloquei;
		System.out.println(soma.executar(2, 3));
		
		System.out.println(soma.legal());
		System.out.println(Calculo.massa());
	}
}
