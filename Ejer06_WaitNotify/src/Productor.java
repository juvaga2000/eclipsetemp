

import java.util.Scanner;

public class Productor extends Thread{

	private Dato dato;
	private ThreadGroup grupoConsumidores;
	
	public Productor(Dato dato, ThreadGroup grupoConsumidores) {
		super();
		this.dato = dato;
		this.grupoConsumidores = grupoConsumidores; 
	}
	
	@Override
	public void run() {
		super.run();

		Scanner sc = new Scanner(System.in);
		String palabra = "";
		
		do {
			System.out.println("Introduce una palabra : ");
			palabra = sc.next();
			dato.setPalabra(palabra);
			
		} while (!palabra.equalsIgnoreCase("fin"));
		synchronized (dato) {
			dato.notifyAll();	
		}
		
	}
}
