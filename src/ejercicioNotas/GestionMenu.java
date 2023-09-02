package ejercicioNotas;

import java.util.Scanner;

public class GestionMenu {


	public void mostrar () {
		System.out.println("Mostrar Menu");
		int opc = 0;
		double nota = 0.0;
		Scanner sc = new Scanner(System.in);
		GestionarNotas gestionarNotas = new GestionarNotas();

		do {
			mostrarOpciones();
			opc = Integer.parseInt(sc.nextLine());
			switch (opc) {
			case 1: 
				System.out.println("Ingrese Nota:");
				nota = Double.parseDouble(sc.nextLine());
				gestionarNotas.addNotas(nota);
				break;
			case 2:
				System.out.println("Promedio es: " + gestionarNotas.promedioNotas());
				break;
			case 3: 
				System.out.println("El numero de aprobados es: " + gestionarNotas.notasAprobadas());
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
		System.out.println("Ingrese 1: Add Nota");
		System.out.println("Ingrese 2: Ver Promedio");
		System.out.println("Ingrese 3: Ver cantidad de aprobados");
		System.out.println("Ingrese 4: Salir");
	}
}
