package Ejercicio;

public class Hijo extends Thread{

	private Numero numeroCompartido;
	private int cont = 0;
	
	public Hijo(String nombre, Numero numero) {
		super(nombre);
		this.numeroCompartido = numero;
	}
	
	@Override
	public void run() {
		super.run();
		
		for (int i = numeroCompartido.getNumero(); i < 10000; i++) {
			synchronized (numeroCompartido) {
				cont++;
				System.out.println(this.getName() + " : " + numeroCompartido.getNumero());
				numeroCompartido.setNumero(i);
			}
		}
		//System.out.println(this.getName() + " : " + cont);
	}
	
	public int contador() {
		return cont;
	}
}
