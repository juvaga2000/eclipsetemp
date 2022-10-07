
public class Hijo implements Runnable {

	//Se hace mejor con "implements Runnable" y no con "extends Thread" por que solo se podría hacer una sola
	//extend en la clase y esto te capa. Implements se podía hacer los que quisiseras.
	
	Thread procesoHijo;
	public Hijo() {
		super();
		procesoHijo = new Thread(this);
		procesoHijo.start();
	}

	@Override
	public void run() {
		System.out.println("Soy hijo");
	}

}
