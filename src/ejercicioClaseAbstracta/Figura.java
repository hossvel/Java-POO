package ejercicioClaseAbstracta;

public abstract class Figura {

	private String color;
	
	public Figura(String color) {
		super();
		this.color = color;
	}

	public abstract double CalcularArea();
}
