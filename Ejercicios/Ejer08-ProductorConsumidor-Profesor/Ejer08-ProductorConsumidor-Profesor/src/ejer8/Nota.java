package ejer8;

public class Nota {

	private int numAlumnos;
	private int totalAprobados;
	private boolean salir = true;
	private boolean fin=false;
		

	public synchronized boolean getNota() { 
		/*do {*/
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			/*salir = false;
		}while(salir);
		salir = true;*/
		if (fin)
			return false;
		else
			return true;
	}

	public Nota() {
		super();
	}

	public synchronized void ponerAprobado() {
		notify();
	}

	public synchronized void seAcabaronLosAprobados() {
		// TODO Auto-generated method stub
		fin=true;
		notifyAll();
	}

	
}
