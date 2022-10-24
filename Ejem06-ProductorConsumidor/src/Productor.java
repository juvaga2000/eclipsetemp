
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
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		dato.setColocado(true);
	}

}
