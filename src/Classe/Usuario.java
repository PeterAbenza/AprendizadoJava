package Classe;

public class Usuario {
	String name;
	String Email;
	
	Usuario(String name, String Email){
		this.name = name;
		this.Email = Email;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Usuario) { // se obj é uma instancia "instanceof" de usuario;
			Usuario outro = (Usuario) obj;
			
			boolean nomeIgual = outro.name.equals(this.name);
			boolean emailIgual = outro.Email.equals(this.Email);
			
			return nomeIgual && emailIgual;
		}
		
		return false;
	}
}
