package ejercicioInterfaces1;

public class Circulo extends Figura implements IProceso {

	private int radio;


	public Circulo(String color, int radio) {
		super(color);
		this.radio = radio;
	}

	@Override
	public double CalcularArea() {
		return Math.PI*radio*radio;
	}

	@Override
	public void imprimir() {
		System.out.println("CIRCULO");
		System.out.println("el radio es " + radio);
	}

	@Override
	public void aumentar(int c) {
     this.radio = this.radio + c;
		
	}

}
