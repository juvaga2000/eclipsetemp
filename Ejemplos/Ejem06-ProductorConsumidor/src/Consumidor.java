
public class Consumidor extends Thread {

	Dato dato;
	public Consumidor(Dato dato) {
		// TODO Auto-generated constructor stub
		this.dato=dato;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		/*try {
			Thread.sleep(50000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		if (dato.isColocado())
			System.out.println("Ha colocado un valor");
		else 
			System.out.println("No ha colocado un valor");
	}

}
