// a POJO class which serves as our user-defined
// data type to store time intervals

public class Interval {

    //starting interval
    private int si;

    //ending interval
    private int ei;

    public Interval(int si, int ei) {
        this.si = si;
        this.ei = ei;
    }

    public int getSi() {
        return si;
    }

    public int getEi() {
        return ei;
    }

}
