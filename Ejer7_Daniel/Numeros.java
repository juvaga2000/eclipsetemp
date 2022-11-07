import java.util.ArrayList;
import java.util.List;

public class Numeros {

	private List<Integer> numerosAleatorios = new ArrayList<Integer>();

	public synchronized void setNumeroAleatorio(int numero) {
		numerosAleatorios.add(numero);
		notify();

	}
	public synchronized int getNumeroAleatorio() {
		if (numerosAleatorios.size()>0)
			return numerosAleatorios.remove(0);
		else
		{
			try {
				wait();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return numerosAleatorios.remove(0);
		}
	}
}
