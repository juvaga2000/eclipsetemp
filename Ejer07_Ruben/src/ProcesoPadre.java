import java.util.ArrayList;
import java.util.Random;

public class ProcesoPadre {
public static void main(String[] args) {
	Random r = new Random();
	Numero[] numeros = new Numero[5];
	ArrayList<ProcesoHijo>Hijos = new ArrayList<>();
	for(int i = 0;i<5;i++) {
		Hijos.add(new ProcesoHijo("Hijo "+(i+1)));
	}
	for(ProcesoHijo hijo : Hijos) {
		hijo.start();
	}
	for(int i  =0; i<3;i++) {
	try {
		int cont = 0;
		Thread.sleep(3000);
		for(int j = 0;j<5;j++) {
			numeros[j]= new Numero(r.nextInt(0,100));
			//Comprobamos que numeor se añade
			//System.out.println(numeros[j].toString());
		}
		System.out.println("Ya he creado 5 numeros");
		for(ProcesoHijo hijo : Hijos) {
			hijo.setNumero(numeros[cont]);
			cont++;
		}
		
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
}
