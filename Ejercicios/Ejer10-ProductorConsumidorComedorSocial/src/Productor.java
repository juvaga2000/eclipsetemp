
public class Productor extends Thread {

	private Plato plato;
	private int platosPreparar;
	
	public Productor(String name,Plato plato,int platosPreparar) {
		super(name);
		this.plato = plato;
		this.platosPreparar = platosPreparar;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for (int i = 0; i < platosPreparar; i++) {
			plato.setTieneComida();
			//La opción b del ejercicio parte de quitar éste Thread.sleep(100). 
			// Gracias a él a los procesos consumidores les da tiempo a coger el plato 
			// de comida generado.
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		plato.finish();
		System.out.println("Hasta otro dia");
	}
	
	
	
	
}
