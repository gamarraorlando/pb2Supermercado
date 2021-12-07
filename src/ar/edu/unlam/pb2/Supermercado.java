package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.accessibility.AccessibleState;

public class Supermercado {

	String nombre; // Nombre del supermercado
	private Set<Producto> productosExistentes; // Listado de productos que se comercializan
	private List<Producto> productosDisponibles; // Detalle de cada producto ingresado
	private Map<Integer, Venta> ventasRealizadas; // Listado de ventas realizadas (identificadas por el número de venta)
	private Integer contadorDeVentas; // Identificador del número de venta

	public Supermercado(String nombre) {
		this.nombre = nombre;
		this.contadorDeVentas = 0;
		this.productosExistentes = new TreeSet<Producto>();
		this.productosDisponibles = new LinkedList<Producto>();
		this.ventasRealizadas = new TreeMap<Integer, Venta>();

	}

	public void ingresarProducto(Producto nuevo) {
		this.productosDisponibles.add(nuevo);
		this.productosExistentes.add(nuevo);
	}

	public Set<Producto> getOfertaDeProductos() {
		this.productosExistentes.addAll(productosDisponibles);
		return this.productosExistentes;
	}

	public Integer getStock(Integer codigo) {
		Integer cantidad = 0;
		for (Producto este : productosDisponibles) {
			if (este.getCodigo().equals(codigo)) {
				cantidad++;
			}
		}
		return cantidad;
		// Devuelve la cantidad de unidades de un producto determinado
	}

	private Boolean productoExiste(Integer codigoDeProducto) throws ProductoInexistente {

		for (Producto este : productosExistentes) {
			if (este.getCodigo().equals(codigoDeProducto)) {
				return true;
			}
		}
		throw new ProductoInexistente("Producto Inexistente");
		// Verifica si un producto existe
	}

	private Producto getProductoPorCodigo(Integer codigoDeProducto) throws ProductoSinStock, ProductoInexistente {
		Producto este = null;
		if (productoExiste(codigoDeProducto)) {
			for (Producto disponible : productosDisponibles) {
				if (disponible.getCodigo().equals(codigoDeProducto)) {
					return este = disponible;
				}
			}
			throw new ProductoSinStock("Proccto sin stock");

		}
		// Busca la disponibilidad de un producto
		return este;

	}

	public Integer registrarNuevaVenta(Integer dniDelComprador, String nombreDelComprador) {
		// Registra una nueva venta
		ventasRealizadas.put(++contadorDeVentas, new Venta(dniDelComprador, nombreDelComprador));
		return contadorDeVentas;
	}

	public Venta getVenta(Integer nueroDeVenta) {
		return this.ventasRealizadas.get(nueroDeVenta);

		// Devuelve una venta en función de su número identificatorio
	}

	public void agregarAlCarrito(Integer numeroDeVenta, Integer codigoDeProducto)
			throws ProductoSinStock, ProductoInexistente, VentaNoRegistrada {
		if (ventasRealizadas.containsKey(numeroDeVenta)) {
			if (productoExiste(codigoDeProducto)) {
				Venta estVenta= ventasRealizadas.get(numeroDeVenta);
				estVenta.agregarArticulo( getProductoPorCodigo(codigoDeProducto));
				

				
				this.productosDisponibles.remove(getProductoPorCodigo(codigoDeProducto));
			}

		}else {
			throw new VentaNoRegistrada("Registre Primero al Cliente");
		}
	

		// Incorpora al carrito de compras de la venta identificada por el
		// "numeroDeVenta", el producto identificado por el "codigoDeProducto"
	}

	public TreeSet<Comestible> optenerComestibles() {
		TreeSet<Comestible> este= new TreeSet<>();
		for(Producto comestible:productosExistentes) {
			if(comestible.getTipo().contains("Comestible")) {
				este.add((Comestible) comestible);
			}
		}
		return este;
		// Optener lista de comestibles
		
	}

}
