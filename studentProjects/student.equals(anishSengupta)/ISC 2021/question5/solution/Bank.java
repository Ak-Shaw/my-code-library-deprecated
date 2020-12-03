package question5.solution;

public class Bank {
    
    String name;
    int accno;
    double p;

    Bank(String name, int accno, double p) {
        this.name = name;
        this.accno = accno;
        this.p = p;
    }

    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return  "Name: " + name + "\n" +
                "Account No.: " + accno + "\n" +
                "Principal Amount: " + p + "\n";
    }

    
}