import java.util.ArrayList;
import java.util.List;

public class Aplicacion {

	public static void main(String[] args) {
		
		Numeros numeros = new Numeros();
		
		ProcesoHijo hijo1 = new ProcesoHijo("Pepe",numeros);
		ProcesoHijo hijo2 = new ProcesoHijo("Ramon",numeros);
		ProcesoHijo hijo3 = new ProcesoHijo("Juan",numeros);
		ProcesoHijo hijo4 = new ProcesoHijo("Margarita",numeros);
		ProcesoHijo hijo5 = new ProcesoHijo("Salomon",numeros);
		
		List<ProcesoHijo> procesos = new ArrayList<ProcesoHijo>();
		procesos.add(hijo1);
		procesos.add(hijo2);
		procesos.add(hijo3);
		procesos.add(hijo4);
		procesos.add(hijo5);
		
		for (ProcesoHijo procesoHijo : procesos) {
			// procesoHijo.setDaemon(true); //Con ésto mueren todos los procesos al finalizar el padre
			procesoHijo.start();
		}
		
		for(int i = 0;i<3;i++) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(int j = 0;j<5;j++) {
				numeros.setNumeroAleatorio((int) (Math.random() * 101));
			}
			System.out.println("-------------------------------------");
		}
		//System.out.println("Aplicación finalizada!!!");
	}
}
