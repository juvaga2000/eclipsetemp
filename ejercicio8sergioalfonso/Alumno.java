package tema1.ejercicio7;

public class Alumno extends Thread {
	Secretaria secretaria;
	
	public Alumno(String name, Secretaria secretaria) {
		super(name);
		this.secretaria = secretaria;
	}

	@Override
	public void run() {
		try {
			if (secretaria.isAprobado()) System.out.printf("Soy %s y he aprobado%n", getName());
			else System.out.printf("Soy %s y no he aprobado%n", getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
