package Ejercicio;

public class Ejercicio {

	/*
	 * Crea 5 procesos y contar entre todos ellos del 1 al 1 000 000
	 * 
	 * Mostrar por pantalla al finalizar cuantos numeros ha contado cada uno
	 * 
	 * Hijo1 : 233
	 * Hijo2 : 234
	 * 
	 * Total :
	 * Hijo 1 -> 25
	 * Hijo 2 -> 54
	 * */
	
	
	
	
	public static void main(String[] args) throws InterruptedException {

		Numero numero = new Numero(1);
		
		Hijo hijo1 = new Hijo("Hijo 1", numero);
		Hijo hijo2 = new Hijo("Hijo 2", numero);
		Hijo hijo3 = new Hijo("Hijo 3", numero);
		Hijo hijo4 = new Hijo("Hijo 4", numero);
		Hijo hijo5 = new Hijo("Hijo 5", numero);
		
		
		hijo1.start();
		hijo2.start();
		hijo3.start();
		hijo4.start();
		hijo5.start();
		
		Thread.sleep(5000);
		
		System.out.println(""
				+ "\nHijo 1 : " + hijo1.contador()
				+ "\nHijo 1 : " + hijo1.contador()
				+ "\nHijo 2 : " + hijo2.contador()
				+ "\nHijo 3 : " + hijo3.contador()
				+ "\nHijo 4 : " + hijo4.contador()
				+ "\nHijo 5 : " + hijo5.contador());
		
		
	}
}
