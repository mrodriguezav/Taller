package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Correa;
import co.edu.unbosque.model.Guacal;

public class GuacalDAO implements OperationDAO<Guacal> {
	private ArrayList<Guacal> listaGuacales;

	public GuacalDAO() {
		listaGuacales = new ArrayList<>();
	}

	@Override
	public void Crear(Guacal nuevDato) {
		listaGuacales.add(nuevDato);

	}

	@Override
	public int eliminar(int index) {
		if (index < 0 || index >= listaGuacales.size()) {
			return 1;

		} else {

			listaGuacales.remove(index);
			return 0;
		}
	}

	@Override
	public int actualizar(int index, Guacal nuevoDato) {
		if (index < 0 || index >= listaGuacales.size()) {
			return 1;
		} else {

			listaGuacales.set(index, nuevoDato);
			return 0;
		}
	}

	@Override
	public String mostrarTodo() {
		if (listaGuacales.isEmpty()) {
			return "No hay productos registrados";
		} else {

			String contenido = "";
			int pos = 1;
			for (Guacal Guacal : listaGuacales) {
				contenido += "\n Guacal " + pos;
				contenido += Guacal + "\n";
				pos++;
			}

			return contenido;
		}
	}

	public boolean checkIndex(int index) {
		if (index < 0 || index >= listaGuacales.size()) {
			return false;
		} else {
			return true;
		}

	}

	public double calcularInversion() {
		double inversion = 0.0;
		for (Guacal guacal : listaGuacales) {
			inversion += guacal.getPrecioCompra();
		}
		return inversion;
	}

	public double calcularRetorno() {
		double retorno = 0.0;
		for (Guacal guacal : listaGuacales) {
			retorno += guacal.getPrecioVenta();
		}
		return retorno;
	}

}
