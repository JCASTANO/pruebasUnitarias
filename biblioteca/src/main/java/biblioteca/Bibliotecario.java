package biblioteca;

public class Bibliotecario {

	private RepositorioLibros repositorioLibros;

	public Bibliotecario(RepositorioLibros repositorioLibros) {
		this.repositorioLibros = repositorioLibros;

	}

	public void prestar(String isbn) {
		Libro libroAPrestar = repositorioLibros.obtenerLibroDisponiblePorIsbn(isbn);
		repositorioLibros.agregarLibroPrestados(libroAPrestar);
		repositorioLibros.removerLibroDisponibles(libroAPrestar);
	}

	public boolean esPrestado(String isbn) {

		return repositorioLibros.obtenerLibroPrestadoPorIsbn(isbn) != null;

	}

}
