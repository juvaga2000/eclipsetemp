
public class Hijo extends Thread {
	
	private Numero num;
	private int maxNum = 10000;
	private int contador; // Contador individualizado de cada proceso.
	
	public Hijo(String name, Numero num) {
		super(name);
		this.num = num;
	}

	@Override
	public void run() {
		super.run();
		while (num.getNumero() < maxNum && !Thread.currentThread().isInterrupted()) {
			synchronized (num) {
				if(num.getNumero() < maxNum) {
					System.out.println("Soy " + getName() + ": " + num);
					num.setNumero(num.getNumero() + 1);
					contador++;
				}
			}
			//Thread.yield();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		System.out.println("Yo, " + getName() + " he contado " + contador + " veces");
	}

}
