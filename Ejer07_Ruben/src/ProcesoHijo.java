
public class ProcesoHijo extends Thread{
private Numero numero;
private String nombre;
public ProcesoHijo(String nombre) {
	this.nombre=nombre;
}
@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		super.run();
		try {
			for(int i = 0;i<3;i++) {
			wait();
			System.out.println("Soy "+nombre+" y he cogido el "+numero.toString());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//this.interrupt();
	}
public Numero getNumero() {
	return numero;
}
public synchronized void setNumero(Numero numero) {
	notify();
	this.numero = numero;
}

}
