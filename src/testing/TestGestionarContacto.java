package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import ejercicioContactosStreams.Contacto;
import ejercicioContactosStreams.GestionarContacto;

class TestGestionarContacto {

	public 	static GestionarContacto gestionarContacto = new GestionarContacto();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {

		gestionarContacto.addContacto(new Contacto("c1", "Hoss", 35));
		gestionarContacto.addContacto(new Contacto("c2", "HH", 40));
		gestionarContacto.addContacto(new Contacto("c3", "RR", 25));
		gestionarContacto.addContacto(new Contacto("c4", "BB", 20));
		gestionarContacto.addContacto(new Contacto("c5", "JJ", 15));

	}

	@Test
	void testExisteContacto() {
		assertTrue(gestionarContacto.existeContacto("c3"));
	}

	@Test
	void testContactoMayor() {
		assertEquals(gestionarContacto.ContactoMayor().getNombre(),"c2");
	}

	@Test
	void testBuscarPorNombre() {
		assertEquals(gestionarContacto.buscarPorNombre("c5").getNombre(),"c5");
	}

	@Test
	void testRecuperarNombres() {
		assertEquals(gestionarContacto.recuperarNombres().size(),5);
	}

	@Test
	void testEdadMedia() {
		assertEquals(gestionarContacto.EdadMedia(),27);
	}

}
