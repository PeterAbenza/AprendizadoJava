package Classe;

public class Login {
	static String Email = "peter@gmail.com"; //usando "static" define que o valor é da classe, e usando "final" o valor dele não mudara;
	String Senha;
	boolean Key;
	
	//"Construtor" tem que ter o mesmo nome que a classe;
	Login(String Senha){ //isso é um "Construtor" e um "Construtor explicito" é sem parametros, não retorna nada;
		this.Senha = Senha; // "this" para dizer que esta acessando o valor da instancia da classe;
	}
	
	Login(){
		this(""); // chamo o contrutor diferenciando no parametro;
		
	}
}