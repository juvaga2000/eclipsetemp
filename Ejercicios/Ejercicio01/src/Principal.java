
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProcesoHijo hijo = new ProcesoHijo();
		hijo.start();
		for(int i = 0; i < 2000; i++) {
			System.out.println("PADRE");
			System.out.println(i);
		}
	}

}
