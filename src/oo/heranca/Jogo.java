package oo.heranca;

public class Jogo {

	public static void main(String[] args) {
		Monstro player1 = new Monstro(10, 10);

		Heroi player2 = new Heroi(10, 11);

		System.out.println(player1.vida);
		System.out.println(player2.vida);

		player1.atacar(player2);
		player2.atacar(player1);

		System.out.println(player2.vida);
		System.out.println(player1.vida);
	}
}
