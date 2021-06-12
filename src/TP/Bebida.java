package TP;

public class Bebida extends Producto {

	private double litros;

	public Bebida(String nombre, String tipo, int precio,double litros) {
		super(nombre, tipo, precio);
		this.litros = litros;
	}

	public double getLitros() {
		return litros;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}
	
	@Override
	public String toString() {
		return "Litros: "+ litros+" // "+ "Nombre: "+this.getNombre() +" // Precio: $"+ this.getPrecio();
	}

	

	
}
