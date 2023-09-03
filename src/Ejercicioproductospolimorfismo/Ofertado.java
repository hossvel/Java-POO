package Ejercicioproductospolimorfismo;

public class Ofertado extends Producto {
	private int dias;
	
	public Ofertado(String nombre, double precio, int dias) {
		super(nombre, precio);
		this.dias = dias;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	@Override
	public double obtenerPrecioPedido(int unidades) {
		if(dias==1) {
			return unidades*this.getPrecio()*0.8;
		}
		else if(dias==2 || dias==3) {
			return unidades*this.getPrecio()*0.85;
		}
		else {
			return unidades*this.getPrecio()*0.9;
		}
	}

}
