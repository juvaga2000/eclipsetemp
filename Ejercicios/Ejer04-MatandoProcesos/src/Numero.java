
public class Numero {

	private int numero;

	public Numero(int dato) {
		super();
		this.numero = dato;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int dato) {
		this.numero = dato;
	}

	@Override
	public String toString() {
		return "Numero [" + numero + "]";
	}
		
}
