public class AccountFactory {

	public static Account getAccount(String accountType, int accno, String name, double balance) {

		if (accountType.equalsIgnoreCase("savings")) {
			return new Savings(accno, name, balance);
		} else if (accountType.equalsIgnoreCase("current")) {
			return new Current(accno, name, balance);
		}

		return new Current(0, "", 0.0);
	}
}