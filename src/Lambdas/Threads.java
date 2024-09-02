package Lambdas;

//THREADS são funções anonimas que ficam alternando em si, uma hora outra, dps outra de forma aleatoria;
public class Threads {

	public static void main(String[] args) {

		Runnable tarefa1 = new Trabalho();
		Runnable tarefa2 = new Runnable() { // instancia interface;

			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("Instalando " + i + "%");
					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}
				}
			}
		};

		
		Runnable tarefa3 = Threads::tarefa3; // chamando a classe passa o metodo static como referencia;
//		com referencia ou...
		
//		Runnable tarefa3 = () -> {
//			for (int i = 0; i < 100; i++) {
//				System.out.println("Instalando3 " + i + "%");
//				try {
//					Thread.sleep(100);
//				} catch (Exception e) {
//				}
//			}
//		};

		Thread t1 = new Thread(tarefa1);
		Thread t2 = new Thread(tarefa2);
		Thread t3 = new Thread(tarefa3);

		t1.start();
		t2.start();
		t3.start();
	}

	static void tarefa3() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Instalando3 " + i + "%");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
		}
	}
}
