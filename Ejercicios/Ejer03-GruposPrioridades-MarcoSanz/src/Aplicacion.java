import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {
		Numero num = new Numero(1);
		Scanner sc = new Scanner(System.in);
		List<Hijo> familia = new ArrayList<Hijo>();
		int quant = 1;

		ThreadGroup grupoMin = new ThreadGroup("grupoMin");
		ThreadGroup grupoMax = new ThreadGroup("grupoMax");

		Hijo hijo1 = new Hijo("Hijo1", num, grupoMin);
		hijo1.setPriority(Thread.MIN_PRIORITY);

		System.out.println("¿Cuántos hijos desea crear?");
		try {
			quant = Integer.parseInt(sc.nextLine().strip());
		} catch (NumberFormatException ex) {
			quant = 1;
		}
		Hijo hijo;

		for (int i = 0; i < quant; i++) {
			hijo = new Hijo("Hijo" + (i + 2), num, grupoMax);
			hijo.setPriority(Thread.MAX_PRIORITY);
			familia.add(hijo);
		}
		
		Iterator <Hijo>itera = familia.iterator();
		
		hijo1.start();
		while (itera.hasNext()) {
			hijo = (Hijo) itera.next();
			hijo.start();
			
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Repeticiones " + hijo1.getName() + ": " + hijo1.getRepeticiones());
		System.out.println("Repeticiones promedio " + familia.size() + " hijos: " + getMediaRepeticiones(familia));
		
		sc.close();

	}
	/**
	 * This method returns the average repetitions of the MAX_PRIORITY hijos
	 * @param family
	 * @return Average repetitions
	 */
	public static int getMediaRepeticiones(List<Hijo> family) {
		int media = 0;
		
		Iterator familia = family.iterator();
		
		while (familia.hasNext()) {
			Hijo hijo = (Hijo)familia.next();
			
			media += hijo.getRepeticiones();
		}
		
		media = media / family.size();
		
		
		return media;
		
	}
}
