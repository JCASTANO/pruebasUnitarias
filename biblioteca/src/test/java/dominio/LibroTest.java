package dominio;

import static org.junit.Assert.*;

import org.junit.Test;

import builder.LibroTestDataBuilder;
import dominio.Autor;
import dominio.Editorial;
import dominio.Libro;

public class LibroTest {

	@Test
	public void crearLibroTest() {
		// arrange
		Editorial editorialNorma = new Editorial("NORMA");
		Autor autor = new Autor("Gabriel", "Garcia Marquez");

		// act
		Libro libro = new LibroTestDataBuilder().conTitutlo("Cien años de soledad").conIsbn("1234")
				.conEditorial(editorialNorma).conAutor(autor).conAnio(2010).build();

		// assert
		assertEquals("Cien años de soledad", libro.getTitulo());
		assertEquals("1234", libro.getIsbn());
		assertEquals(editorialNorma, libro.getEditorial());
		assertEquals(autor, libro.getAutor());
	}

}
