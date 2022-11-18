package Ejercicio2;

public class Gota {

	int volumen;

	
	public Gota(int volumen) {
		super();
		this.volumen = volumen;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	
	public synchronized void caer() {
		notify();
	}
	
	public synchronized void llenar() {
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
