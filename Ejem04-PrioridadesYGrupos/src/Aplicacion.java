
public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadGroup g = new ThreadGroup("grupo1");
		Hijo h1=new Hijo("h1",g);
		Hijo h2=new Hijo("h2",g);
		//g.setMaxPriority(Thread.MAX_PRIORITY);
		h1.setPriority(Thread.MAX_PRIORITY);
		h2.setPriority(Thread.MAX_PRIORITY);
		ThreadGroup g2 = new ThreadGroup("grupo2");
		Hijo h3=new Hijo("h3",g2);
		Hijo h4=new Hijo("h4",g2);
		h3.setPriority(Thread.MIN_PRIORITY);
		h4.setPriority(Thread.MIN_PRIORITY);
		
		h1.start();
		h2.start();
		h3.start();
		h4.start();
		
		System.out.println("Soy el padre: "+Thread.currentThread().getThreadGroup().getName());
	}

}
