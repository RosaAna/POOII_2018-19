package com.iesvirgendelcarmen.teoria.introduccion;

public class TestCirculo {
	private static int contador = 0;
	public static void main(String[] args) {
		final Circulo c1 = new Circulo(12.3);
		Circulo c2 = new Circulo(10);
		c2 = c1;
		c1.setRadio(20);
		System.out.println(c1);
		System.out.println(c2);
		System.out.printf("Longitud circunferencia %.2f del círculo uno%n",
				c1.longitudCircunferencia());
		System.out.printf("Radio %.2f del círculo dos%n",
c2.getRadio());
		System.out.printf("Área del círculo mayor %.2f%n",
				Circulo.calcularAreaCirculoMayor(c1, c2));
		System.out.printf("Nº círculos creados %d%n", Circulo.numeroCirculos); //la forma correcta
		System.out.printf("Nº círculos creados %d%n", c1.numeroCirculos); //otra forma pero no se debe usar
		System.out.printf("Nº círculos creados %d%n", c2.numeroCirculos); //otra forma pero no se debe usar
		contador++;
		incrementar();
	}
	
	public static void incrementar() {
		contador *= 2;
	}

}
