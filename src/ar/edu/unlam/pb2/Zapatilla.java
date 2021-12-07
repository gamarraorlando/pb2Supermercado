package ar.edu.unlam.pb2;

public class Zapatilla extends Indumentaria {

	

	private Integer talle;

	public Zapatilla(Integer codigo, String descripcion,Integer talle, String marca, String color, Double precio) {
		super(codigo, descripcion, marca, color, precio);
		this.talle=talle;
	}

	public Integer getTalle() {
		return this.talle;
	}

	@Override
	public String getTipo() {
		
		return "Indumentaria";
	}








	
}
