package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class RepositorioLibrosTestDataBuilder {

	private List<Libro> librosPrestados;
	private List<Libro> librosDisponibles;

	public RepositorioLibrosTestDataBuilder() {

		librosPrestados = new ArrayList<>();
		librosDisponibles = new ArrayList<>();
	}

	public RepositorioLibrosTestDataBuilder conLibroDisponible(Libro libroDisponible) {
		this.librosDisponibles.add(libroDisponible);
		return this;
	}
	
	public RepositorioLibrosTestDataBuilder conLibroPrestado(Libro libroPrestado) {
		this.librosPrestados.add(libroPrestado);
		return this;
	}

	public RepositorioLibros build() {
		return new RepositorioLibros(librosPrestados, librosDisponibles);
	}

}
