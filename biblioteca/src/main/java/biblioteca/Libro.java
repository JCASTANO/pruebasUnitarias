package biblioteca;

public class Libro {

	private String isbn;
	private String titulo;
	private Editorial editorial;
	private Autor autor;
	private int anio;

	public Libro(String isbn, String titulo, Editorial editorial, Autor autor, int anio) {

		this.isbn = isbn;
		this.titulo = titulo;
		this.editorial = editorial;
		this.autor = autor;
		this.anio = anio;
	}

	public String getTitulo() {
		return titulo;
	}

	public Editorial getEditorial() {
		return editorial;
	}

	public Autor getAutor() {
		return autor;
	}

	public int getAnio() {
		return anio;
	}
	
	public String getIsbn() {
		return isbn;
	}

}
