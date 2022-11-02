public class Hijo extends Thread {
	public Numero numero;

	public Hijo(String nombre, Numero numero) {
		super(nombre);
		this.numero = numero;
	}

	
	public Numero getNumero() {
		return numero;
	}


	public synchronized void setNumero(Numero numero) {
		notify();
		this.numero = numero;
	}


	@Override
	public void run() {
		try {
			wait();
			System.out.println(getName()+" :"+numero.toString());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
