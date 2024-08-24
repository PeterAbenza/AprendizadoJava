package Classe;

import java.util.Scanner;

public class LoginTeste {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Senha: ");
		String Senha = scanner.next();	
		
		System.out.println(Senha);
		
		scanner.close();
		

	}
}
