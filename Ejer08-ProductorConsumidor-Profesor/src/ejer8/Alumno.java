package ejer8;

public class Alumno extends Thread {

	Nota nota;
	
	public Alumno(String nombre, ThreadGroup grupo, Nota nota) {
		super(grupo, nombre);
		this.nota = nota;
	}

	@Override
	public void run() {
		super.run();

		if (nota.getNota())
		{
			System.out.println(getName()+" ha recogido su aprobado");
		}else {
			System.out.println(getName()+" NO ha aprobado.");
		}
	}

	
}
