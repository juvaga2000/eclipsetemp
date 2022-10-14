public class Padre {
	public static void main(String[] args) {
		Numero numero = new Numero(0);
		int cuenta = 0;

		Hijo hijo1=new Hijo("A");
		Hijo hijo2=new Hijo("B");
		Hijo hijo3=new Hijo("C");
		Hijo hijo4=new Hijo("D");
		Hijo hijo5=new Hijo("E");
		
		while (numero.getDato() < 100000) {
			synchronized (numero) {
				numero.setDato(numero.getDato() + 1);
				cuenta++;
			}
		}
		
		System.out.println("P total: " + cuenta);
	}
}
