package Ejercicioproductospolimorfismo;

import java.util.ArrayList;
import java.util.List;


public class MainProductos {

	public static void main(String[] args) {
		List<Producto> pedidos=new ArrayList<>();
		pedidos.add(new Estandar("estandar 1",10,"alimentacion"));
		pedidos.add(new Estandar("estandar 2",20,"deportes"));
		pedidos.add(new Ofertado("ofertado 1",10,2));
		pedidos.add(new Ofertado("ofertado 2",20,2));
		pedidos.add(new Ofertado("ofertado 3",30,2));
		
		double precioTotal=0;
		for(Producto prod:pedidos) {
			precioTotal+=prod.obtenerPrecioPedido(5);
		}
		System.out.println("Precio total de los pedidos: "+precioTotal);
	}
}
