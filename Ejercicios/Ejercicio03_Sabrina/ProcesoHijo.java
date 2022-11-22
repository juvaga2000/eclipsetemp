package Ejercicio;


public class ProcesoHijo extends Thread {

	private Numero datoCompartido;
	private int cont = 0;

	public int getCont() {
		return cont;
	}

	public ProcesoHijo(String name, Numero num, ThreadGroup grupo) {
		super(grupo, name);
		// TODO Auto-generated constructor stub
		System.out.println("Construyendo el hijo");
		datoCompartido = num;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while (datoCompartido.getDato() < 100000) {
			synchronized (datoCompartido) {
				if (datoCompartido.getDato() < 100000) {
					System.out.println("Hijo " + getName() + ": " + datoCompartido.getDato());
					int temporal = datoCompartido.getDato();
					temporal++;
					datoCompartido.setDato(temporal);
					cont++;
				}
			}
		}
	}
}
