package co.edu.unbosque.model;

public class Guacal extends Producto {
	private boolean esGrande;
	private String material;
	private boolean esParaPerro;
	private String color;

	public Guacal() {
		// TODO Auto-generated constructor stub
	}

	public Guacal(boolean esGrande, String material, boolean esParaPerro, String color) {
		super();
		this.esGrande = esGrande;
		this.material = material;
		this.esParaPerro = esParaPerro;
		this.color = color;
	}

	public Guacal(float precioCompra, float precioVenta, int cantidad, String nombre, String tamanio, String marca,
			boolean esGrande, String material, boolean esParaPerro, String color) {
		super(precioCompra, precioVenta, cantidad, nombre, tamanio, marca);
		this.esGrande = esGrande;
		this.material = material;
		this.esParaPerro = esParaPerro;
		this.color = color;
	}

	public Guacal(float precioCompra, float precioVenta, int cantidad, String nombre, String tamanio, String marca) {
		super(precioCompra, precioVenta, cantidad, nombre, tamanio, marca);
		// TODO Auto-generated constructor stub
	}

	public boolean isEsGrande() {
		return esGrande;
	}

	public void setEsGrande(boolean esGrande) {
		this.esGrande = esGrande;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public boolean isEsParaPerro() {
		return esParaPerro;
	}

	public void setEsParaPerro(boolean esParaPerro) {
		this.esParaPerro = esParaPerro;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "\n EsGrande= " + esGrande + "\n Material= " + material + "\n EsParaPerro= " + esParaPerro + "\n Color= "
				+ color;
	}

}
