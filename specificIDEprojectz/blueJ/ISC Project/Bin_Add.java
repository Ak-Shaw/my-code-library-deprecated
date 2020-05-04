// WAP to calculate the sum of two binary numbers
import java.util.*;
public class Bin_Add
{
        public double addBinary(long b1,long b2)
        {
            long sum,carry=0,bit1,bit2,ct=0;
            double t=0;
            while(b1!=0)
            {
                bit1=b1%10;
                bit2=b2%10;
                if((bit1+bit2+ct)%2==0)
                sum=0;
                else
                sum=1;
                if((bit1+bit2+ct)>=2)
                ct=1;
                else
                ct=0;
                t=t+sum*Math.pow(10,carry++);
                b1/=10;
                b2/=10;
            }
            t=t+ct*Math.pow(10,carry);
            return t;
        }
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            long b1,b2,t;
            double b;
            System.out.println("Enter 2 binary numbers :");
            b1=sc.nextLong();
            b2=sc.nextLong();
            Bin_Add ob=new Bin_Add();
            b=ob.addBinary(b1,b2);
            t=(long)b;
            System.out.println("\nSum = "+t);
        }
}
    /**
                        VARIABLE DESCRIPTION
         
          Object        Class
          
            sc         Scanner
            ob         Bin_Add
            
      main() description :
            
          Variable      Datatype        Purpose
          
             b1           long      accepting a binary number
             b2           long      accepting a binary number
             t            long      storing the explicitly converted value of b
             b           double     storing the sum of b1 & b2 in binary form
             
      addBinary(long b1,long b2) description :
      
          Variable      Datatype        Purpose
          
            sum           long      specific calculation
           carry          long      specific calculation
            bit1          long      specific calculation
            bit2          long      specific calculation
             ct           long      specific calculation
             t           double     calculating the sum of b1 & b2 in binary form
             
       */
    /**
                ALGORITHM
                
         main():
         
         step 1 : accept two binary numbers b1 and b2 from the user
         step 2 : create an object ob of the class Bin_Add
         step 3 : invoke the function addBinary() via the statement b=ob.addBinary(b1,b2)
         step 4 : convert the returned double value of b via t=(long)b
         step 5 : print the result
         step 6 : exit
         
         addBinary(long b1,long b2):
         
         step 1 : initialize carry, ct & t to 0
         step 2 : repeat steps 3-7 while(b1!=0)
         step 3 : perform bit1=b1%10 & bit2=b2%10
         step 4 : if((bit1+bit2+ct)%2==0) is true
                    then initialize sum to 0 else 1;
         step 5 : if((bit1+bit2+ct)>=0) is true
                    then initialize ct to 1 else 0;
         step 6 : perform t=t+sum*Math.pow(10,carry++)
                    this statement calculates the sum of each bit of both the numbers
         step 7 : perform b1/=10;
                          b2/=10;
         step 6 : perform t=t+ct*Math.pow(10,carry)
         step 7 : return t
         
     */