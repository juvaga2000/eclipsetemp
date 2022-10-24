
public class Dato {
	private boolean colocado;

	public synchronized boolean isColocado() {
		if(!colocado)
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return colocado;
	}

	public synchronized void setColocado(boolean colocado) {
		this.colocado = colocado;
		this.notify();
	}

	public Dato(boolean colocado) {
		super();
		this.colocado = colocado;
	}
}
