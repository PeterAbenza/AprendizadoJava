package Classe;

public class EqualsHasdcode {
	public static void main(String[] args) {
		Usuario u1 = new Usuario("PeterAbenza", "abenzpeter@gmail.com");
		Usuario u2 = new Usuario("PeterAbenza", "abenzpeter@gmail.com");
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u1.name.equals(u2.name));
	}
}
