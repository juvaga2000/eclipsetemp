
public class Hijo extends Thread {

	private Numero num;
	private int contador;
	
	public Hijo(ThreadGroup group, String name, Numero num) {
		super(group, name);
		this.num = num;
		
		System.out.println(name + " creado.");
	}
	
	@Override
	public void run() {
		super.run();
		
		while (num.getNum() < Aplicacion.maxNumeroContar) {
			synchronized (num) {
				if(num.getNum() < Aplicacion.maxNumeroContar) {
					System.out.println("Soy " + getName() + ": " + num);
					num.setDato(num.getNum() + 1);
					contador++;
				}
			}
		}
		
		System.out.println("Yo, " + getName() + " he contado " + contador + " veces (prioridad:" + getPriority() + ")");
	}

	
}
