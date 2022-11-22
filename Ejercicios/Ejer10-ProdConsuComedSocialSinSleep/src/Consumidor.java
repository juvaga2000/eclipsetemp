

public class Consumidor extends Thread {

	private boolean comido;
	private Plato plato;
	
	public Consumidor(String name, Plato plato) {
		super(name);
		this.plato = plato;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		comido = plato.isTieneComida();
		if(comido)
			System.out.println("Soy " + Thread.currentThread().getName() + " y he comido muy bien");
		else
			System.out.println("Soy " + Thread.currentThread().getName() + " y no me han dado de comer, estoy TRISTE");
	}

	
	
}
