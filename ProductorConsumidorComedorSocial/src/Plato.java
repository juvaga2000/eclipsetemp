public class Plato {

	boolean disponible=false;
	
	public synchronized boolean isDisponible() {
		
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(disponible) {
				disponible=false;
				return true;
			}else {
				return false;
			}
		
	}

	public synchronized void setDisponible(boolean disponible) {
		this.disponible=disponible;
		notify();
	}
	
	
}
