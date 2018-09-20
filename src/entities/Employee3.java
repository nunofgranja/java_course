package entities;

public class Employee3 {

	private Integer id;
	private String name;
	private double salary;

	public Employee3(Integer id, String name, double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public double getSalary() {
		return salary;
	}

	public void increaseSalary(double percentage) {

		salary = (salary * (100.00 + percentage)) / 100.00;

	}

	@Override
	public String toString() {
		return  id + ", "
				+ name + ", "
				+ String.format("%.2f", salary);
	}
	

}
