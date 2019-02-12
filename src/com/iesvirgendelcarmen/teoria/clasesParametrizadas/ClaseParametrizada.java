package com.iesvirgendelcarmen.teoria.clasesParametrizadas;

import java.util.ArrayList;
import java.util.List;

public class ClaseParametrizada <T> {
	private List<T> lista = new ArrayList<>();

	//añadimos cadenas a la lista
	public void addItem(T item) {
		lista.add(item);
	}
	//localizamos un objeto de la lista según posición

	public T obtenerItemPorPosicion(int posicion) {
		if (posicion < lista.size())
			return lista.get(posicion);
		else
			return null;
	}

	public List<T> getLista() {
		return lista;
	}
}
