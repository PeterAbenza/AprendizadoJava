package Classe;

public class Data {
	int valorone;
	int valortwo;
	String calculo;
	
	int somar() { //como se fosse "função", porem tem que informar o tipo;
	    if (calculo.equalsIgnoreCase("+")) {
	        return valorone + valortwo;
	    }else if(calculo.equalsIgnoreCase("-")) {
	    	return valorone - valortwo;
	    }else if(calculo.equalsIgnoreCase("*")) {
	    	return valorone * valortwo;
	    }else if(calculo.equalsIgnoreCase("/")) {
	    	return valorone / valortwo;
	    }
	    
	    // Se o operador não for valido, retorna 0 ou outro valor padrão;
	    return 0;
	}
}
