public class Hijo extends Thread {
	private Numero numero;
	private int cuenta;

	public Hijo(String nombre, Numero numero,ThreadGroup g) {
		super(g,nombre);
		this.numero = numero;
	}

	@Override
	public void run() {
		super.run();
		while (numero.getDato() < 10000) {
			synchronized (numero) {
				if (numero.getDato() < 10000) {
					numero.setDato(numero.getDato() + 1);
					System.out.println(getName() + ": " + numero.getDato());
					cuenta++;
				}
			}
		}
		System.out.println(getName() + " total: " + cuenta);
	}
}
