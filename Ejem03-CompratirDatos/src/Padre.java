public class Padre {
	public static void main(String[] args) {
		Numero numero = new Numero(0);
		int cuenta = 0;

		new Hijo("A", numero).start();
		new Hijo("B", numero).start();
		new Hijo("C", numero).start();
		new Hijo("D", numero).start();
		new Hijo("E", numero).start();
		
		while (numero.getDato() < 100000) {
			synchronized (numero) {
				numero.setDato(numero.getDato() + 1);
				System.out.println("P: " + numero.getDato());
				cuenta++;
			}
			
		}
		
		System.out.println("P total: " + cuenta);
	}
}
