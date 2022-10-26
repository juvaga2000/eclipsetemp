
public class Aplicacion {

	public static void main(String[] args) {
		Dato dato=new Dato(false);
		Productor p = new Productor(dato);
		Consumidor c = new Consumidor(dato,"c1");
		Consumidor c2 = new Consumidor(dato,"c2");
		p.start();
		c.start();
		c2.start();
	}
}
