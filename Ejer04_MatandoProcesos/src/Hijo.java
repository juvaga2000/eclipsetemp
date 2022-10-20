public class Hijo extends Thread {
	public Numero numero;
	private int cuenta;
	public int ultimo;

	public Hijo(String nombre, Numero numero) {
		super(nombre);
		this.numero = numero;
	}

	
	public String getCuenta() {
		return this.getName()+" total: "+this.cuenta;
	}


	public void setCuenta(int cuenta) {
		this.cuenta = cuenta;
	}

	@Override
	public void run() {
		super.run();
		while (numero.getDato() < 10000 && !this.isInterrupted()) {
			synchronized (numero) {
				if (numero.getDato() < 10000) {
					numero.setDato(numero.getDato() + 1);
					System.out.println(getName() + ": " + numero.getDato());
					cuenta++;
				}
			}
			ultimo=numero.getDato();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
	}
}
