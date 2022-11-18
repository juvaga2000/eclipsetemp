
public class Cocinero extends Thread{

	Plato plato = new Plato();
	
	public Cocinero(Plato plato) {
		super();
		this.plato=plato;
	}
	
	@Override
	public void run() { 
		super.run();
		for(int i=1;i<=100;i++) {
			plato.setDisponible(true);
			
			/*
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			*/
		}
		
		
		System.out.println("He terminado");
	}
}
