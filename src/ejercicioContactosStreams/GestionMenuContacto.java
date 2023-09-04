package ejercicioContactosStreams;

import java.util.Scanner;



public class GestionMenuContacto {

	public void mostrar () {
		System.out.println("Mostrar Menu");
		int opc = 0;
		Scanner sc = new Scanner(System.in);
		GestionarContacto gestionarContacto = new GestionarContacto();

		do {
			mostrarOpciones();
			opc = Integer.parseInt(sc.nextLine());
			switch (opc) {
			case 1: 
				Contacto contacto =	SolicitarDatos();
				gestionarContacto.addContacto(contacto);

				break;
			case 2:
				gestionarContacto.VerContacto();
				break;
			case 3: 
				System.out.println("Ingrese email:");
				String email = sc.nextLine();
				gestionarContacto.EliminarContacto(email);
				break;
			case 4: 
				System.out.println("Salir ");
				break;
			default:
				System.out.println("Ingrese una opcion Valida ");
			}
		}while (opc != 4);



	}


	private void mostrarOpciones() {
		System.out.println("Ingrese 1: Add Contacto");
		System.out.println("Ingrese 2: Mostrar Contactos");
		System.out.println("Ingrese 3: Eliminar Contacto");
		System.out.println("Ingrese 4: Salir");
	}

	private Contacto SolicitarDatos() {
		Scanner sc = new Scanner(System.in);
		String nombre;
		String email;
		int edad;

		System.out.println("Ingrese nombre:");
		nombre = sc.nextLine();

		System.out.println("Ingrese email:");
		email = sc.nextLine();

		System.out.println("Ingrese edad:");
		edad = Integer.parseInt(sc.nextLine());

		Contacto contacto = new Contacto(nombre, email, edad);
		return contacto;
	}

}
