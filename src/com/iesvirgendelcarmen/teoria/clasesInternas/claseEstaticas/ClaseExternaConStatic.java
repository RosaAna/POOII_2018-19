package com.iesvirgendelcarmen.teoria.clasesInternas.claseEstaticas;

public class ClaseExternaConStatic {

	private int valorExterno;
	private static String atributoExterna = "hola desde externa ";

	public ClaseExternaConStatic(int valor) {
		this.valorExterno = valor;
	}

	public int getValorExterno() {
		return valorExterno;
	}

	public static int devolverEnteroAleatorio() {
		return (int) (Math.random() * 100);
	}
	
	public static class ClaseInternaEstatica {
		private static String atributoInterna = "hola desde interna ";
		public static String devolverAtributoInterna() {
			return atributoInterna + atributoExterna;
		}
		public static int devolverAtributoExterno() {
			ClaseExternaConStatic c = new ClaseExternaConStatic(5);
			return c.getValorExterno();
		}
	}
	
	public static String devolverValorEstaticoInterno() {
		return ClaseInternaEstatica.devolverAtributoInterna();
	}
}
