package ar.edu.unlam.pb2;

public class Heladera extends Electrodomestico {

	


	private Boolean noFrost;

	public Heladera(Integer codigo, String modelo,Boolean noFrost, Integer cantidad, String marca, Double precio) {
		super(codigo, modelo, cantidad, marca, precio);
		this.noFrost=noFrost;
	}

	public Boolean isNoFrost() {
		
		return this.noFrost;
	}

	@Override
	public String getTipo() {
		
		return "Electrodomestico";
	}



}
