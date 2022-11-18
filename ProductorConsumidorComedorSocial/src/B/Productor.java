package B;

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
		}
		plato.finish();
	}
	
	
	
	
}
