package tema1.ejercicio7;

public class Secretaria {
	private boolean aprobado;

	public synchronized boolean isAprobado() throws InterruptedException {
		wait();
		return aprobado;
	}

	public synchronized void setAprobado(boolean aprobado) {
		this.aprobado = aprobado;
		notify();
	}

	@Override
	public String toString() {
		return "Secretaria [aprobado=" + aprobado + "]";
	}
}
