
public class Consumidor extends Thread{

	String palabra;
	String nombre;
	
	public Consumidor(String nombre) {
		this.nombre=nombre;
	}
	
	
	public String getPalabra() {
		return palabra;
	}


	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}


	public void run() {
		super.run();
		synchronized (palabra) {
			try {
				palabra.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
