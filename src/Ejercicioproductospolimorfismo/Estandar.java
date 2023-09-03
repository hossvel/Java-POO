package Ejercicioproductospolimorfismo;

public class Estandar extends Producto {
	private String seccion;	
	public Estandar(String nombre, double precio, String seccion) {
		super(nombre, precio);
		this.seccion = seccion;
	}
	public String getSeccion() {
		return seccion;
	}
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	@Override
	public double obtenerPrecioPedido(int unidades) {
		if(unidades>=5) {
			return unidades*this.getPrecio()*0.9;
		}else {
			return unidades*this.getPrecio();
		}
	}
}
