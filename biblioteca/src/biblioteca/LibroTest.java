package biblioteca;

import static org.junit.Assert.*;

import org.junit.Test;

public class LibroTest {

	@Test
	public void crearLibroTest() {
		//arrange
		Editorial editorialNorma = new Editorial("NORMA");
		Autor autor = new Autor("Gabriel", "Garcia Marquez");
		
		//act
		Libro libro = new Libro("Cien a�os de soledad", editorialNorma, autor, 2010);
		
		//assert
		assertEquals("Cien a�os de soledad", libro.getTitulo())	;
		assertEquals(editorialNorma, libro.getEditorial());
		assertEquals(autor, libro.getAutor());
	}

}
