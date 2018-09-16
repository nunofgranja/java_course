package entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;

	public double netStalary() {

		return this.grossSalary - this.tax;

	}

	public void increaseSalary(double percentage) {

		this.grossSalary = (this.grossSalary * (100.00 + percentage)) / 100.00;

	}
	
	public String toString() {
		return this.name
		+ ", $ "
		+ String.format("%.2f", this.netStalary());
		}
}
