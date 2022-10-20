public class Padre {
	public static void main(String[] args) {
		Numero numero = new Numero(0);
		ThreadGroup g = new ThreadGroup("hermanos");

		Hijo hijo1=new Hijo("A",numero,g);
		Hijo hijo2=new Hijo("B",numero,g);
		Hijo hijo3=new Hijo("C",numero,g);
		Hijo hijo4=new Hijo("D",numero,g);
		Hijo hijo5=new Hijo("E",numero,g);
	}
}
