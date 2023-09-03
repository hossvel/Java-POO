package ejercicioInterfaces1;

public class Mesa implements IProceso {

	private int largo;
	private int ancho;

	public Mesa(int largo, int ancho) {
		super();
		this.largo = largo;
		this.ancho = ancho;
	}


	@Override
	public void imprimir() {
		System.out.println("MESA");
		System.out.println("el largo es " + largo);
		System.out.println("el ancho es " + ancho);
	}

	@Override
	public void aumentar(int c) {
		 this.largo = this.largo + c;
		 this.ancho = this.ancho + c;
	}

}
