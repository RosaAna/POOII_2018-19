package com.iesvirgendelcarmen.teoria.clasesInternas.clasesLocales;

import java.time.LocalDate;
import java.util.Scanner;

public class TestPersona {

	public static void main(String[] args) {
		System.out.println("Introduce nombre, dni, fecha nacimiento");
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("(\n|(\r\n))");
		String nombrePersona = sc.next();
		String dni = sc.next();
		String fechaNacimiento = sc.next();
		sc.close();
		//System.out.println(nombrePersona + "-" + dni 
		//		+ "-" + fechaNacimiento);
		if (fechaNacimiento.matches(
				"\\d{4}[-/]\\d{2}[-/]\\d{2}") && 
				(Persona.validarDNI(dni.trim()))){
			Persona persona = new Persona(nombrePersona.trim(),
					dni.trim(), LocalDate.parse(fechaNacimiento.replaceAll("/","-")));
			System.out.println(persona);
//			System.out.printf("Dni %s válido %B%n", persona.getDni(),
//					Persona.validarDNI(persona.getDni()));

		} else {
			System.out.println("No se puede crear objeto persona");
		}
	}

}
