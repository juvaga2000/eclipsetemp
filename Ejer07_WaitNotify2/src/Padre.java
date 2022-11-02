
public class Padre {
	/*Cada 3 segundos (aproximado, simplemente con un Thread.sleep(3000), 
	se van a generar 5 números aleatorios , una vez generados despertaremos 
	cinco procesos que cogerán cada uno de esos números aleatorios mostrando 
	por pantalla qué número han cogido (lógicamente no podrán coger el mismo). 
	Optimiza la aplicación para que no haya procesos que estén ociosos con 
	tiempo de CPU. El proceso padre cuando finalice de generar los cinco 
	números aleatorios mostrará un string por consola informando de que se han
	generado. Finalizar la aplicación después de haber generado tres veces 
	cinco números aleatorios.*/
	

	public static void main(String[] args) {
		int vecesGenerado=0;
		Hijo hijo1=new Hijo("A", null);
		Hijo hijo2=new Hijo("B", null);
		Hijo hijo3=new Hijo("C", null);
		Hijo hijo4=new Hijo("D", null);
		Hijo hijo5=new Hijo("E", null);
		hijo1.start();
		hijo2.start();
		hijo3.start();
		hijo4.start();
		hijo5.start();
		
		while(vecesGenerado!=3) {
			Numero n1=new Numero((int) (Math.random()*100));
			Numero n2=new Numero((int) (Math.random()*100));
			Numero n3=new Numero((int) (Math.random()*100));
			Numero n4=new Numero((int) (Math.random()*100));
			Numero n5=new Numero((int) (Math.random()*100));
			hijo1.setNumero(n1);
			hijo2.setNumero(n2);
			hijo3.setNumero(n3);
			hijo4.setNumero(n4);
			hijo5.setNumero(n5);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			vecesGenerado++;
			System.out.println("Se ha generado la tanda numero "+vecesGenerado);
		}
	}
}
