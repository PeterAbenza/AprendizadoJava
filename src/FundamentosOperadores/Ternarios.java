package FundamentosOperadores;

public class Ternarios {
	public static void main(String[] args) {
		double nota = 7.6; // ":" significa "caso ao contrario", "?" se for vardadeira retorna algo
		double media = 8.5;
		String resultado = nota >= media ? "aprovado" : "Recuperação";
		
		System.out.println(resultado);
	}
}
