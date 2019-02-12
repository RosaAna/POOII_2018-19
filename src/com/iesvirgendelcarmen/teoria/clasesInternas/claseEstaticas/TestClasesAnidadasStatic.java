package com.iesvirgendelcarmen.teoria.clasesInternas.claseEstaticas;

public class TestClasesAnidadasStatic {

	public static void main(String[] args) {

		System.out.println("Valor aleatorio: " + ClaseExternaConStatic.devolverEnteroAleatorio());

		ClaseExternaConStatic cE = new ClaseExternaConStatic(5);
		System.out.println("Valor del atributo externo " + cE.getValorExterno());
		System.out.println("Valor del atributo interno " + 
				cE.devolverValorEstaticoInterno()); //mala praxi, porque el método es estático


		ClaseExternaConStatic.ClaseInternaEstatica cI = 
				new ClaseExternaConStatic.ClaseInternaEstatica();
		System.out.println("Atributo interno " +  cI.devolverAtributoInterna());  //mala praxi, porque el método es estático
		System.out.println("Atributo externo " +  cI.devolverAtributoExterno());  //mala praxi, porque el método es estático

		System.out.println("Atributo interno " + 
				ClaseExternaConStatic.ClaseInternaEstatica.devolverAtributoInterna());
		System.out.println("Atributo externo " + 
				ClaseExternaConStatic.ClaseInternaEstatica.devolverAtributoExterno());


	}

}
