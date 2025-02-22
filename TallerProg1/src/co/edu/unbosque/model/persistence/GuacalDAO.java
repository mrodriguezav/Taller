package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Guacal;
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
		String contenido = "";
		int pos = 1;
		for (Guacal Guacal : listaGuacales) {
			contenido += "\n Guacal " + pos;
			contenido += Guacal + "\n";
		}

		return contenido;
	}

}
