package org.amrv.ejer09;

public class Ventanilla {

	private boolean open;
	private long money;

	public synchronized void addMoney(long amount) {
		this.money += amount;
	}

	public synchronized long grabMoney() throws InterruptedException {
		long amount = money;
		money = 0l;
		return amount;
	}

	public boolean isOpen() {
		return open;
	}

	public synchronized void setOpen(boolean open) {
		this.open = open;
	}

	public boolean hasMoney() {
		return this.money > 0x0;
	}

}
