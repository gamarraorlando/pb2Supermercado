package ar.edu.unlam.pb2;

public abstract class Electrodomestico extends Producto{
	;
	private Integer mesesDeGArantia;

	
	
	public Electrodomestico(Integer codigo, String modelo, Integer cantidad,
			String marca, Double precio) {
		super(codigo, modelo, marca,precio);
		
		this.mesesDeGArantia=cantidad;
		
		
	}



	public Integer getMesesDeGArantia() {
		return mesesDeGArantia;
	}



	public void setMesesDeGArantia(Integer mesesDeGArantia) {
		this.mesesDeGArantia = mesesDeGArantia;
	}


	


	
	


}

