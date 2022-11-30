import java.util.concurrent.ArrayBlockingQueue;

public class App {

	public static void main(String[] args) {
		
		ArrayBlockingQueue<Integer> datosCompartidos=new ArrayBlockingQueue<>(5);
		
		Consumidor c=new Consumidor(datosCompartidos,"Consumidor-1");
		Consumidor c2=new Consumidor(datosCompartidos,"Consumidor-2");
		Consumidor c3=new Consumidor(datosCompartidos,"Consumidor-3");
		Consumidor c4=new Consumidor(datosCompartidos,"Consumidor-4");
		Consumidor c5=new Consumidor(datosCompartidos,"Consumidor-5");
		Consumidor c6=new Consumidor(datosCompartidos,"Consumidor-6");
		Productor p = new Productor(datosCompartidos);
		c.start();
		c2.start();
		c3.start();
		c4.start();
		c5.start();
		c6.start();
		p.start();
	}
}
