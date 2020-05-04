/* an evil number is a positive whole number which has even number of 
 * 1's in its binary equivalent.e.g 3, 5, 6, 9, etc
 */
import java.util.*;
public class evil
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("INPUT :");
        int n=sc.nextInt();
        int r,c=0;
        String s="";
        while(n>0)
        {
            r=n%2;
            s=r+s;
            n/=2;
            if(r==1)
            c++;
        }
        System.out.println("BINARY EQUIVALENT :"+s);
        System.out.println("NO. OF 1's :"+c);
        if(c%2==0)
        System.out.println("EVIL NUMBER");
        else
        System.out.println("NOT AN EVIL NUMBER");
    }
}