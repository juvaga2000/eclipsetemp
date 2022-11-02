public class Numero {
	private int dato;

	public Numero(int dato) {
		super();
		this.dato = dato;
	}

	public int getDato() {
		return dato;
	}

	public void setDato(int dato) {
		this.dato = dato;
	}

	@Override
	public String toString() {
		return ""+dato;
	}
	
}
