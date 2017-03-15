package dominio;

public class Autor {

	private String nombre;

	private String apellidos;

	public Autor(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getNombre() {
		return nombre;
	}

}
