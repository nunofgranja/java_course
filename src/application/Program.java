package application;

import java.util.Locale;
import java.util.Scanner;
import entities.BankAccount;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		BankAccount bankAccount;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Account number:");
		int accNumber = sc.nextInt();

		sc.nextLine();
		
		System.out.print("Enter Account holder:");
		String accName = sc.nextLine();

		System.out.print("Is there na initial deposit (y/n)? ");
		char initialDepositFlag = sc.next().charAt(0);

		
		if (initialDepositFlag == 'y')

		{	
			double initialDeposit;
			System.out.print("Enter initial deposit value: ");
			initialDeposit = sc.nextDouble();
			bankAccount = new BankAccount(accName, accNumber, initialDeposit);

		}
		else
		{
			bankAccount = new BankAccount(accName, accNumber);
		}
          

		System.out.printf("%n%n");
		
		System.out.print("Enter a deposit value: ");
		double depositVal = sc.nextDouble();
		bankAccount.addBalance(depositVal);
		System.out.println("Updated account data: ");
		System.out.println(bankAccount);
		
		System.out.println("");
		
		System.out.print("Enter a withdraw value: ");
		double withdrawVal = sc.nextDouble();
		bankAccount.withdrawBalance(withdrawVal);
		System.out.println("Updated account data: ");
		System.out.println(bankAccount);
		
		

		sc.close();
	}

}