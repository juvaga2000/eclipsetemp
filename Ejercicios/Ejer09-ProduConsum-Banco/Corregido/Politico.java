

public class Politico extends Thread {

	private int totalRobado = 0;
	private Ventanilla ventanilla;

	public Politico(String name, Ventanilla ventanilla) {
		super(name);
		this.ventanilla = ventanilla;
	}

	@Override
	public void run() {
		super.run();

		while (!ventanilla.isDineroAcabado()) {
			int robado = ventanilla.getDinero();
			totalRobado += robado;
			if (robado > 0) {				
				System.out.println(this.getName() + ", he robado : " + robado);
			}
		}
		System.out.println(this.getName() + ", en total he robado : " + totalRobado);
	}
}
