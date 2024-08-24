package Controle;

public class SwitchSemBreak {
	public static void main(String[] args) {
		String Faixa = "preto";
		
		/*
		 * "switch" recebe o valor direto;
		 * se "switch" não tiver break, vai executar todos a baixo dele;
		 * 
		 * "toLowerCase" para não se preocupar com letras maiuscula e minusculas;
		 */
		
		switch (Faixa.toLowerCase()) { 
		//"case" como se fosse if();
		case "preto": 
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan...");
		case "roxo":
			System.out.println("Sei o Heian Godan...");
		case "verde":
			System.out.println("Sei o Heian Yodan...");
			break;
		default: //"default" como se fosse o else();
			System.out.println("Não sei nada :(");
		}
	}
}
