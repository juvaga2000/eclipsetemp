import java.util.Random;

public class Politico extends Thread {
	private Dinero dinero=new Dinero();
	private int cuenta;

	public Politico(String nombre) {
		super(nombre);
	}

	@Override
	public void run() {
		super.run();
		Random r=new Random();
		int n=r.nextInt(10,20);
		
		while (dinero.getDinero() >= 0) {
			synchronized (dinero) {
					System.out.println(getName() + ": " + dinero.getDinero()+" - "+n);	
					dinero.setDinero(dinero.getDinero() - n);
									
			}
			cuenta=cuenta+n;
		}
		System.out.println(getName() + " total: " + cuenta);
	}
}