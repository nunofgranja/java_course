package entities;

public class BankAccount {

	private String name;
	private int number;
	private double balance;
	private double tax = 5.00;

	public BankAccount(String name, int number, double balance) {
		super();
		this.name = name;
		this.number = number;
		this.balance = balance;
	}
	
	public BankAccount(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}

	public void addBalance(double value) {

		balance += value;

	}

	public void withdrawBalance(double value) {

		balance -= value + tax;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return 
				"Account " 
				+ number 
				+ ", Holder: " 
				+ number + 
				", Balance: $" 
				+ String.format("%.2f", balance);
	}

}
