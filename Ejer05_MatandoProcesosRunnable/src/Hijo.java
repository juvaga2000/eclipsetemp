public class Hijo implements Runnable {
	public Numero numero;
	private String nombreHijo;
	Thread hijo;

	public Hijo(String nombre, Numero numero, ThreadGroup g) {
		super();
		this.numero = numero;
		this.nombreHijo=nombre;
		hijo = new Thread(this);
		hijo.start();
	}

	@Override
	public void run() {
		while (numero.getDato() < 5000 && !hijo.isInterrupted()) {
			synchronized (numero) {
				if (numero.getDato() < 5000) {
					numero.setDato(numero.getDato() + 1);
					System.out.println(this.nombreHijo + ": " + numero.getDato());
					
					if(numero.getDato()==5000) {
						hijo.getThreadGroup().interrupt();
						System.out.println(hijo.getName()+": Hermanos destruidos");
					}
					
				}
			}
		}
	}
}
