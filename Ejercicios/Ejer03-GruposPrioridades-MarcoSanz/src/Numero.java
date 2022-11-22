

public class Numero {

	private int dato;
	
	public Numero(int num) {
		this.dato = num;
	}

	public int getDato() {
		return dato;
	}

	public void setDato(int dato) {
		this.dato = dato;
	}
	
	public void incrementarDato() {
		this.dato = dato++;
	}
	
	
}
