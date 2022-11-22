
public class Consumidor extends Thread {

	Dato dato;
	public Consumidor(Dato dato, String name) {
		// TODO Auto-generated constructor stub
		this.dato=dato;
		this.setName(name);
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
			System.out.println(Thread.currentThread().getName()+": Ha recuperado un valor");
		else 
			System.out.println(Thread.currentThread().getName()+"No ha recuperado un valor");
	}

}
