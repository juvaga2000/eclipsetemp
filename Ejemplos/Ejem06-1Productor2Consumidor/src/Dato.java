
public class Dato {

	private boolean colocado;

	public synchronized boolean isColocado() {
		while (!colocado)
		{
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		colocado=false;
		return true;
	}

	public synchronized void setColocado(boolean colocado) {
		this.colocado = colocado;
		this.notify();
		
	}

	public Dato(boolean colocado) {
		super();
		this.colocado = colocado;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
