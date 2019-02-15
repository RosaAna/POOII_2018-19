package com.iesvirgendelcarmen.ejercicios.ejercicio2;

import java.util.Random;
import java.util.Scanner;

public class TestCreditCard {
	private static final int NUMBER_OF_DIGIT = 16;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter owner of credit card");
		Scanner sc = new Scanner(System.in);
		String owner = sc.nextLine();
		sc.close();
		CreditCard card = null;
		do {
			card = new CreditCard(generateNumberCard(), owner);
			System.out.println(card);
			System.out.printf("Valid card? %B%n", 
					CreditCard.checkCreditNumber(card.getNumberCreditCard()) );
		} while (!CreditCard.checkCreditNumber(card.getNumberCreditCard()));

	}
	private static String generateNumberCard() {
		// TODO Auto-generated method stub
		StringBuilder sBuilder = new StringBuilder();
		for (int i = 0; i < NUMBER_OF_DIGIT; i++) {
			sBuilder.append(generateRandomANumber());
		}
		return sBuilder.toString();
	}
	private static int generateRandomANumber() {
		// TODO Auto-generated method stub
		Random random = new Random();
		return random.nextInt(10); //range values 0 .. 9
	}

}
