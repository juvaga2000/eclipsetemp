
public class Persona extends Thread {

	Plato plato;
	
	public Persona(String nombre,Plato plato) {
		super(nombre);
		this.plato=plato;
	}
	
	@Override
	public void run() {
		if(plato.isDisponible()) {
			System.out.println(this.getName()+"  : He comido");
		}
			
	}

}
