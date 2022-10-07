
public class HolaMundoConProcesos {

	//No se debe llamar directamente a metodo run del hijo, se llama a método start para
	//bifurcar el proceso de ejecución. Saltará de un proceso a otro cuando este cumpla un quantum de ejecución
	
	

	public static void main(String[] args) {
		ProcesoHijo ph = new ProcesoHijo("UwU");
		ph.start();
		ProcesoHijo ph1 = new ProcesoHijo("OwO");
		ph1.start();
		ProcesoHijo ph2 = new ProcesoHijo("EwE");
		ph2.start();
		ProcesoHijo ph3 = new ProcesoHijo("IwI");
		ph3.start();
		for (int i = 0; i < 25; i++) {
			System.out.println(i);
		}
	}
}
