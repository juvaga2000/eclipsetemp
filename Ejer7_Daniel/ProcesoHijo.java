import java.util.Iterator;

public class ProcesoHijo extends Thread {

	Numeros numeros;
	int numero;
	
	public ProcesoHijo(String string, Numeros numeros) {
		super(string);
		this.numeros = numeros;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		for (int i=0;i<3;i++) {
			System.out.println(getName()+": "+numeros.getNumeroAleatorio());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
