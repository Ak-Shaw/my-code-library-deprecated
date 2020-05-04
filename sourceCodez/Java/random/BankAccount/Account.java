public abstract class Account {

	private int accno;
	private String name;
	private double balance;

	Account(int accno, String name, double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	// public void setAccno(int accno) {
	// 	this.accno = accno;
	// }

	// public void setName(String name) {
	// 	this.name = name;
	// }

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAccno() {
		return accno;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	abstract public void deposit(double amount);
	abstract public boolean withdraw(double amount);
	abstract public void display();
}