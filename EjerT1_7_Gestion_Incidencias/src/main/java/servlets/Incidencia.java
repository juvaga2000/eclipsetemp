package servlets;


public class Incidencia {

	int id;
	String tema;
	String descripcion;
	
	public Incidencia(int id, String tema, String descripcion) {
		super();
		this.id = id;
		this.tema = tema;
		this.descripcion = descripcion;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
