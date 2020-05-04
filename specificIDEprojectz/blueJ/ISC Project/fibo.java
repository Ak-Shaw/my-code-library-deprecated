// displaying fibonacci series using recursion

import java.io.*;
class fibo
    {
        int n,a=0,b=0,x=1;
        void getdata()throws IOException
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter the number of terms");
            n=Integer.parseInt(br.readLine());
        }
        void series(int x)
        {
            int c;
            b=x;
            c=a+b;
            if(n>2)
            {
                System.out.println(c);
                a=b;
                n--;
                series(c);
            }
        }
        public static void main()throws IOException
        {
            fibo ob=new fibo();
            ob.getdata();
            System.out.println("the fibonacci series is");
            ob.series(1);
        }
}
/**
 * ALGORITHM
 * 
 *n is the number of terms. Initialize b to 0,A to 0and xto1
 *
 *void series(int x)
 *1. b=x
 *2. c=a+b
 *3. if(n>2)
 *      Print(c);
 *      a=b;
 *4. Decrease n by 1
 *  Call function "Series(c)"
 *5. repeat steps 1-4 n-2 times
 *6. end
 */