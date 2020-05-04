// displaying factorial of a number using recursion

import java.io.*;
class facto
    {
        int a=1,x;
        void getdata()throws IOException
        {
            
        }
        void fact(int x)
        {
            if(x>1)
            {
                a*=x;
                fact(x-1);
            }
            else
            System.out.println("Factorial ="+a);
        }
        public static void main()throws IOException
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter the number");
            int n=Integer.parseInt(br.readLine());
            facto ob=new facto();
            ob.fact(n);
        }
}
/**
 * ALGORITHM
 * 
 *n is the number 
 *
 *void fact(int x)
 *1. a*=x;
 *2.Call function "fact(x-1)"
 *3. repeat steps 1&2 n-1 times
 *6. end
 */