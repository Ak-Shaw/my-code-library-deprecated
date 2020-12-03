package question1.solution;

public class Area extends Perimeter {

    double h;
    double area;

    Area(double a, double b, double h) {
        super(a, b);
        this.h = h;
    }

    public void doarea() {
        this.area = this.b * this.h;
    }

    @Override
    public void show() {

        System.out.println("Length: " + this.a);
        System.out.println("Breadth: " + this.b);
        System.out.println("Height: " + this.h);
        System.out.println("Perimeter: " + calculate());
        doarea();
        System.out.println("Area: " + this.area);
    }
    
}