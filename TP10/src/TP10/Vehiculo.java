package clase10;

public abstract class Vehiculo {
	protected String patente;
	protected static double precioBasediario = 500;
	
	public Vehiculo(String patente) {
		this.patente=patente;
	}
	
	public abstract double calcularPrecio(int idas);
	
	public String getPatente() {
		return patente;
	}
}
