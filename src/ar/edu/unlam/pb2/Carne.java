package ar.edu.unlam.pb2;

public class Carne extends Comestible {

	private Double kilos;
	public Carne(Integer codigo, String nombre, String fechaProcduccion, String FechaVencimiento, Double kilos, String marca,
			Double Precio ) {
		super(codigo, nombre, fechaProcduccion, FechaVencimiento,
				marca, Precio);
		this.kilos=kilos;
		
		
	}



	public double getKilos() {
		
		return this.kilos;
	}

}
