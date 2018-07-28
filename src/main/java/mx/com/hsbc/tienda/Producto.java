package mx.com.hsbc.tienda;

public class Producto {
	private String nombre;
	private int SKU;
	private double precio;
	private int cantidad;
	
	public Producto () {
		
	}
	
    public Producto(String nombre, int SKU, double precio, int cantidad ) {
    	this.nombre=nombre;
    	this.SKU=SKU;
    	this.precio=precio;
    	this.cantidad=cantidad;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSKU() {
		return SKU;
	}

	public void setSKU(int sKU) {
		SKU = sKU;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
    
}
