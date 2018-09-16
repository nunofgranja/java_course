package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("What is sthe dollar price?");
		CurrencyConverter.currencyPrice = sc.nextDouble();
		
		System.out.print("How many dollars will be bought?");
		
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.calculateTotalPurchasePrice(sc.nextDouble()));
		

		sc.close();
	}

}