
public class Plato {

	private boolean tieneComida = false;
	private boolean flag;
	//private boolean cerrarLocal = false;
	
	public synchronized boolean isTieneComida() {
		
		//while(!flag && !cerrarLocal) {
		//while(!cerrarLocal) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		//}
		//flag = false;
		if(tieneComida) {
			tieneComida = false;
			return true;
		} else {
			return false;
		}
	}

	public synchronized void setTieneComida() {
		this.tieneComida = true;
		//flag = true;
		//this.notifyAll();
		this.notify();
	}
	
	public synchronized void finish() {
	//	cerrarLocal = true;
		this.notifyAll();
	}
	
}
