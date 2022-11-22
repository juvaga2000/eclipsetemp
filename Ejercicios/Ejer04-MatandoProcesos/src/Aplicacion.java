import java.util.ArrayList;

/*
 * 
 * Creamos 5 procesos, con un contador común (que llegará hasta 10000).
 * Cada proceso incrementará el contador una unidad y posteriormente dormirá
 * 10 milisegundos. El proceso padre, después de 200 milisegundos, matará a 
 * todos los hijos que automáticamente dejarán de incrementar el contador
 * y mostrar el número en el que se llegan.
 * 
 */
public class Aplicacion {
	public static void main(String[] args) {
		Numero numero = new Numero(0);
		ArrayList<Hijo> hijos = new ArrayList<>();
		

		
		for (int i = 1; i <= 5; i++) {
			Hijo hijo = new Hijo("Hijo" + i, numero);
			hijos.add(hijo);
			hijo.start();
		}
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		
		for (Hijo hijo : hijos) {
			hijo.interrupt();
		}
	}
}
