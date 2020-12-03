package question1.solution;

public class Perimeter {
    
    double a;
    double b;

    Perimeter(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double calculate() {
        return 2 * (a + b);
    }

    public void show() {

        System.out.println("Length: " + this.a);
        System.out.println("Breadth: " + this.b);
        System.out.println("Perimeter: " + calculate());
    }
}