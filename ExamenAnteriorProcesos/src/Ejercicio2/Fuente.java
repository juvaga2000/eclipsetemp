package Ejercicio2;

import java.util.Random;

public class Fuente extends Thread{
	Gota gota;

	public Fuente(Gota gota) {
		super();
		this.gota = gota;
	}
	
	@Override
	public void run() {
		super.run();
		Random r=new Random();
		int ms=r.nextInt(1,10);
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		gota.caer();
	}
}
