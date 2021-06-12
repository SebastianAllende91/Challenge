package TP;

public class ArtDeLimpieza extends Producto{
	private double contenido;


	public ArtDeLimpieza(String nombre, String tipo, int precio, double contenido) {
		super(nombre, tipo, precio);
		this.contenido = contenido;
	}

	public double getContenido() {
		return contenido;
	}

	public void setContenido(double contenido) {
		this.contenido = contenido;
	}

	@Override
	public String toString() {
		return "Contenido: "+ contenido+" // "+ "Nombre: "+this.getNombre() +" // Precio: $"+ this.getPrecio();
	}
	
	
}
