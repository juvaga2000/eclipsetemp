package ejercicio4;

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
		boolean flag = true;

		while (flag) {
			
			cantidad = (int) (Math.random() * 1000000) + 1000000;

			if (total > cantidad) {
				total -= cantidad;
				ventanilla.setTotal(cantidad);
			} else {
				ventanilla.setDineroAcabado(true);
				flag = false;
			}

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}

	}
}
