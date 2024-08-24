package Classe;

public class Desafio {
	String Alfabeto(int x){
		
		String[] alfabeto = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N",
				             "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
		
		for(int i = 0; x > i ; i++) {
			if(i > x) {
				break;
			}
			
			System.out.printf(alfabeto[i]);
		}
		
		return "";
	}
}
