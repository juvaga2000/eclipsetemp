
public class Dato {
	private boolean colocado;

	public synchronized boolean isColocado() {
		return colocado;
	}

	public synchronized void setColocado(boolean colocado) {
		this.colocado = colocado;
	}

	public Dato(boolean colocado) {
		super();
		this.colocado = colocado;
	}
}
