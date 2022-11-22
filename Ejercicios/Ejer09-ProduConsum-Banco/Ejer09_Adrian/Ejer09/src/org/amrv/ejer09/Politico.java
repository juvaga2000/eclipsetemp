package org.amrv.ejer09;

import java.util.function.Consumer;

public class Politico extends Thread {

	public static final ThreadGroup GRUPO = new ThreadGroup("Politicos");

	private Ventanilla ventanilla;
	private long robado = 0;

	public Politico(String nombre, Ventanilla ventanilla) {
		super(nombre);
		this.ventanilla = ventanilla;
	}

	public long getStolen() {
		return robado;
	}

	@Override
	public void run() {
		while (ventanilla.isOpen()) {
			long amount = 0;

			try {
				amount = ventanilla.grabMoney();
			} catch (InterruptedException e) {
				break;
			}

			if (amount > 0) {
				System.out.println(">> " + this.getName() + " ha robado " + Initializer.formatNumber(amount));
				robado += amount;
			}
		}
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		showStolen();

	}

	public void showStolen() {
		System.out.println(this.getName() + " ha robado " + Initializer.formatNumber(robado));
	}

}
