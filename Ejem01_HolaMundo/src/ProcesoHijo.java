
public class ProcesoHijo extends Thread{
	//Thread implementa runnable y ahora extendemos esta clase para
	//poder sobreescribir el método run y poder modificarlo.
	
	public ProcesoHijo(String string) {
		super(string);
	}
	
	@Override
	public void run() {
		super.run();
		if (this.getName().equals("IwI")||this.getName().equals("OwO")){
				System.out.println("Soy hijo   "+this.getName());
		}else{
			System.out.println("Soy hija   "+this.getName());
		}

	}
}
