
public class Banco extends Thread {
	private int dinero = 23000000;
	public Ventanilla ventanilla = new Ventanilla(this);

	public int getDinero() {
		return dinero;
	}

	public void setDinero(int dinero) {
		this.dinero = dinero;
	}

	@Override
	public void run() {
		super.run();
		
		while (dinero > 0) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) { e.printStackTrace(); }
			
			ventanilla.colocarDinero();
		}
		ventanilla.cerrar();
	}

}
