package oo.abstrato;

//se usar extends em uma classe abstract, obriga a usar os metodos abstract dela;
public abstract class Animal { 

	public boolean respirar() {
		return true;
	}

	public abstract double mover(); // só é possivel ter metodo abstract em classe abstract;
}
