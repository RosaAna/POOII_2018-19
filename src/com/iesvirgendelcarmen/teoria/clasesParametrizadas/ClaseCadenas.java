package com.iesvirgendelcarmen.teoria.clasesParametrizadas;

import java.util.ArrayList;
import java.util.List;

public class ClaseCadenas {
	private List<String> lista = new ArrayList<>();

	//añadimos cadenas a la lista
	public void addCadena(String cadena) {
		lista.add(cadena);
	}
	//localizamos un objeto de la lista según posición

	public String obtenerCadenaPorPosicion(int posicion) {
		if (posicion < lista.size())
			return lista.get(posicion);
		else
			return null;
	}

	public List<String> getLista() {
		return lista;
	}
	
	
}
