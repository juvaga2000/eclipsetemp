package runnable;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProcesoHijo hijo = new ProcesoHijo();
		for(int i = 0; i < 2000; i++) {
			System.out.println("PADRE");
			System.out.println(i);
		}
	}

}
