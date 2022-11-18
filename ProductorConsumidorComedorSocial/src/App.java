import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		Plato plato=new Plato();
		List<Persona> consumidores = new ArrayList<>();
		
		for(int i=1;i<=100;i++) {
			String nombre="Persona-"+i;
			Persona persona=new Persona(nombre,plato);
			persona.start();
		}
		
		Cocinero cocinero=new Cocinero(plato);
		cocinero.start();
	}

}
