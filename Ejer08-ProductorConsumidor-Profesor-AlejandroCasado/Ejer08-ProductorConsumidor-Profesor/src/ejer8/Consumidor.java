package ejer8;

public class Consumidor extends Thread {

	Alumno alumno;
	
	public Consumidor(String nombre, ThreadGroup grupo, Alumno alumnoCompartido) {
		super(grupo, nombre);
		this.alumno = alumnoCompartido;
	}

	@Override
	public void run() {
		super.run();

		if(alumno.getNumAprobados() >= 0) {
			System.out.print(getName()+" ha recogido su aprobado");
		}else {
			System.out.print(getName()+" NO ha aprobado.");
		}
		System.out.println("\t (alumno nº: " + Thread.currentThread().activeCount() + ")");
	}

	
}
