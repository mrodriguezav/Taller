package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Correa;

public class CorreaDAO implements OperationDAO<Correa> {
	private ArrayList<Correa> listaCorreas;

	public CorreaDAO() {
		listaCorreas = new ArrayList<>();
	}

	@Override
	public void Crear(Correa nuevDato) {
		listaCorreas.add(nuevDato);

	}

	@Override
	public int eliminar(int index) {
		if (index < 0 || index >= listaCorreas.size()) {
			return 1;

		} else {

			listaCorreas.remove(index);
			return 0;
		}
	}

	@Override
	public int actualizar(int index, Correa nuevoDato) {
		if (index < 0 || index >= listaCorreas.size()) {
			return 1;
		} else {

			listaCorreas.set(index, nuevoDato);
			return 0;
		}
	}

	@Override
	public String mostrarTodo() {
		if (listaCorreas.isEmpty()) {
			return "No hay productos registrados";
		} else {

			String contenido = "";
			int pos = 1;
			for (Correa correa : listaCorreas) {
				contenido += "\n Correa " + pos;
				contenido += correa + "\n";
				pos++;
			}

			return contenido;
		}
	}

	public boolean checkIndex(int index) {
		if (index < 0 || index >= listaCorreas.size()) {
			return false;
		} else {
			return true;
		}

	}

}
