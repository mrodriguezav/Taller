package co.edu.unbosque.model;

public class Correa extends Producto {
	private String color;
	private float longitud;
	private String material;
	private boolean esDeAhogo;

	public Correa() {

	}

	public Correa(String color, float longitud, String material, boolean esDeAhogo) {
		super();
		this.color = color;
		this.longitud = longitud;
		this.material = material;
		this.esDeAhogo = esDeAhogo;
	}

	public Correa(float precioCompra, float precioVenta, int cantidad, String nombre, String tamanio, String marca,
			String color, float longitud, String material, boolean esDeAhogo) {
		super(precioCompra, precioVenta, cantidad, nombre, tamanio, marca);
		this.color = color;
		this.longitud = longitud;
		this.material = material;
		this.esDeAhogo = esDeAhogo;
	}

	public Correa(float precioCompra, float precioVenta, int cantidad, String nombre, String tamanio, String marca) {
		super(precioCompra, precioVenta, cantidad, nombre, tamanio, marca);
		// TODO Auto-generated constructor stub
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getLongitud() {
		return longitud;
	}

	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public boolean isEsDeAhogo() {
		return esDeAhogo;
	}

	public void setEsDeAhogo(boolean esDeAhogo) {
		this.esDeAhogo = esDeAhogo;
	}

	@Override
	public String toString() {
		return "\n Color= " + color + "\n Longitud= " + longitud + "\n material = " + material + "\n esDeAhogo= "
				+ esDeAhogo;
	}
///a
}