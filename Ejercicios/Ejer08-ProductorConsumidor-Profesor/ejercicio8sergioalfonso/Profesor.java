package tema1.ejercicio7;

import java.util.concurrent.TimeUnit;

public class Profesor extends Thread {
	Secretaria secretaria;
	
	public Profesor(Secretaria secretaria) {
		this.secretaria = secretaria;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			secretaria.setAprobado(i < 10);
			
			try {
				TimeUnit.MILLISECONDS.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
