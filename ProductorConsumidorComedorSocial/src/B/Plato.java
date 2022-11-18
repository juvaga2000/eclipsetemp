package B;

public class Plato {

	private boolean tieneComida = false;
	private boolean flag;
	private boolean cerrarLocal = false;
	
	public synchronized boolean isTieneComida() {
		
		while(!flag && !cerrarLocal) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		flag = false;
		if(tieneComida) {
			tieneComida = false;
			this.notifyAll(); //Sobre todo se utiliza para despertar al productor
			return true;
		} else {
			this.notifyAll(); //Sobre todo se utiliza para despertar al productor
			return false;
		}
	}

	public synchronized void setTieneComida() {
		this.tieneComida = true;
		flag = true;
		this.notifyAll();
		try {
			this.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public synchronized void finish() {
		cerrarLocal = true;
		this.notifyAll();
	}
	
}
