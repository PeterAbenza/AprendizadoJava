package oo.composicao;

public class Carro {
	
	Motor motor = new Motor();
			
	public void acelerar() {
		if(motor.ligado) {
			motor.fatorInjecao += 0.4;
		} else {
			System.out.println("Carro desligado para acelerar");
		}
	}
	
	public void frear() {
		if(motor.ligado && motor.fatorInjecao > 0.5) {
			motor.fatorInjecao -= 0.4;
		}
	}
	
	public void ligar() {
		motor.ligado = true;
	}
	
	public void desligar() {
		motor.ligado = false;
	}
	
	public boolean estaLigado() {
		return motor.ligado;
	}

}
