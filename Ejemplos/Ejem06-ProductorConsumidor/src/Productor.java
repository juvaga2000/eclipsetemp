
public class Productor extends Thread {

	Dato dato;
	public Productor(Dato dato) {
		// TODO Auto-generated constructor stub
		this.dato=dato;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dato.setColocado(true);
		
		
	}
}
