import java.util.concurrent.ArrayBlockingQueue;

public class Productor extends Thread{

	ArrayBlockingQueue<Integer> datosCompartidos=new ArrayBlockingQueue<>(1);
	
	public Productor(ArrayBlockingQueue<Integer> datosCompartidos) {
		this.datosCompartidos=datosCompartidos;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		for(int i=1;i<=60;i++) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			datosCompartidos.add(i);
		}
	}
}
