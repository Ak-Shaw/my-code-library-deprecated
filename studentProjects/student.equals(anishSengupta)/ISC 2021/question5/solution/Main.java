package question5.solution;

public class Main {

    public static void main(String[] args) {

        Account account = new Account("Anish", 123456789, 1000.0, 0);

        account.deposit(100);
        account.deposit(500);
        account.withdraw(100);

        account.display();
    }

}
