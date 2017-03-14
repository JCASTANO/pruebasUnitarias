package biblioteca;

import org.junit.Assert;
import org.junit.Test;

public class BibliotecarioTest {

	@Test
	public void prestarLibroTest() {

		// arrange
		Libro libro = new LibroTestDataBuilder().conTitutlo("Cronica de una muerta anunciada").build();
		RepositorioLibros repositorioLibros = new RepositorioLibrosTestDataBuilder().conLibroDisponible(libro).build();
		Bibliotecario blibliotecario = new Bibliotecario(repositorioLibros);

		// act
		blibliotecario.prestar(libro.getIsbn());

		// assert
		Assert.assertTrue(blibliotecario.esPrestado(libro.getIsbn()));
		Assert.assertNotNull(repositorioLibros.obtenerLibroPrestadoPorIsbn(libro.getIsbn()));

	}

}
