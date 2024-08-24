package Controle;

public class Continue {
	public static void main(String[] args) {
		
		for(int i = 0; i <= 10 ;i++) {
			if(i % 2 == 1) {
				//pula impar
				continue; // "continue" pula 1 repetição, enquanto "BREAK" pula todas;
			}
			
			System.out.println(i);
		}
	}
}
