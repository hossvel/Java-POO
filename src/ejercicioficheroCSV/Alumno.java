package ejercicioficheroCSV;

public class Alumno {

	private String nombre;
	private String curso;
	private double nota;
	
	public Alumno() {
		super();
	}
	
	
	public Alumno(String nombre, String curso, double nota) {
		super();
		this.nombre = nombre;
		this.curso = curso;
		this.nota = nota;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	
}
