package Fundamentos;

public class LogicaPerguntas {
	
	public static void main(String[] args) {
		int NivelGay = 11;
		
		String Name = "Hitler";
		String Resultado = NivelGay > 10 ? "Sim! ele é gay" : "Não! não é gay";
		boolean Gay = Resultado == "Sim! ele é gay";
		
		if(Gay) {
			System.out.println("Pessoa: " + Name + ", " + Resultado);
		} else {
			System.out.println("Pessoa: " + Name + ", " + Resultado);
		}
	}
}
