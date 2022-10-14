
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hijo hijo=new Hijo("1");
		hijo.start();
		
		
			try {
				hijo.join(); //Espera a la finalización del proceso para continuar
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		Hijo hijo2=new Hijo("2");
		hijo2.start();
		
		hijo.interrupt();
		
	}

}
