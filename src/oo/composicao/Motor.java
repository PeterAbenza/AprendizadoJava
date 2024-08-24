package oo.composicao;

public class Motor {

	public boolean ligado = false;
	public double fatorInjecao = 1;
	
	public int giros() {
		if(!ligado) {
			return 0;
		} else {
			return (int) Math.round(fatorInjecao * 3000) ;
		}
	}
}
