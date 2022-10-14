
public class Hijo extends  Thread{
	
	public Hijo(String name) {
		super(name);
	}
	

	@Override
	public void run() {
		super.run();
		// TODO Auto-generated method stub
		for(int i=0;i<1000 && !isInterrupted();i++) {
			System.out.println("Hijo "+getName()+i);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				//e.printStackTrace();
				Thread.currentThread().interrupt();
				//Se hace esto último porque al haber 2 sleeps en el código como que se solapan y no actuan correctamente.
				//Por lo que no se llega al interrupt de la app. Por ello, si salta excepción, se interrumpe así.
			}
			
			Thread.yield(); //Es equivalente al sleep pero sin tiempo.
		}
		System.out.println("Finalizado");
	}

}
