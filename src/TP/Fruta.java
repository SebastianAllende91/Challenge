package TP;

public class Fruta extends Producto{
	 private String unidadPorVenta;

	public Fruta(String nombre, String tipo, int precio, String unidadPorVenta) {
		super(nombre, tipo, precio);
		this.unidadPorVenta = unidadPorVenta;
	}

	public String getUnidadPorVenta() {
		return unidadPorVenta;
	}

	public void setUnidadPorVenta(String unidadPorVenta) {
		this.unidadPorVenta = unidadPorVenta;
	}
	
	@Override
	public String toString() {
		return "Unidad venta : " + unidadPorVenta +" // "+ "Nombre: "+this.getNombre() +" // Precio: $"+ this.getPrecio();
	}
	 
}
