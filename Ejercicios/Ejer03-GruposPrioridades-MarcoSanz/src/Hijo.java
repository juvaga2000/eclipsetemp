

public class Hijo extends Thread {

	private Numero numero;
	private int repeticiones = 0;

	public Hijo(String nombre, Numero num,ThreadGroup group) {
		super(group, nombre);
		System.out.println("Construido hijo " + this.getName());
		this.numero = num;
		this.repeticiones = 0;

	}

	public int getRepeticiones() {
		return repeticiones;
	}

	@Override
	public void run() {
		super.run();
		for (int i = 0; numero.getDato() < 100000; i++) {
			synchronized (numero) {
				if (numero.getDato() <= 100000) {
					System.out.println(this.getName() + ": " + this.numero.getDato());
					int temporal = numero.getDato();
					temporal++;
					this.numero.setDato(temporal);
					repeticiones++;
					
				}
					
				

			}

		}

	}

}
