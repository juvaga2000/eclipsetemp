import java.util.Scanner;

public class App {
	/*
	5 procesos van a "luchar" por recuperar una cadena de texto, que se inserta en una variable de tipo String.
	La palabra añadida desde consola, será la recuperada justo después de pulsar el intro.
	Al finalizar la aplicación, el proceso principal, mostrará todas las cadenas introducidas,
	y evidentemente no quedarán procesos en ejecución.
	Se dejará de pedir datos al usuario, cuando éste inserte la cadena "fin". Debemos tener en cuenta,
	que un mismo proceso podría recuperar varias cadenas de texto.
	*/
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String palabra="";
		Productor p = new Productor("");
		Consumidor c1=new Consumidor("c1");
		Consumidor c2=new Consumidor("c2");
		Consumidor c3=new Consumidor("c3");
		Consumidor c4=new Consumidor("c4");
		Consumidor c5=new Consumidor("c5");
		p.start();
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		c5.start();
		do {
			System.out.println("Introduce la palabra.\"fin\" para finalizar");
			if(!palabra.equals("fin")) {
				palabra=sc.next();
				p.setPalabra(palabra);
				c1.setPalabra(palabra);
				c2.setPalabra(palabra);
				c3.setPalabra(palabra);
				c4.setPalabra(palabra);
				c5.setPalabra(palabra);
			}
		}while(!palabra.equals("fin"));
	}
}
