

public class App {

	public static void main(String[] args) {
		Dato dato = new Dato();
		ThreadGroup grupo = new ThreadGroup("consumidores");
		Consumidor[] consumidores = new Consumidor[5];
		
		Productor productor = new Productor(dato, grupo);
		productor.start();
		
		for (int i = 0; i < 5; i++) {
			consumidores[i] = new Consumidor("Consumidor" + i, grupo, dato);
			consumidores[i].start();
		}
	}
}
