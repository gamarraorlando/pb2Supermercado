package ar.edu.unlam.pb2;

public class Comestible  extends Producto{

	private String fechaDeElavoracion;
	private String fechaDeVencimiento;

	public Comestible(Integer codigo, String nombre, String fechaProcduccion,String FechaVencimiento,
			String marca, Double Precio) {
		super(codigo, nombre, marca,Precio);
	
		
		this.fechaDeElavoracion=fechaProcduccion;
		this.fechaDeVencimiento=FechaVencimiento;
		
	}

	public String getFechaDeElavoracion() {
		return fechaDeElavoracion;
	}

	public void setFechaDeElavoracion(String fechaDeElavoracion) {
		this.fechaDeElavoracion = fechaDeElavoracion;
	}

	public String getFechaDeVencimiento() {
		return fechaDeVencimiento;
	}

	public void setFechaDeVencimiento(String fechaDeVencimiento) {
		this.fechaDeVencimiento = fechaDeVencimiento;
	}

	@Override
	public String getTipo() {
	
		return "Comestible";
	}



}
