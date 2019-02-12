package com.iesvirgendelcarmen.teoria.clasesInternas.noEstaticas;

public class TestClasesAnidadas {

	public static void main(String[] args) {

		ClaseExterna cE = new ClaseExterna(5);
		System.out.println("Atributo externa: " + cE.getValorExterno());
		ClaseExterna.ClaseInterna cI = cE.new ClaseInterna("hola otra vez");
		System.out.println("Atributo interno " + cI.getValorInterno());
		System.out.println("Atributo externo doblado desde interno: " + 
				cI.doblarValorExterno());
		System.out.println("Atributo interno desde externo " + cE.devolverValorInterno());
		ClaseExterna.ClaseInterna cII = new ClaseExterna(10).new ClaseInterna("hola");
		System.out.println("Valor doblado desde interno " + cII.doblarValorExterno());
	}

}
