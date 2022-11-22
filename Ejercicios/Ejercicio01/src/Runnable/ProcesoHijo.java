package runnable;

public class ProcesoHijo implements Runnable {
	
	Thread procesoHijo;
	
	public ProcesoHijo() {
		super();
		procesoHijo=new Thread(this);
		procesoHijo.start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 2000; i++) {
			System.out.println("HIJO");
			System.out.println(i);
		}
	}
	
	
}
