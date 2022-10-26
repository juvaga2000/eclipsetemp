
public class Productor extends Thread {

	
	private String palabra;
	public Productor(String palabra) {
		// TODO Auto-generated constructor stub
		this.palabra = palabra;
	}
	
	

	public String getPalabra() {
		return palabra;
	}



	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		synchronized (palabra) {
			palabra.notify();
		}
		
	}

}
