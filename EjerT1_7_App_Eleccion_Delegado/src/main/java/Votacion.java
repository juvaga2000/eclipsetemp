
public class Votacion {

	String nombre;
	int votos;
	
	public Votacion(String nombre) {
		super();
		this.nombre = nombre;
		this.votos=0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVotos() {
		return votos;
	}

	public void setVotos(int votos) {
		this.votos = votos;
	}
	
	
	
}
