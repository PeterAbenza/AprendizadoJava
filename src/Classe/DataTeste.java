package Classe;

public class DataTeste {
	public static void main(String[] args) {
		Data Calculo = new Data();
		Calculo.valorone = 10;
		Calculo.valortwo = 10;
		Calculo.calculo = "+";
		
		int Resultado = Calculo.somar();
		
		System.out.print("Resultado = " + Resultado);
	}
}
