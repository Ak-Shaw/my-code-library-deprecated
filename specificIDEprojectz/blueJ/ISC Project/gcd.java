// GCD using recursion
import java.io.*;
public class gcd
    {
        public static int findgcd(int x,int y)
        {
            if(x==y)
            return x;
            else if(x>y)
            x=x-y;
            else if(y>x)
            y=y-x;
            return(findgcd(x,y));
        }
        public static void main()throws IOException
        {
            int a,b,c;
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter the two numbers");
            a=Integer.parseInt(br.readLine());
            b=Integer.parseInt(br.readLine());
            c=findgcd(a,b);
            System.out.println("GCD of two numbers is "+c);
        }
    }
/**
 * ALGORITHM
 * 
 * a,b are the inputted numbers
 * Int findgcd(int x,int y)
 * 
 * 1.if(x==y)
 * return x;
 * 2. elseif(x>y)
 * x=x-y;
 * 3. elseif(y>x)
 * y=y-x;
 * 4.return(findgcd(x,y))
 * [calls the same function from its body]
 * 5. end
 */