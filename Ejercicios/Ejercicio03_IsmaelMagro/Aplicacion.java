import java.util.Scanner;

/*
 * Pedir al usuario numero de procesos a crear, contamos sincronizadamente
 * entre todos ellos, teniendo en cuenta que el minimo numero de procesos
 * sera 2, y el primero de ellos estara en un unico grupo y con prioridad minima.
 * El resto de procesos creados en otro grupo tendran prioridad maxima.
 * Analizar si el proceso de prioridad minima cuenta menos veces que
 * alguno de los procesos de prioridad maxima.
 */
public class Aplicacion {
	
	public static final int maxNumeroContar = 100000;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numProcesos = 0;
		
		do {
			try {
				System.out.print("Elige el numero de procesos a crear (>2): ");
				numProcesos = Integer.parseInt(sc.next());
			} catch (NumberFormatException ex) { }
			
			if (numProcesos < 2) 
				System.out.println("Introduce un numero de procesos valido (>2)");
		} while (numProcesos < 2);
		
		sc.close();
		
		Numero numero = new Numero(0);
		
		ThreadGroup grupo1 = new ThreadGroup("grupo1");
		ThreadGroup grupo2 = new ThreadGroup("grupo2");
		
		for (int i = 0; i < numProcesos; i++) {
			Hijo h = new Hijo(i == 0 ? grupo1 : grupo2, "Hijo" + i, numero);
			
			h.setPriority(i == 0 ? Thread.MIN_PRIORITY : Thread.MAX_PRIORITY);
			
			h.start();
		}
		
		
	}
}
