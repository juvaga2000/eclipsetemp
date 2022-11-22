

public class Consumidor extends Thread{
	
	private Dato dato;
	
	public Consumidor(String name, ThreadGroup grupo, Dato dato) {
		super(grupo, name);
		this.dato = dato;
	}

	@Override
	public void run() {
		super.run();
		String palabraRecogida=null;
		do
		{
			palabraRecogida=dato.getPalabra();
			System.out.println(this.getName() + ", he recogido : " + palabraRecogida);
		}while(!palabraRecogida.equalsIgnoreCase("fin") || palabraRecogida==null);
		System.out.println(this.getName() + " finaliza");
	}
	
}
