package Controle;

public class WhileDeterminado {
	public static void main(String[] args) {
		int Carregamento = 0;
		
		while(Carregamento < 100) {   //"True" ele repete, "false" não;
			Carregamento++;
			System.out.println(Carregamento);
		}
	}
}
