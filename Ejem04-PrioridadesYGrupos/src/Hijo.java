
public class Hijo extends Thread{

	public Hijo(String name, ThreadGroup g) {
		super(g,name);
	}
	
	@Override
	public void run() {
		super.run();
		
		System.out.println("Soy el proceso "+getName()+" y estoy en el grupo "+getThreadGroup().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Hijo hermanos[] = new Hijo[getThreadGroup().activeCount()];
		getThreadGroup().enumerate(hermanos);
		/*
		for (int i = 0; i < hermanos.length; i++) {
			System.out.println("Soy "+getName()+" y mi hermano es "+hermanos[i].getName());
		}
		*/
	}
	
}
