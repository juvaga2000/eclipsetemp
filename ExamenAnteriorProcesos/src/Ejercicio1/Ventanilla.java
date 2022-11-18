package Ejercicio1;

import java.util.concurrent.atomic.AtomicInteger;

public class Ventanilla extends Thread{

	AtomicInteger entrada;
	int vendidas=0;

	public Ventanilla(String nombre, AtomicInteger entrada) {
		super(nombre);
		this.entrada = entrada;
	}
	
	
	public int getVendidas() {
		return vendidas;
	}


	public void setVendidas(int vendidas) {
		this.vendidas = vendidas;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i=0;i<1250;i++) {
			System.out.println(getName()+" :"+entrada.getAndIncrement());
			vendidas++;
		}
	}
	
}
