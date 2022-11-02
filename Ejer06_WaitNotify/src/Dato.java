

import java.util.ArrayList;

public class Dato {
	
	private ArrayList<String> listaPalabras = new ArrayList<>();
	
	private String palabra=null;

	public Dato() {
		super();
	}

	
	// Se consume
	public synchronized String getPalabra() {
		
		while(palabra == null ) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		String aux = palabra;
		if (!palabra.equalsIgnoreCase("fin"))
			palabra = null;
		return aux;
	}

	
	// Se produce
	public synchronized void setPalabra(String palabra) {
		this.palabra = palabra;
		listaPalabras.add(palabra);
		notify();
	}
}
