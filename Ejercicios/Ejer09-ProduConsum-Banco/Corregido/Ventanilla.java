

public class Ventanilla {
	//Objeto compartido
	
	private int dineroDisponible;
	private boolean isDineroAcabado = false;
	private boolean isDineroColocado = false;

	public Ventanilla() {
		super();
	}

	public synchronized int getDinero() {

		while (!isDineroColocado && !isDineroAcabado) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		if (isDineroAcabado)
			return 0;
		else
		{
			isDineroColocado = false;
			int aux = dineroDisponible;
			dineroDisponible = 0;
			return aux;
		}
	}

	public synchronized void setDinero(int cantDinero) {
		this.dineroDisponible = cantDinero;
		isDineroColocado = true;
		notifyAll();
	}

	public synchronized boolean isDineroAcabado() {
		return isDineroAcabado;
	}

	public synchronized void setDineroAcabado(boolean isDineroAcabado) {
		this.isDineroAcabado = isDineroAcabado;
		notifyAll();
	}
}
