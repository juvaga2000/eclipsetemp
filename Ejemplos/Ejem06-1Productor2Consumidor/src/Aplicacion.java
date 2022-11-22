
public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dato dato=new Dato(false);
		Productor p=new Productor(dato);
		Consumidor c=new Consumidor(dato,"c1");
		
		p.start();

		c.start();
		
		Consumidor c2=new Consumidor(dato,"c2");
		c2.start();
		

	}

}
