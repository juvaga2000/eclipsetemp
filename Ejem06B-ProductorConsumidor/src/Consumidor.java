
public class Consumidor extends Thread{

	Dato dato;

	public Consumidor(Dato dato) {
		this.dato = dato;
	}
	
	public void run() {
		super.run();
		synchronized (dato) {
			try {
				dato.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		if(dato.isColocado())
			System.out.println("Dato colocado");
		else
			System.out.println("Dato NO colocado");
	}
	}
}
