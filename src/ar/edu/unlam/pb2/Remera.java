package ar.edu.unlam.pb2;

public class Remera extends Indumentaria {

	private String talle;

	public Remera(Integer codigo, String descripcion,String talle, String marca, String color, Double precio) {
		super(codigo, descripcion, marca, color, precio);
		this.talle=talle;
		
	}


	public String getTalle() {
		
		return this.talle;
	}


	@Override
	public String getTipo() {
		
		return "Indumentaria";
	}

	



	
}
