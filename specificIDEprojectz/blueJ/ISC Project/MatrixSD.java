/*
   WAP to accept a DDA of order nXn and display the sum of
   diagonal elements
 */
import java.io.*;
public class MatrixSD
{
        public static void main()throws IOException
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Order :");
            int n=Integer.parseInt(br.readLine());
            int a[][]=new int[n][n],i,j,s=0;
            System.out.println("Elements :");
            for(i=0;i<n;i++)
            for(j=0;j<n;j++)
            a[i][j]=Integer.parseInt(br.readLine());
            System.out.println("\fMatrix Elements :");
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                System.out.print(a[i][j]+" ");
                System.out.println();
            }
            for(i=0;i<n;i++)
            s+=a[i][i];
            System.out.println("\nSum of left diagonal :"+s);
            s=0;
            for(j=n-1,i=0;i<n;i++,j--)
            s+=a[i][j];
            System.out.println("\nSum of right diagonal :"+s);
        }
}
    /**
                        VARIABLE DESCRIPTION
         
          Object        Class
          
            br       BufferedReader
            
          Variable      Datatype        Purpose
          
             n            int       accepting order of DDA
            a[][]         int       store matrix elements
             i            int       looping
             j            int       looping
             s            int       store sum of diagonal elements

        */
    /**
                ALGORITHM
                
         step 1 : accept order of matrix n
         step 2 : accept matrix elements in DDA a[][]
         step 3 : display the matrix
         step 4 : initialize s=0 & i=0 and perform s+=a[i][i] while(i<n) and increments by 1
                  where a[i][i] consists of the left diagonal elements  
         step 5 : print the result
         step 6 : initialize i=0 & j=n-1 and perform s+=a[i][j] while(i<n) where i & j increments and decrements by 1 respectively
                  here a[i][j] consists of the right diagonal elements
         step 7 : print the result
         step 8 : exit
         
         */
            