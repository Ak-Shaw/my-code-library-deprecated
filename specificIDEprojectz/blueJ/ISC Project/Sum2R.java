// WAP to add the rows of two 2D arrays
import java.io.*;
public class Sum2R
{
        public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Order of matrices :");
            int n=Integer.parseInt(br.readLine());
            int a[][]=new int[n][n];
            int i,j,s=0;
            System.out.println("Enter elements of 1st matrix :");
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                a[i][j]=Integer.parseInt(br.readLine());
            }            
            int b[][]=new int[n][n];
            System.out.println("Enter elements of 2nd matrix :");
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                b[i][j]=Integer.parseInt(br.readLine());
            }
            System.out.println("Elements of Matrix 1 :");
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                System.out.print(a[i][j]+"\t");
                System.out.println();
            }
            System.out.println("\nElements of Matrix 2 :");
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                System.out.print(b[i][j]+"\t");
                System.out.println();
            }
            System.out.println("Sum of rows of both the matrices :");
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                s+=a[i][j]+b[i][j];
                System.out.println(s);
                s=0;
            }
        }
}
    /**
                        VARIABLE DESCRIPTION
         
          Object        Class
          
            br       BufferedReader
            
          Variable      Datatype        Purpose
          
             n            int       accepting order of DDA
            a[][]         int       store matrix elements
            b[][]         int       store matrix elements
             i            int       looping
             j            int       looping
             s            int       store sum of diagonal elements

        */
    /**
                ALGORITHM
                
         step 1 : accept order of matrix n
         step 2 : accept matrix elements in DDA a[][] & b[][]
         step 3 : display the matrices
         step 4 : initialize i=0 
         step 5 : initialize j=0
         step 6 : perform s+=a[i][j]+b[i][j] 
         step 7 : repeat step 6 while(j<n) and increments by 1
         step 8 : print the result
         step 9 : initialize s=0
         step 10: increment i by 1
         step 11: repeat steps 4-10 while(i<n)
         step 12: exit
     */          
  