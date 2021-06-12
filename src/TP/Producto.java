package TP;

public class Producto {
	
	private String nombre, tipo;
	private int precio;
	
	public Producto(String nombre, String tipo, int precio) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.precio = precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	

}
