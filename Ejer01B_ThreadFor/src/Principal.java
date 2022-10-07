
public class Principal {

	public static void main(String[] args) {
		Hijo h1 = new Hijo();
		h1.start();
		for (int i = 0; i < 100; i++) {
			System.out.println("Padre "+ i);
		}
	}

}
