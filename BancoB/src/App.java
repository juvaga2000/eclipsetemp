import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		
		ArrayList<Politico> politicos=new ArrayList<Politico>();
		
		for(int i=0;i<=9;i++) {
			String nombre="Politico-"+i;
			politicos.add(new Politico(nombre));
		}
		
		
		
		for (Politico politico : politicos) {
			politico.start();
		}
		
		
	}
}