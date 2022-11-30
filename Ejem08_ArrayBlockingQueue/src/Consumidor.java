import java.util.concurrent.ArrayBlockingQueue;

public class Consumidor extends Thread{

	ArrayBlockingQueue<Integer> datosCompartidos=new ArrayBlockingQueue<>(5);
	
	public Consumidor(ArrayBlockingQueue<Integer> datosCompartidos, String name) {
		super(name);
		this.datosCompartidos=datosCompartidos;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		for(int i=1;i<=10;i++) {
			try {
				System.out.println(currentThread().getName()+" : "+datosCompartidos.take());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
