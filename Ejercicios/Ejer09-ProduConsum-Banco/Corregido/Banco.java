

public class Banco extends Thread {

	private Ventanilla ventanilla;
	private int total = 23000000;

	public Banco(Ventanilla ventanilla) {
		super();
		this.ventanilla = ventanilla;
	}

	@Override
	public void run() {
		super.run();
		int cantidad;
		boolean salir = false;

		while (!salir) {
			
			cantidad = (int) (Math.random() * 1000000) + 1000000;

			if (total > cantidad) {
				total -= cantidad;
				ventanilla.setDinero(cantidad);
			} else {
				ventanilla.setDineroAcabado(true);
				salir = true;
			}

			/*try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}*/
		}

	}
}
