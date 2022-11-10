package ejer8;

public class Alumno {

	private int numAlumnos;
	private int totalAprobados;
	private boolean salir = true;
		
	public Alumno(int numAlumnos, int totalAprobados) {
		super();
		this.numAlumnos = numAlumnos;
		this.totalAprobados = totalAprobados;
	}

	public synchronized int getNumAprobados() { // total de aprobados
		while(salir) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			salir = false;
		}
		salir = true;
		return totalAprobados;
	}

	public synchronized void recogerAprobados() {
		notify();
		this.totalAprobados--;
	}

	public synchronized int getNumAlumnos() {
		return numAlumnos;
	}
	
}
