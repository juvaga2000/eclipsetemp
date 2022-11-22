package ejercicio4;

public class Ventanilla {

	private int total;
	private boolean isDineroAcabado = false;
	private boolean isDineroColocado = false;

	public Ventanilla() {
		super();
	}

	public synchronized int getTotal() {

		while (!isDineroColocado && !isDineroAcabado) {
			try {
				if (isDineroAcabado) {
					Thread.currentThread().interrupt();
				}
				wait();
			} catch (InterruptedException e) {
			}
		}

		isDineroColocado = false;
		int aux = total;
		total = 0;
		return aux;
	}

	public synchronized void setTotal(int total) {
		this.total = total;
		isDineroColocado = true;
		notifyAll();
	}

	public synchronized boolean isDineroAcabado() {
		return isDineroAcabado;
	}

	public synchronized void setDineroAcabado(boolean isDineroAcabado) {
		this.isDineroAcabado = isDineroAcabado;
		notifyAll();
	}
}
