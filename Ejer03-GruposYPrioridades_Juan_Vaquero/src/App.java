public class App {
	public static void main(String[] args) {
		Numero numero = new Numero(0);
		int hilos=5;
		ThreadGroup max = new ThreadGroup("max");
		ThreadGroup min = new ThreadGroup("min");
		
		Hijo_ A=new Hijo_("0", numero,min);
		A.setPriority(Thread.MIN_PRIORITY);
		A.start();
		
		for(int i = 1;i<=hilos;i++) {
			Hijo_ hijo=new Hijo_(String.valueOf(i),numero,max);
			hijo.setPriority(Thread.MAX_PRIORITY);
			hijo.start();
		}
		
		
	}
}
