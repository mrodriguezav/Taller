package co.edu.unbosque.model;

public class Comida extends Producto {
	private String ingredientePrincipal;
	private boolean esBolsaPlastica;
	private float cantComida;
	private boolean esParaCachorro;

	public Comida() {

	}

	public Comida(String ingredientePrincipal, boolean esBolsaPlastica, float cantComida, boolean esParaCachorro) {
		super();
		this.ingredientePrincipal = ingredientePrincipal;
		this.esBolsaPlastica = esBolsaPlastica;
		this.cantComida = cantComida;
		this.esParaCachorro = esParaCachorro;
	}

	public Comida(float precioCompra, float precioVenta, int cantidad, String nombre, String tamanio, String marca,
			String ingredientePrincipal, boolean esBolsaPlastica, float cantComida, boolean esParaCachorro) {
		super(precioCompra, precioVenta, cantidad, nombre, tamanio, marca);
		this.ingredientePrincipal = ingredientePrincipal;
		this.esBolsaPlastica = esBolsaPlastica;
		this.cantComida = cantComida;
		this.esParaCachorro = esParaCachorro;
	}

	public Comida(float precioCompra, float precioVenta, int cantidad, String nombre, String tamanio, String marca) {
		super(precioCompra, precioVenta, cantidad, nombre, tamanio, marca);
		// TODO Auto-generated constructor stub
	}

	public String getIngredientePrincipal() {
		return ingredientePrincipal;
	}

	public void setIngredientePrincipal(String ingredientePrincipal) {
		this.ingredientePrincipal = ingredientePrincipal;
	}

	public boolean isEsBolsaPlastica() {
		return esBolsaPlastica;
	}

	public void setEsBolsaPlastica(boolean esBolsaPlastica) {
		this.esBolsaPlastica = esBolsaPlastica;
	}

	public float getCantComida() {
		return cantComida;
	}

	public void setCantComida(float cantComida) {
		this.cantComida = cantComida;
	}

	public boolean isEsParaCachorro() {
		return esParaCachorro;
	}

	public void setEsParaCachorro(boolean esParaCachorro) {
		this.esParaCachorro = esParaCachorro;
	}

	@Override
	public String toString() {
		return "\n IngredientePrincipal= " + ingredientePrincipal + "\n EsBolsaPlastica= " + esBolsaPlastica
				+ "\n CantComida= " + cantComida + "\n esParaCachorro= " + esParaCachorro;
	}

}
