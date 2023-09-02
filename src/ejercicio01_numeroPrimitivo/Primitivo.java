package ejercicio01_numeroPrimitivo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Primitivo {

	public static void main(String[] args) {

		System.out.println("Hola Mundo!!");
		//System.out.println("El numero es::" + generarNumeroAleatorio());

		HashMap<Integer, Integer> map = new HashMap<>();
		ArrayList<Integer> nombreArrayList = new ArrayList<Integer>();

		while(map.size() < 6) {
			int n = generarNumeroAleatorio();
			System.out.println("El numero generado es::" + n);
			if (!map.containsKey(n)) {
				map.put(n, n);
				nombreArrayList.add(n);
			}

		}

		// System.out.println("Numero Gnerados no ordenados: "                 + map);
		Collections.sort(nombreArrayList);
		System.out.println("Numero Ordenados  : "                 + nombreArrayList);

	}

	public static int generarNumeroAleatorio() {

		return (int)(Math.random()*49 + 1);

	}

}
