package Ejercicio;

import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) throws InterruptedException {

		Scanner sc = new Scanner(System.in);
		Numero num = new Numero(0);
		int numProcesos = 0;

		do {
			System.out.print("Introduce un numero de procesos para crear(minimo 2): ");
			numProcesos = sc.nextInt();
			if (numProcesos < 2)
				System.out.println("El numero no puede ser menos que 2");
		} while (numProcesos < 2);

		ThreadGroup grupo1 = new ThreadGroup("Primer hijo");
		ThreadGroup grupo2 = new ThreadGroup("Resto");

		for (int i = 0; i < numProcesos - 1; i++) {
			if (i == 0) {
				ProcesoHijo hijo = new ProcesoHijo("Hijo" + (i + 1), num, grupo1);
				hijo.setPriority(Thread.MIN_PRIORITY);
				hijo.start();
				System.out.println(hijo.getName() + " ha contado " + hijo.getCont());
			} else {
				ProcesoHijo hijo = new ProcesoHijo("Hijo" + (i + 1), num, grupo2);
				hijo.setPriority(Thread.MAX_PRIORITY);
				hijo.start();
				System.out.println(hijo.getName() + " ha contado " + hijo.getCont());
			}
		}
	}
}
