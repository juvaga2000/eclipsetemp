package Ejercicio1;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

import Ejercicio2.Botella;

public class App {

	public static void main(String[] args) {
		
		AtomicInteger entrada=new AtomicInteger();
		ArrayList<Ventanilla> ventanillas=new ArrayList<>();
		
		
		for(int i=1;i<=4;i++) {
			String nombre="Botella-"+i;
			ventanillas.add(new Ventanilla(nombre,entrada));
		}
		
		for(Ventanilla v:ventanillas) {
			v.start();
		}
		
		try {
			Thread.sleep(600);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(Ventanilla v:ventanillas) {
			System.out.println("La taquilla "+ v.getName()+" ha vendido "+v.getVendidas()+ " entradas");
		}
	}

}
