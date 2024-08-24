package Classe;

public class AreaCircTeste {
	public static void main(String[] args) {
		AreaCirc valor = new AreaCirc(5);
		
		System.out.println(valor);
		System.out.print(AreaCirc.pi); //"pi" por estar Static ele é da propria classe;
	}
}
