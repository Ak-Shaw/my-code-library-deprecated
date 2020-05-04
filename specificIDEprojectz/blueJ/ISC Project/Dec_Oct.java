//Accept a Decimal number and display its equivalent octal number
import java.io.*;
public class Dec_Oct
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n,r;
        String s;
        System.out.print("Decimal Number :");
        n=Integer.parseInt(br.readLine());
        s="";
        while(n>0)
        {
            r=n%8;
            n/=8;
            s=r+s;
        }
        System.out.println("Octal Equivalent :"+s);
    }
}
    /**
                        VARIABLE DESCRIPTION
         
          Object        Class
          
            br       BufferedReader
            
          Variable      Datatype        Purpose
          
             n            int       accepting a decimal integer
             r            int       specific calculation
             s           String     storing the equivalent octal number
        */
     /**
                ALGORITHM
                
         step 1 : accept a decimal integer via n
         step 2 : initialize s=""
         step 3 : perform the following statements
                  r=n%8;
                  n/=8;
                  s=r+s;
                         where r stores the remainder when n is divided by 8
                         n is reduced to its quotient when divided by 8
                         and the value of r is stored in the string s in the reversed order
                   step 3 is the process of converting a decimal number to octal
         step 4 : repeat step 3 while(n>0)
         step 5 : print the result
         step 6 : exit
      */