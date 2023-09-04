package ejercicioContactosStreams;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class GestionarContacto {

	HashMap<String, Contacto> map = new HashMap<>();

	public void addContacto(Contacto contacto) {

		if (!map.containsKey(contacto.getEmail())) {
			map.put(contacto.getEmail(),contacto);
		}

	}

	public void VerContacto() {

		map.forEach((k,v) -> System.out.println(v.getNombre() + " " + v.getEmail() + " " +  v.getEdad()));

	}
	public void EliminarContacto(String email) {

		map.remove(email);

	}
	public boolean existeContacto(String nombre) {
		Stream<Contacto> listContactos = map.values().stream();
		return listContactos.anyMatch(c -> c.getNombre().equals(nombre));
	}

	public Contacto ContactoMayor() {
		Stream<Contacto> listContactos = map.values().stream();
		return listContactos.max((c1,c2) -> c1.getEdad() - c2.getEdad()).get();
	}

	public Contacto buscarPorNombre(String nombre) {
		Stream<Contacto> listContactos = map.values().stream();
		return listContactos.filter(c1 -> c1.getNombre().equals(nombre)).findFirst().get();

	}

	public List<String> recuperarNombres(String nombre) {
		Stream<Contacto> listContactos = map.values().stream();
		return listContactos.map(c-> c.getNombre()).toList();

	}

	public double EdadMedia() {
		Stream<Contacto> listContactos = map.values().stream();
		return listContactos.mapToInt(c->c.getEdad()).average().getAsDouble();
	}

}
