package Lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
	
	public static void main(String[] args) {

		UnaryOperator<Integer> MAISDois = (num) -> num + 2;
		UnaryOperator<Integer> VEZESDois = (num) -> num * 2;
		UnaryOperator<Integer> aoQuadrado = (num) -> num * num;
		
		int resultado = MAISDois.andThen(VEZESDois).andThen(aoQuadrado).apply(0); // depois execute esse;
		System.out.println(resultado);
		
		int resultado2 = aoQuadrado.compose(VEZESDois).compose(MAISDois).apply(0); // antes execute esse;
		System.out.println(resultado2);
	}
}
