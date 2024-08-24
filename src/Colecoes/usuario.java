package Colecoes;

import java.util.Objects;

@SuppressWarnings("unused")
public class usuario {

	String nome;

	usuario(String nome) {
		this.nome = nome;
	}

	public String toString() {
		return "Meu nome é " + this.nome + ".";
	}

	@Override
	public int hashCode() {
		return this.nome.length();
	}

	@Override
	public boolean equals(Object obj) { // um metodo equals;
		usuario outroUsuario = (usuario) obj;
		return this.nome.equals(outroUsuario.nome);
	}

}
