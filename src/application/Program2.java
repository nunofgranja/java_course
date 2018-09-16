package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

<<<<<<< HEAD
		System.out.print("What is sthe dollar price?");
=======
		System.out.print("What is ssthe dollar price?");
>>>>>>> 684128d78f41a0459166eb1f514ee97a49a6727a
		CurrencyConverter.currencyPrice = sc.nextDouble();
		
		System.out.print("How many dollars will be bought?");
		
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.calculateTotalPurchasePrice(sc.nextDouble()));
		

		sc.close();
	}

}