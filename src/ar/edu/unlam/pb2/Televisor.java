package ar.edu.unlam.pb2;

public class Televisor extends Electrodomestico {

	

	private Integer pulgadas;

	public Televisor(Integer codigo, String modelo,Integer pulgadas,  Integer cantidad, String marca, Double precio
			) {
		super(codigo, modelo, cantidad, marca, precio);
		this.pulgadas=pulgadas;
		
	}



	public Integer getPulgadas() {
		
		return this.pulgadas;
	}



	@Override
	public String getTipo() {
		
		return "Electrodomestico";
	}

	

}
