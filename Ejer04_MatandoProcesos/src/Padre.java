public class Padre {
	public static void main(String[] args) {
		Numero numero = new Numero(0);

		Hijo hijo1=new Hijo("A",numero);
		Hijo hijo2=new Hijo("B",numero);
		Hijo hijo3=new Hijo("C",numero);
		Hijo hijo4=new Hijo("D",numero);
		Hijo hijo5=new Hijo("E",numero);
		hijo1.start();
		hijo2.start();
		hijo3.start();
		hijo4.start();
		hijo5.start();
		
		try {
			Thread.sleep(2000);
			hijo1.interrupt();
			hijo2.interrupt();
			hijo3.interrupt();
			hijo4.interrupt();
			hijo5.interrupt();
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(hijo1.getCuenta());
		System.out.println(hijo2.getCuenta());
		System.out.println(hijo3.getCuenta());
		System.out.println(hijo4.getCuenta());
		System.out.println(hijo5.getCuenta());
		System.out.println("El hijo 1 se interrumpió en el: "+hijo1.ultimo);
		System.out.println("El hijo 2 se interrumpió en el: "+hijo2.ultimo);
		System.out.println("El hijo 3 se interrumpió en el: "+hijo3.ultimo);
		System.out.println("El hijo 4 se interrumpió en el: "+hijo4.ultimo);
		System.out.println("El hijo 5 se interrumpió en el: "+hijo5.ultimo);
	}
}
