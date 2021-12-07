package ar.edu.unlam.pb2;

import java.util.LinkedList;
import java.util.List;

public class Venta {
	private Integer dniComprador;
	private String nombreDelComprador;
	private List<Producto> carrito;
	public Venta(Integer dniDelComprador, String nombreDelComprador) {
	this.dniComprador=dniDelComprador;
	this.nombreDelComprador=nombreDelComprador;
	this.carrito= new LinkedList<Producto>();
	}
	
	public void agregarArticulo(Producto producto) {
		this.carrito.add(producto);
	}

	public double getImporte() {
	Double importe=0.0;
	for(Producto este:carrito) {
		importe+=este.getPrecio();
		
	}
		return importe;
	}

}
