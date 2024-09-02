package Lambdas;

import java.util.Iterator;

public class Trabalho implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Instalando2 " + i + "%");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
		}
	}
}
