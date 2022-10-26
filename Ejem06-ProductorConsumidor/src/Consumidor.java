
public class Consumidor extends Thread{

	Dato dato;
	String nombre;

	public Consumidor(Dato dato, String nombre) {
		super(nombre);
		this.dato = dato;
		this.nombre=nombre;
	}
	
	public void run() {
		super.run();
		if(dato.isColocado())
			System.out.println(this.nombre+": Dato colocado y lo he consumido");
		else
			System.out.println(this.nombre+": Dato NO colocado");
	}
}
