import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("¿Cuantos hilos quieres crear?");
		int hilos=sc.nextInt();
		Numero numero = new Numero(0);
		//int hilos=5;
		
		ThreadGroup max = new ThreadGroup("max");
		ThreadGroup min = new ThreadGroup("min");
		
		Hijo A=new Hijo("0", numero,min);
		A.setPriority(Thread.MIN_PRIORITY);
		A.start();
		
		for(int i = 1;i<=hilos;i++) {
			Hijo hijo=new Hijo(String.valueOf(i),numero,max);
			hijo.setPriority(Thread.MAX_PRIORITY);
			hijo.start();
		}
		
		
	}
}
