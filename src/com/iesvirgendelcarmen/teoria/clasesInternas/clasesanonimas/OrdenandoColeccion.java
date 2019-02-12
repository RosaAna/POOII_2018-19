package com.iesvirgendelcarmen.teoria.clasesInternas.clasesanonimas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class OrdenandoColeccion {
	public static void main(String[] args) {
		List<Float> listaFloat = new ArrayList<>();
		listaFloat.add(2.5f);
		Random random;
		for (int i = 0; i < 10; i++) {
			random = new Random();
			listaFloat.add(random.nextFloat() * 100);
		}
		System.out.println("Lista original");
		System.out.println(listaFloat);
		Collections.sort(listaFloat);
		System.out.println("Lista ordenada de menor a mayor");
		System.out.println(listaFloat);
		Comparador comparador = new Comparador();
		Collections.sort(listaFloat, comparador);
		System.out.println("Lista ordenada de mayor a menor");
		System.out.println(listaFloat);
	}
	
}
