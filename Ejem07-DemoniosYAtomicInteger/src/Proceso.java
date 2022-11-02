import java.util.concurrent.atomic.AtomicInteger;

public class Proceso extends Thread{

	AtomicInteger datoCompartido;
	public Proceso(String string,AtomicInteger datoCompartido) {
		super(string);
		this.datoCompartido=datoCompartido;
	}
	

	@Override
	public void run() {
		super.run();
		for(int i=0;i<1000;i++) {
			System.out.println(getName()+" :"+datoCompartido.getAndIncrement());
		}
	}
}
