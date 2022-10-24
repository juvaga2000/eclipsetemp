
public class Consumidor extends Thread{

	Dato dato;

	public Consumidor(Dato dato) {
		this.dato = dato;
	}
	
	public void run() {
		super.run();
		if(dato.isColocado())
			System.out.println("Dato colocado");
		else
			System.out.println("Dato NO colocado");
	}
}
