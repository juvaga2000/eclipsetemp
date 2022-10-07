
public class Hijo implements Runnable {

	Thread procesohijo;
	
	public Hijo() {
		super();
		procesohijo = new Thread(this);
		procesohijo.start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Hijo "+i);
		}
	}

}
