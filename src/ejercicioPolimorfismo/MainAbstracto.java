package ejercicioPolimorfismo;

public class MainAbstracto {

	public static void main(String[] args) {
	
		mostrarFigura(new Triangulo("rojo", 6, 8));
		mostrarFigura(new Circulo("verde", 8));
	}

	public static void mostrarFigura(Figura figura) {
		System.out.println("Color: " + figura.getColor() + ", Area: "+figura.CalcularArea());

	}
	
}
