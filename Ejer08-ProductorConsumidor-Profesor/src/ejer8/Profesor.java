package ejer8;

import java.util.Iterator;

public class Profesor extends Thread {

	Nota nota;
	
	public Profesor(Nota nota) {
		super();
		this.nota = nota;
	}

	@Override
	public void run() {
		super.run();
		
		// El profesor pondrá 10 aprobados.
		for (int i = 0; i < 10; i++) {
			
			try {
				Thread.sleep(0);
			} catch (InterruptedException e) {			
				e.printStackTrace();
			}		
			nota.ponerAprobado();
		}
		nota.seAcabaronLosAprobados();
	}
}
