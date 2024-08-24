package oo.heranca;

public class Monstro extends Jogador {
	
	Monstro(){
		this(0, 0); // chama o construdor a baixo;
	}
	
	Monstro(int x, int y){
		super(x, y);
	}

	boolean atacar(Jogador oponente) {
		boolean atk1 = super.atacar(oponente); // "super" para chamar metodo da superClasse;
		boolean atk2 = super.atacar(oponente);

		return atk1 || atk2;
	}
}
