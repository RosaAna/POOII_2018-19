package com.iesvirgendelcarmen.ejercicios.ejercicio2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CreditCard {
	
	private String numberCreditCard;
	private String owner;
	private LocalDate creationDate = LocalDate.now();
	
	public CreditCard(String numberCreditCard, String owner) {
		this.numberCreditCard = numberCreditCard;
		this.owner = owner;
	}

	public String getNumberCreditCard() {
		return numberCreditCard;
	}

	public void setNumberCreditCard(String numberCreditCard) {
		this.numberCreditCard = numberCreditCard;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}
	
	
	
	
	@Override
	public String toString() {
		return String.format("%S%n%s%nExpiration date: %d/%s%n", owner, numberCreditCard, 
				creationDate.getMonthValue(), 
				("" + creationDate.plusYears(4).getYear()).substring(2));
	}


	public static boolean checkCreditNumber(String creditNumberToValidate) {
		
		return false;
	}
	
	
	public static void main(String[] args) {
		CreditCard card = new CreditCard("1111", "pepe");
		System.out.println(card);
		
		
	}

	
	
}
