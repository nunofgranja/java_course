package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee3;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee3 employee;
		List<Employee3> list = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		int i = 0;

		for (i = 0; i < n; i++) {
			System.out.println("Employee #" + i + 1 +  ":");
			System.out.print("ID:");
			Integer id = sc.nextInt();
			System.out.print("Name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary :");
			Double salary = sc.nextDouble();

			employee = new Employee3(id, name, salary);

			list.add(employee);

		}

		System.out.print("Enter the employee id that will have salary increase:");
		Integer id = sc.nextInt();
		System.out.print("Enter the percentage:");
		Double raisePercent = sc.nextDouble();

		
		Employee3 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(raisePercent);
		}

		System.out.println("List of employees: ");

		for (Employee3 x : list)

		{
			System.out.println(x);

		}

		sc.close();
	}

}