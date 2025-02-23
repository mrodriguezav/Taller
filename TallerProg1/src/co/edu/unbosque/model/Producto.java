package co.edu.unbosque.model;

public abstract class Producto {

	private double precioCompra;
	private double precioVenta;
	private int cantidad;
	private String nombre;
	private String tamanio;
	private String marca;

	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public Producto(double precioCompra, double precioVenta, int cantidad, String nombre, String tamanio,
			String marca) {
		super();
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.cantidad = cantidad;
		this.nombre = nombre;
		this.tamanio = tamanio;
		this.marca = marca;
	}

	public double getPrecioCompra() {
		return precioCompra;

	}

	public void setPrecioCompra(float precioCompra) {
		this.precioCompra = precioCompra;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "\n PrecioCompra= " + precioCompra + "\n PrecioVenta= " + precioVenta + "\n Cantidad= " + cantidad
				+ "\n nombre= " + nombre + "\n Tamanio= " + tamanio + "\n Marca = " + marca;
	}

}
