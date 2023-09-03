package ejercicioClaseAbstracta;

public class Triangulo extends Figura {

	private int base;
	private int altura;
	
	public Triangulo(String color,int base, int altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double CalcularArea() {
		return (base*altura)/2;
	}

}
