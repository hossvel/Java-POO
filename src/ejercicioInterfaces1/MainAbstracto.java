package ejercicioInterfaces1;

public class MainAbstracto {

	public static void main(String[] args) {
	
		mostrarFigura(new Triangulo("rojo", 6, 8));
		mostrarFigura(new Circulo("verde", 8));
		
		System.out.println("***POLIMORFISMO***" );
		mostrarOperacion(new Mesa( 6, 8));
		mostrarOperacion(new Circulo("verde", 20));
		
	}

	public static void mostrarFigura(Figura figura) {
		System.out.println("Color: " + figura.getColor() + ", Area: "+figura.CalcularArea());

	}
	
	public static void mostrarOperacion(IProceso p1) {
		p1.aumentar(4);
	    p1.imprimir();
	}
}
