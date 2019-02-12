package com.iesvirgendelcarmen.teoria.introduccion;

import java.util.ArrayList;
import java.util.List;

public class TestPersona {

	public static void main(String[] args) {
		
		List<Persona> listaPersona = new ArrayList<>();
		Persona p1 = new Persona();
		p1.setEdad(18); p1.setNombre("juanito");
		Persona p2 = new Persona();
		p2.setEdad(28); p2.setNombre("ismael");
		Persona p3 = new Persona();
		p3.setEdad(15); p3.setNombre("luisita");
		listaPersona.add(p1); listaPersona.add(p2); listaPersona.add(p3);
		System.out.println("antes de llamar al método" +p1);

		cumplirAnnos( p1);
//		System.out.println(listaPersona);
//		System.out.printf("Mayores de edad: %d%n", 
//				obtenerPersonasMayoresEdad(listaPersona));
		
	}
	public static int obtenerPersonasMayoresEdad(List<Persona> listaPersona) {
		int contador = 0;
		for (Persona persona : listaPersona) {
			if (persona.getEdad() >= 18)
				contador++;
		}
		return contador;
	}
	
	public static void cumplirAnnos(Persona persona) {
		int varible = 8;
		System.out.println("Enl método" + persona);
		int edadActual = persona.getEdad();
		int edadNueva  = edadActual + 1;
		persona.setEdad(edadNueva);
	}
	
	

}
