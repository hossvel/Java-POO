package ejercicioficheroCSV;

public class GestionAlumnosCSV {

	public double notaMedia(String curso) {
		return AlumnoLocator.alumnos().filter(a -> a.getCurso().equals(curso))
				.mapToDouble(a -> a.getNota())
				.average()
				.orElse(0.0);
	}
	
	public Alumno alumnoNotaMasAlta() {
		return AlumnoLocator.alumnos().max((a1,a2)-> Double.compare(a1.getNota() , a2.getNota())).orElse(null);
		
	
	}
}
