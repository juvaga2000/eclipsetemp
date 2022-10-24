
public class Aplicacion {

	public static void main(String[] args) {
		Dato dato=new Dato(false);
		Productor p = new Productor(dato);
		Consumidor c = new Consumidor(dato);
		p.start();
		c.start();
	}
}
