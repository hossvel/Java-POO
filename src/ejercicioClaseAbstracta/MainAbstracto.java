package ejercicioClaseAbstracta;

public class MainAbstracto {

	public static void main(String[] args) {
	
		Figura f1 = new Triangulo("rojo", 6, 8);
		System.out.println(f1.CalcularArea());
		
		Figura f2 = new Circulo("verde", 8);
		System.out.println(f2.CalcularArea());
	}

}
