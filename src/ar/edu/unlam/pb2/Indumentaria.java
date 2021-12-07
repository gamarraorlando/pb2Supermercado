package ar.edu.unlam.pb2;

public abstract class Indumentaria   extends Producto{

	

	private String color;

	
	public Indumentaria(Integer codigo, String descripcion, String marca, String color, Double precio) {
		super(codigo, descripcion, marca,precio);
		this.color=color;
	}
	



	public abstract Object getTalle() ;




	public Object getColor() {
		return this.color;
		
	}



	
}
