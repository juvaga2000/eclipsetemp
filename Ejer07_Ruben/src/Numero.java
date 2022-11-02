public class Numero {
	private int valor;

	public Numero(int n) {
		this.valor = n;
	}

	public int getValor() {
		return valor;
	}

	public  void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.valor+"";
	}
}
