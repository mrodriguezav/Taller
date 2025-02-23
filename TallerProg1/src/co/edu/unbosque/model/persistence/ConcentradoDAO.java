package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Concentrado;

public class ConcentradoDAO implements OperationDAO<Concentrado> {
	private ArrayList<Concentrado> listaConcentrados;

	public ConcentradoDAO() {
		listaConcentrados = new ArrayList<>();
	}

	@Override
	public void Crear(Concentrado nuevDato) {
		listaConcentrados.add(nuevDato);

	}

	@Override
	public int eliminar(int index) {
		if (index < 0 || index >= listaConcentrados.size()) {
			return 1;

		} else {

			listaConcentrados.remove(index);
			return 0;
		}
	}

	@Override
	public int actualizar(int index, Concentrado nuevoDato) {
		if (index < 0 || index >= listaConcentrados.size()) {
			return 1;
		} else {

			listaConcentrados.set(index, nuevoDato);
			return 0;
		}
	}

	@Override
	public String mostrarTodo() {
		if (listaConcentrados.isEmpty()) {
			return "No hay productos registrados";
		} else {

			String contenido = "";
			int pos = 1;
			for (Concentrado concentrado : listaConcentrados) {
				contenido += "\n concentrado " + pos;
				contenido += concentrado + "\n";
				pos++;
			}

			return contenido;
		}
	}

	public boolean checkIndex(int index) {
		if (index < 0 || index >= listaConcentrados.size()) {
			return false;
		} else {
			return true;
		}

	}

	public double calcularInversion() {
		double inversion = 0.0;
		for (Concentrado concentrado : listaConcentrados) {
			inversion += concentrado.getPrecioCompra();
		}
		return inversion;
	}

	public double calcularRetorno() {
		double retorno = 0.0;
		for (Concentrado concentrado : listaConcentrados) {
			retorno += concentrado.getPrecioVenta();
		}
		return retorno;
	}

}
