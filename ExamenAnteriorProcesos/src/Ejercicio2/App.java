package Ejercicio2;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		ArrayList<Botella> botellas=new ArrayList<>();
		Gota gota=new Gota(1);
		
		Fuente fuente=new Fuente(gota);
		
		for(int i=1;i<=4;i++) {
			String nombre="Botella-"+i;
			botellas.add(new Botella(nombre,gota));
		}
		
		for(Botella b:botellas) {
			b.start();
		}

		
	}

}
