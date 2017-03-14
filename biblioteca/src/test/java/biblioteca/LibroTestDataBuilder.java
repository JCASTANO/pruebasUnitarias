package biblioteca;

public class LibroTestDataBuilder {

	private String isbn;
	private String titulo;
	private Editorial editorial;
	private Autor autor;
	private int anio;

	public LibroTestDataBuilder() {
		this.isbn = "1234";
		this.titulo = "Cien años de soledad";
		this.editorial = new Editorial("Norma");
		this.autor = new Autor("Grabiel", "Garcia Marquez");
		this.anio = 2010;
	}

	public LibroTestDataBuilder conTitutlo(String titulo) {
		this.titulo = titulo;
		return this;
	}
	
	public LibroTestDataBuilder conIsbn(String isbn) {
		this.isbn = isbn;
		return this;
	}
	
	public LibroTestDataBuilder conEditorial(Editorial editorial) {
		this.editorial = editorial;
		return this;
	}
	
	public LibroTestDataBuilder conAutor(Autor autor) {
		this.autor = autor;
		return this;
	}
	
	public LibroTestDataBuilder conAnio(int anio) {
		this.anio = anio;
		return this;
	}

	public Libro build() {
		return new Libro(isbn, titulo, editorial, autor, anio);
	}

}
