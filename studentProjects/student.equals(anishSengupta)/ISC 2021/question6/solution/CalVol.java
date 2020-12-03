package question6.solution;

public class CalVol extends Base implements Data {
    
    double ht;

    CalVol(double rad, double ht) {
        super(rad);
        this.ht = ht;
    }

    public double volume() {
        return pi * rad * rad * ht;
    }

    public void show() {
        System.out.println("Radius of Cylinder: " + rad);
        System.out.println("Height of Cylinder: " + ht);
        System.out.println("Volume of Cylinder: " + volume());
    }
}
