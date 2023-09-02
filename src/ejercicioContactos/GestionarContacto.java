package ejercicioContactos;

import java.util.HashMap;

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

}
