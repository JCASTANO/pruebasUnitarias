package repositorio;

import java.util.List;

import dominio.Libro;

public class RepositorioLibros {

	private List<Libro> librosPrestados;

	private List<Libro> librosDisponibles;

	public RepositorioLibros(List<Libro> librosPrestados, List<Libro> librosDisponibles) {
		this.librosDisponibles = librosDisponibles;
		this.librosPrestados = librosPrestados;
	}

	public Libro obtenerLibroPrestadoPorIsbn(String isbn) {

		return librosPrestados.stream().filter(libro -> libro.getIsbn().equals(isbn)).findFirst().orElse(null);
	}

	public Libro obtenerLibroDisponiblePorIsbn(String isbn) {
		return librosDisponibles.stream().filter(libro -> libro.getIsbn().equals(isbn)).findFirst().orElse(null);
	}

	public void agregarLibroPrestados(Libro libro) {
		librosPrestados.add(libro);
	}

	public void agregarLibroDisponibles(Libro libro) {
		librosDisponibles.add(libro);

	}

	public void removerLibroDisponibles(Libro libro) {
		librosDisponibles.remove(libro);
	}

}
