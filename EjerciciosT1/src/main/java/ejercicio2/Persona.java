package ejercicio2;

public class Persona {
	private String nombre;
	private String apellidos;
	private int edad;
	private String contacto;

	public Persona(String nombre, String apellidos, int edad, String contacto) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.contacto = contacto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

}
