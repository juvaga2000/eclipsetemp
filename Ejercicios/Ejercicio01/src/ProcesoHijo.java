
public class ProcesoHijo extends Thread{
	
	
	public ProcesoHijo() {
		super();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 2000; i++) {
			System.out.println("HIJO");
			System.out.println(i);
		}
		
		
	}

	
}
