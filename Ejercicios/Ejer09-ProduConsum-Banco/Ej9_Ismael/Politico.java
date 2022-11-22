
public class Politico extends Thread{

	private int dineroRobado = 0;
	private Banco banco = Aplicacion.banco;
	
	public Politico(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		while (!isInterrupted() && banco.getDinero() > 0) {
			try {
				dineroRobado += banco.ventanilla.robar();
			} catch (InterruptedException e) { interrupt(); }
		}
		
		System.out.println("Soy " + getName() + " y he robado " + dineroRobado);
	}	
}
