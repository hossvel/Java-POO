package ejercicioPolimorfismo;

public class Circulo extends Figura {

	private int radio;


	public Circulo(String color, int radio) {
		super(color);
		this.radio = radio;
	}

	@Override
	public double CalcularArea() {
		return Math.PI*radio*radio;
	}

}
