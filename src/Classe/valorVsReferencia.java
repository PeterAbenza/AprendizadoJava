package Classe;

public class valorVsReferencia {
	public static void main(String[] args) {
		double a = 2;
		double b = a; // atribuição por valor, cria um nome espaço na memoria;
		
		System.out.println(b);
		
		Desafio25Desconto d1 = new Desafio25Desconto("Celular", 2000.00);
		Desafio25Desconto d2 = d1; // atribuição por referencia, usa o mesmo espaço na memoria;
		Desafio25Desconto d3 = d2;
		
		d1.name = "Celular2";
		d2.preco = 3000.00;
		
		System.out.println(d3.name + " " + d1.aplicarDesconto());
		
		VoltarPadrao(d1); // passar 
		
		System.out.println(d3.name + " " + d2.aplicarDesconto());
	}
	
	static void VoltarPadrao(Desafio25Desconto d) { // um static consegue acessar outro static;
		d.name = "Sem nome";
		d.preco = 0.0;
	}
}
