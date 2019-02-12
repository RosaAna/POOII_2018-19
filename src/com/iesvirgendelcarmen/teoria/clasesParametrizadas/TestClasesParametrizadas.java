package com.iesvirgendelcarmen.teoria.clasesParametrizadas;

public class TestClasesParametrizadas {

	public static void main(String[] args) {
		
		ClaseCadenas cCadenas = new ClaseCadenas();
		cCadenas.addCadena("hola");
		cCadenas.addCadena("pepe");
		cCadenas.addCadena("fin");
		System.out.println(cCadenas.obtenerCadenaPorPosicion(0));
		System.out.println(cCadenas.obtenerCadenaPorPosicion(10));
		System.out.println(cCadenas.getLista());
		
		ClaseDouble cDouble = new ClaseDouble();
		cDouble.addNumero(12.2);
		cDouble.addNumero((double) 10);
		cDouble.addNumero(11.25);
		System.out.println(cDouble.obtenerNumeroPorPosicion(0));
		System.out.println(cDouble.obtenerNumeroPorPosicion(10));
		System.out.println(cDouble.getLista());
		
		ClaseParametrizada<Integer> cParametrizada1 = new ClaseParametrizada<>();
		cParametrizada1.addItem(3);
		cParametrizada1.addItem(5);
		cParametrizada1.addItem(-96);
		System.out.println(cParametrizada1.obtenerItemPorPosicion(0));
		System.out.println(cParametrizada1.obtenerItemPorPosicion(10));
		System.out.println(cParametrizada1.getLista());
		
		ClaseParametrizada<Short> cParametrizada2 = new ClaseParametrizada<>();
		cParametrizada2.addItem((short) 3);
		cParametrizada2.addItem((short) 5);
		cParametrizada2.addItem((short) -96);
		System.out.println(cParametrizada2.obtenerItemPorPosicion(0));
		System.out.println(cParametrizada2.obtenerItemPorPosicion(10));
		System.out.println(cParametrizada2.getLista());

	}

}
