package com.iesvirgendelcarmen.teoria.clasesInternas.noEstaticas;

public class ClaseExterna {

	private int valorExterno;

	public ClaseExterna(int valor) {
		this.valorExterno = valor;
	}

	public int getValorExterno() {
		return valorExterno;
	}

	public class ClaseInterna{
		private String valorInterno;

		public ClaseInterna(String valorInterno) {
			this.valorInterno = valorInterno;
		}

		public String getValorInterno() {
			return valorInterno;
		}

		public int doblarValorExterno() {
			return valorExterno * 2;
		}

	}
	public String devolverValorInterno() {
		ClaseInterna cI = new ClaseInterna("hola desde interna");
		return cI.getValorInterno();
	}
	
}
