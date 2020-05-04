// a + (2^0)b , a + (2^0)b + (2^1)b , a + (2^0)b + (2^1)b + (2^2)b , a + (2^0)b + (2^1)b +...+(2^(n-1))b
import java.util.*;
import java.io.*;

class Series_68{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        System.out.println("Input :");
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            a+=b;
            System.out.print(a+" ");
            for(int j=1;j<n;b*=2,a+=b,System.out.print(a+" "),j++);
            System.out.println();
                
        }
        
    }