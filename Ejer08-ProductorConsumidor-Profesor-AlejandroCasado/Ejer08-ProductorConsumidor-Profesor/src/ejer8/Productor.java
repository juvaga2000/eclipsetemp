package ejer8;

import java.util.Iterator;

public class Productor extends Thread {

	Alumno alumno;
	
	public Productor(Alumno alumnoCompartido) {
		super();
		this.alumno = alumnoCompartido;
	}

	@Override
	public void run() {
		super.run();
		
		// se repetira tantas veces como alumnos haya
		for (int i = 0; i < alumno.getNumAlumnos(); i++) {
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {			
				e.printStackTrace();
			}		
			alumno.recogerAprobados();
		}
			
		
			
		
		
		
	}

	
}
