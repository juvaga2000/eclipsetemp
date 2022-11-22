package org.amrv.ejer09;

import java.util.Random;

public class Banco extends Thread {

	private long money;
	private final long minRelease;
	private final long maxRelease;
	private final long minUnit;
	private final Ventanilla ventana;
	private final Random rnd;
	private final long minRest;
	private final long maxRest;

	public Banco(long money, long minRelease, long maxRelease, long minUnit, long minRest, long maxRest,
			Ventanilla ventanilla) {
		this.money = money;
		this.minRelease = minRelease;
		this.maxRelease = maxRelease;
		this.minUnit = minUnit;
		this.ventana = ventanilla;
		this.rnd = new Random();
		this.maxRest = Math.max(minRest, maxRest);
		this.minRest = Math.min(minRest, maxRest);
		;
		this.ventana.setOpen(true);
	}

	private boolean mustClose() {
		return money <= 0;
	}

	private long getAmount() {
		long amount = minRelease;
		int rawAddition = rnd.nextInt((int) (maxRelease / minUnit));
		long addition = rawAddition * minUnit;
		// System.out.println(">> " + Initializer.formatNumber(amount) + " " +
		// rawAddition + " x " + minUnit);
		return amount + addition;
	}

	private synchronized void retireAmount(long amount) {
		if (this.money < amount)
			amount = this.money;

		// System.err.println("<< " + Initializer.formatNumber(amount) + " <- " +
		// Initializer.formatNumber(this.money));
		this.money -= amount;
		ventana.addMoney(amount);
	}

	private void waitForNextOutput() {
		if (minRest > maxRest || (maxRest <= 0 && minRest <= 0))
			return;

		long sleepTime = maxRest == minRest ? minRest : rnd.nextInt((int) (maxRest - minRest) + 1) + minRest;
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
		}

	}

	@Override
	public void run() {
		while (!mustClose()) {

			if (!ventana.hasMoney()) {
				retireAmount(getAmount());
				waitForNextOutput();
			}
		}
		ventana.setOpen(false);
	}

}
