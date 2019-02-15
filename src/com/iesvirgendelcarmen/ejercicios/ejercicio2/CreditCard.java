package com.iesvirgendelcarmen.ejercicios.ejercicio2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CreditCard {
	private static final int NUMBER_OF_DIGIT = 16;
	private String numberCreditCard;  //16 digits
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
		if (! creditNumberToValidate.matches("[0-9]{" + NUMBER_OF_DIGIT + "}"))
			return false;
		class DigitControl{
			private String creditNumberWithoutDigitControl;

			public DigitControl(String creditNumberWithoutDigitControl) {
				this.creditNumberWithoutDigitControl = creditNumberWithoutDigitControl;
			}
			public String generateCreditCardWithDigitControl() {
				int digitCrontol = generateDigitControl();
				return creditNumberWithoutDigitControl + digitCrontol;
			}
			private int generateDigitControl() {
				StringBuilder sBuilder = new StringBuilder(creditNumberWithoutDigitControl);
				String creditNWDCReverse = sBuilder.reverse().toString();

				int sum = 0,  partialValue = 0;
				for (int i = 0; i < creditNWDCReverse.length(); i ++) { 
					if ( i % 2 == 0) {
						partialValue = (creditNWDCReverse.charAt(i) - 48) * 2;
						if (partialValue > 9 ) {
							partialValue %= 10;
							partialValue++;
						}
					}

					else
						partialValue = creditNWDCReverse.charAt(i) - 48;

					sum += partialValue;
				}



				return sum % 10;
			}
		}
		DigitControl dcControl = new DigitControl(
				creditNumberToValidate.substring(0, NUMBER_OF_DIGIT - 1));
		return creditNumberToValidate.equals(
				dcControl.generateCreditCardWithDigitControl());
	}


	public static void main(String[] args) {
		CreditCard card = new CreditCard("2044750038249274", "pepe");
		System.out.println(card);
		System.out.println("Tarjeta es válida: " +
				CreditCard.checkCreditNumber(card.getNumberCreditCard()));
		
	}



}
