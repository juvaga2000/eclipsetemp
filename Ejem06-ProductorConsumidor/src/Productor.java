
public class Productor extends Thread {

	
	private Dato dato;
	public Productor(Dato dato) {
		// TODO Auto-generated constructor stub
		this.dato = dato;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i=0;i<2;i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			dato.setColocado(true);
		}
		
	}

}
