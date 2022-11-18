package Ejercicio2;

public class Botella extends Thread{

	Gota gota;
	int cantidad;
	
	public Botella(String nombre,Gota gota) {
		super(nombre);
		this.gota=gota;
		cantidad=0;
	}
}
