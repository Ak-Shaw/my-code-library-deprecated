//Trapping rainwater
import java.util.*;
public class TrapRain {

    public static void main(String args[]) {
        int n, i, l = 0, r = 0, ele;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int elev[] = new int[n];
        for (i = 0; i < n; i++) {
            elev[i] = sc.nextInt();
        }
        int leftMax[] = new int[n];
        int RightMax[]=new int[n];

        int totans = 0;
        leftMax[0]=elev[0];
        RightMax[n-1]=elev[n-1];
        for (i = 1; i <n ; i++) {
            leftMax[i] = maxBound(elev[i],leftMax[i-1]);
        }
        for (i = n-2; i >=0; i--) {
            RightMax[i]=maxBound(RightMax[i+1],elev[i]);
        }
        System.out.println(Arrays.toString(leftMax));
        System.out.println(Arrays.toString(RightMax));
        for (i = 0; i <n; i++) {
           totans=totans+(Math.min(leftMax[i],RightMax[i])-elev[i]);

        }
             System.out.println(totans);
    }
    public static int maxBound(int a,int b)
    {
        int max=Math.max(a,b);
        return max;
    }
   
}
