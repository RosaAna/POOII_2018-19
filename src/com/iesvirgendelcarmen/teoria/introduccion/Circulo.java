package com.iesvirgendelcarmen.teoria.introduccion;

public class Circulo {

	public static final double PI = 3.1416;
	public static int numeroCirculos = 0;

	private double radio;

	public double getRadio() {
		return radio;
	}

	
	
	public void setRadio(double radio) {
		this.radio = radio;
	}

	public Circulo(double radio) {
		this.radio = radio;
		numeroCirculos++;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}

	public double longitudCircunferencia() {
		return 2 * PI * radio;
	}

	//devuelve el área de los dos círculos que se pasan com argumentos
	public static double  calcularAreaCirculoMayor(Circulo c1, Circulo c2) {
		if (c1.getRadio() > c2.getRadio())
			return PI * Math.pow(c1.getRadio(),2); 
		else
			return PI * Math.pow(c2.getRadio(), 2);
	}
	
	

}
