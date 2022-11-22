import java.util.Random;

public class Ventanilla {
	private Banco banco;
	private int dineroEnVentanilla = 0;
	private boolean cerrado = false;
	
	public Ventanilla (Banco banco) {
		this.banco = banco;
	}
	
	public synchronized int robar() throws InterruptedException {
		do {
			wait();
		} while(!cerrado && dineroEnVentanilla == 0);
		
		int d = dineroEnVentanilla;
		dineroEnVentanilla = 0;
		
		return d;
	}
	
	public synchronized void colocarDinero() {
		Random r = new Random();
		dineroEnVentanilla = r.nextInt(1000000, 2000001);
		
		if (banco.getDinero() > dineroEnVentanilla)
			banco.setDinero(banco.getDinero() - dineroEnVentanilla);
		else {
			dineroEnVentanilla = banco.getDinero();
			banco.setDinero(0);
		}
		
		notify();
	}
	
	public synchronized void cerrar() {
		cerrado = true;
		notifyAll();
	}

}
