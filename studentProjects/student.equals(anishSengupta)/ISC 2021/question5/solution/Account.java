package question5.solution;

public class Account extends Bank {
    
    double amt;

    Account(String name, int accno, double p, double amt) {
        super(name, accno, p);
        this.amt = amt;
    }

    public void deposit(int amt) {
        p += amt;
    }

    public void withdraw(int amt) {
        
        if (amt > p) {
            System.out.println("INSUFFICIENT BALANCE");
            return;
        }
        
        p -= amt;

        if (p < 500) {
            p = p - (500 - p) / 10;
        }
    }

    public void display() {
        super.display();
    }


}
