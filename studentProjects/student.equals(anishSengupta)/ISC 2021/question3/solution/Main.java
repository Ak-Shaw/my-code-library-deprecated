package question3.solution;

public class Main {

  public static void main(String[] args) {
    
    Bill newBill = new Bill(
        "Anish Sengupta", 
        "Nilachal", 
        9876543210l, 
        5000, 
        250);

    newBill.cal();
    newBill.show();
  }
}