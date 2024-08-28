package Lambdas;

@FunctionalInterface // faz com que a interface tenha apenas 1 metodo;
public interface Calculo {

	// interface funcional tem apenas 1 metodo;
	double executar(double a, double b); // por padrão é public e abstrado;
	
	default String legal() {
		return "legal";
	}
	
	static String massa() {
		return "massa";
	}
}
