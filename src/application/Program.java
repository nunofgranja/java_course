package application;

import java.util.Locale;
import java.util.Scanner;
import entities.BankAccount;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Account number:");
		int accNumber = sc.nextInt();

		sc.nextLine();
		
		System.out.print("Enter Account holder:");
		String accName = sc.nextLine();

		System.out.print("Is there na initial deposit (y/n)? ");
		char initialDepositFlag = sc.next().charAt(0);

		double initialDeposit = 0.00;

		if (initialDepositFlag == 'y')

		{
			System.out.print("Enter initial deposit value: ");
			initialDeposit = sc.nextDouble();

		}

		BankAccount bankAccount = new BankAccount(accName, accNumber, initialDeposit);

		System.out.printf("%n%n");
		
		System.out.print("Enter a deposit value: ");
		double depositVal = sc.nextDouble();
		bankAccount.addBalance(depositVal);
		System.out.println("Updated account data: ");
		System.out.println("Account " + bankAccount.getNumber() + ", Holder: " + bankAccount.getName() + ", Balance: " + bankAccount.getBalance());
		
		System.out.println("");
		
		System.out.print("Enter a withdraw value: ");
		double withdrawVal = sc.nextDouble();
		bankAccount.withdrawBalance(withdrawVal);
		System.out.println("Account " + bankAccount.getNumber() + ", Holder: " + bankAccount.getName() + ", Balance: " + bankAccount.getBalance());
		
		

		sc.close();
	}

}