package question3.solution;

public class Bill extends Detail {

  int n;
  double amt;

  Bill(
      String name, 
      String address, 
      long telno, 
      double rent, 
      int n) {

    // Calling the constructor of the super class
    super(name, address, telno, rent);

    this.n = n;

    amt = 0.0;
  }

  public void cal() {

    if (n >= 1 && n <= 100) {
      amt = 0.60 * n;
    } else if (n >= 101 && n <= 200) {
      amt = 60 + (n - 100) * 0.80;
    } else if (n >= 201 && n <= 300) {
      amt = 60 + 80 + (n - 200) * 1;
    } else {
      amt = 60 + 80 + 100 + (n - 300) * 1.2;
    }

    amt += this.rent;
  }
  
  @Override
  public void show() {

    super.show();
    System.out.println("Amount to be paid in INR: " + amt);
  }
}