package co.edu.unbosque.model.persistence;

public interface OperationDAO<E> {

	public void Crear(E nuevDato);

	public int eliminar(int index);

	public int actualizar(int index, E nuevoDato);

	public String mostrarTodo();

}