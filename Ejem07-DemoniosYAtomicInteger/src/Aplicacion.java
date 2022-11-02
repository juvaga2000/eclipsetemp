import java.util.concurrent.atomic.AtomicInteger;

public class Aplicacion {

	public static void main(String[] args) {
		AtomicInteger datoCompartido=new AtomicInteger();
		
		//setDaemon se debe indicar antes del start
		//proceso.setDaemon(true);

		Proceso proceso1=new Proceso("p1",datoCompartido);
		Proceso proceso2=new Proceso("p2",datoCompartido);
		Proceso proceso3=new Proceso("p3",datoCompartido);
		proceso1.start();
		proceso2.start();
		proceso3.start();
		System.out.println("Fin");
	}

}
