package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramEmployee {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Employee employee = new Employee();
		Scanner sc = new Scanner(System.in);

		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();

		System.out.println();
		System.out.print("Employee: " + (employee));
		System.out.println();
		System.out.println();

		System.out.print("Which percentage to increase salary?");
		double increasePercent = sc.nextDouble();
		employee.increaseSalary(increasePercent);
		System.out.println();

		System.out.println("Updated data:" + (employee));

		sc.close();
	}

}