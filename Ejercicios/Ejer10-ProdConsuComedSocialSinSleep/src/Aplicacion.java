
import java.util.ArrayList;
import java.util.List;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Consumidor> consumidores = new ArrayList<>();
		Plato plato = new Plato();
		Productor cocinero = new Productor("Cocinero",plato,90);
		
		for (int i = 0; i < 100; i++) {
			Consumidor consumidor = new Consumidor("Consumidor: " + (i+1) , plato);
			consumidores.add(consumidor);
		}
		
		cocinero.start();
		for (Consumidor consumidor : consumidores) {
			consumidor.start();
		}
	}

}
