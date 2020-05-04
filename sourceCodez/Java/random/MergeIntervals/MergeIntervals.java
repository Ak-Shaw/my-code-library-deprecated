import java.io.*;
import java.util.*;

class MergeIntervals {
    
    public static void main(String[] args) {
    
        // TreeSet<Interval> intervals = new TreeSet<Interval>(new DDA_Sort());

        // intervals.add(new Interval(8,9));
        // intervals.add(new Interval(1,5));
        // intervals.add(new Interval(2,4));
        // intervals.add(new Interval(6,7));
        // intervals.add(new Interval(2,3));

        // for(Interval i:intervals){
        //     System.out.println(i);
        // }

        TreeSet<Interval> intervals = new TreeSet<Interval>(new DDA_Sort());

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++){
            int si=sc.nextInt();
            int ei=sc.nextInt();
            sc.nextLine();
            intervals.add(new Interval(si,ei));
        }

        sc.close();

        List<Interval> inter=new ArrayList<>();

        for(Interval i:intervals){
            inter.add(i);
        }

        int mergeCount=1;

        while( mergeCount > 0 ){

            mergeCount=0;

            for(int i=0; i<inter.size()-1; i++){

                int si1, si2, ei1, ei2, msi, mei;

                si1=inter.get(i).getSi();
                ei1=inter.get(i).getEi();

                si2=inter.get(i+1).getSi();
                ei2=inter.get(i+1).getEi();

                if(ei1<si2)
                    continue;

                if(si1<=si2 && ei2>=ei1){
                    
                    msi=si1;
                    mei=ei2;

                    inter.remove(i);
                    inter.remove(i);
                    inter.add(i, new Interval(msi, mei));

                    mergeCount++;

                } else if(si1==si2 && ei2<ei1){

                    mergeCount++;

                    inter.remove(i+1);

                } else if(si1<si2 && ei1>ei2){

                    mergeCount++;

                    inter.remove(i+1);

                }
            }
        }

        for(Interval i:inter){
            System.out.println(i);
        }
    }
}

class Interval{

    private int si;
    private int ei;

    Interval(int si, int ei){
        this.si=si;
        this.ei=ei;
    }

    public void setSi(int si){
        this.si=si;
    }

    public void setEi(int ei){
        this.ei=ei;
    }

    public int getSi(){
        return si;
    }

    public int getEi(){
        return ei;
    }

    public String toString(){
        // return "["+this.si+", "+this.ei+"]";
        return this.si+" "+this.ei;
    }
}

class DDA_Sort implements Comparator<Interval>{
 
    @Override
    public int compare(Interval i1, Interval i2) {
        int c=i1.getSi()-i2.getSi();

        if(c!=0)
            return c;

        return i1.getEi()-i2.getEi();
    }
}  