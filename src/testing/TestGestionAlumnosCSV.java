package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import ejercicioficheroCSV.GestionAlumnosCSV;

class TestGestionAlumnosCSV {

	public 	static GestionAlumnosCSV gestionAlumnosCSV = new GestionAlumnosCSV();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void testNotaMedia() {
		assertEquals(gestionAlumnosCSV.notaMedia("Java"),7.0);
	}

	@Test
	void testAlumnoNotaMasAlta() {
		assertEquals(gestionAlumnosCSV.alumnoNotaMasAlta().getNota(),9.0);
	}
}
