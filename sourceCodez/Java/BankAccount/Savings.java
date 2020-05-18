public final class Savings extends Account {

	Savings(int accno, String name, double balance) {
		super(accno, name, balance);
	}

	public void deposit(double amount) {
		setBalance(getBalance() + amount);
	}

	public boolean withdraw(double amount) {

		if (amount <= getBalance() && (getBalance() - amount >= 500)) {
			setBalance(getBalance() - amount);
			return true;
		}

		return  false;
	}

	public void display() {

		System.out.println("\n\nAccount Number : " + getAccno());
		System.out.println("Name : " + getName());
		System.out.println("Deposited Amount : " + getBalance());
		System.out.println("Interest : " + getBalance()*4/100);
		System.out.println("Total Amount : " + (getBalance() + getBalance()*4/100));
	}
}