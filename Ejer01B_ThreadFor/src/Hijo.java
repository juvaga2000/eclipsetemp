public class Hijo extends Thread{

	public Hijo() {
		super();
	}

	@Override
	public void run() {
		super.run();
		for (int i = 0; i < 100; i++) {
			System.out.println("Hijo "+i);
		}
	}
}
