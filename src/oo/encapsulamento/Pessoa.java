package oo.encapsulamento;

public class Pessoa {

	private int idade;

	public Pessoa(int idade) {
		setIdade(idade);
	}

	// Getter acessar algo private
	public int getIdade() {
		return idade;
	}

	// Setter mudar algo private
	public void setIdade(int novaIdade) {
		if (novaIdade > 0) {
			this.idade = novaIdade;
		} else {
			System.out.println("idade inválida!");
		}
	}
}
