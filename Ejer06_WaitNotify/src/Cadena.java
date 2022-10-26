
public class Cadena {

	private boolean recogido=false;
	
	public synchronized boolean isRecogido() {
		while(!recogido) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		recogido=false;
		return true;
	}
	
	public synchronized void setRecogido(boolean recogido) {
		this.recogido = recogido;
		this.notify();
	}
	
	public Cadena(boolean recogido) {
		super();
		this.recogido = recogido;
	}
}
