package com.iesvirgendelcarmen.teoria.clasesInternas.clasesLocales;

import java.time.LocalDate;
import java.time.Period;


public class Persona {

	private String nombrePersona;
	private String dni;
	private LocalDate fechaNacimiento;

	public Persona(String nombrePersona, String dni, 
			LocalDate fechaNacimiento) {
		this.nombrePersona = nombrePersona;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public String getDni() {
		return dni;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	@Override
	public String toString() {
		return nombrePersona + ", " + dni + ", "
				+ calcularAnnosTranscurridos(fechaNacimiento) + " años"  ;
	}

	//método que nos devuelve los años transcurridos desde una fecha pasada como argumento
	public static int calcularAnnosTranscurridos(LocalDate fechaACalcular) {
		Period period = Period.between(LocalDate.now(), fechaACalcular);
		return -period.getYears();
	}


	//método que nos sirve para validar DNIs

	public static boolean validarDNI (String dniAValidar) {
		if ( ! dniAValidar.matches("^[0-9]{8}[a-zA-Z]$"))
			return false;
		//clase local que nos va a devolver un dni con su letra correcta
		class Dni {
			private String dniSinLetra;

			public Dni(String dniSinLetra) {
				this.dniSinLetra = dniSinLetra;
			}
			public String generarDNIConLetra() {
				String juegoCaracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
				int modulo= Integer.parseInt(dniSinLetra) % 23;
				char letra = juegoCaracteres.charAt(modulo);
				return dniSinLetra + letra;
			}
		}
		Dni dni = new Dni(dniAValidar.
				substring(0, dniAValidar.length() - 1));
		return dniAValidar.equalsIgnoreCase(
				dni.generarDNIConLetra());
	}
//	public static void main(String[] args) {
//		Persona p = new Persona("federico", "11111111G",
//				LocalDate.parse("2010-10-10"));
//		System.out.println(p);
//		System.out.println(validarDNI(p.getDni()));
//	}

}
