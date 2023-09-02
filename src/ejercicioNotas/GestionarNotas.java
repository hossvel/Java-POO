package ejercicioNotas;

import java.util.ArrayList;

public class GestionarNotas {

	ArrayList<Double> listaNotas = new ArrayList<>();

	public void addNotas(double nota) {
		listaNotas.add(nota);
	}
	public double promedioNotas() {
		double sum = 0.0;

		for (Double nota : listaNotas) {
			sum= sum + nota;
		}
		return sum/listaNotas.size();
	}
	
	public int notasAprobadas() {
		
		int aprobados = 0;

		for (Double nota : listaNotas) {
			if (nota > 10) aprobados++;
		}
		return aprobados;
	}

}
