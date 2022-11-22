import java.util.ArrayList;
import java.util.List;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Consumidor> consumidores = new ArrayList<>();
		Plato plato = new Plato();
		// En realidad el enunciado marca hasta 100 comensales, si queremos probar qué
		// pasa con 90 comidas para 100 comensales lo dejamos como en la línea siguiente:
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
