package FundamentosOperadores;

public class OperadoresLogicos {
	public static void main(String[] args) {
		boolean TemDinheiro = 10 > 8; //a resposta retorna um valor true;
		boolean TemVontade = false;
		
		if(TemDinheiro || TemVontade == true) { // "||" significa "OU";
			System.out.println("Correto ||");
		} else {
			System.out.println("Errado ||");
		}
		
		if(TemDinheiro && TemVontade == true) { // "&&" significa "E";
			System.out.println("Correto &&");
		} else {
			System.out.println("Errado &&");
		}
		
		if(TemDinheiro ^ TemVontade == true) { // "^" significa "OU" exclusivo;
			System.out.println("Correto ^");
		} else {
			System.out.println("Errado ^");
		}
		
		if(!TemVontade) { // "!" nego o valor que esta, e sando "!!" nega duas vezes "NÂO";
			System.out.println("Correto !");
		} else {
			System.out.println("Errado !");
		}
	}
}
