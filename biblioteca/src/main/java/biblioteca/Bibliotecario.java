package biblioteca;

public class Bibliotecario {

	public static final String EL_LIBRO_NO_SE_ENCUENTRA_DISPONIBLE = "El libro no se encuentra disponible";
	private RepositorioLibros repositorioLibros;

	public Bibliotecario(RepositorioLibros repositorioLibros) {
		this.repositorioLibros = repositorioLibros;

	}

	public void prestar(String isbn) {
		if(!esPrestado(isbn)) {
			Libro libroAPrestar = repositorioLibros.obtenerLibroDisponiblePorIsbn(isbn);
			repositorioLibros.agregarLibroPrestados(libroAPrestar);
			repositorioLibros.removerLibroDisponibles(libroAPrestar);
		}
		else {
			throw new PrestamoException(EL_LIBRO_NO_SE_ENCUENTRA_DISPONIBLE);
		}
	}

	public boolean esPrestado(String isbn) {

		return repositorioLibros.obtenerLibroPrestadoPorIsbn(isbn) != null;

	}

}
