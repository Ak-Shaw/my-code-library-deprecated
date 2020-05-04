/*
  Accept a 2D array and then display the 2D array
  after sorting it          
 */
// [bubble sort method]
import java.io.*;
public class Sort2D
{
        public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Order of rows :");
            int n1=Integer.parseInt(br.readLine());
            System.out.print("Order of columbs :");
            int n2=Integer.parseInt(br.readLine());
            int a[][]=new int[n1][n2];
            int i,j,k=0,t,q=n1*n2;
            System.out.println("\nElements :");
            for(i=0;i<n1;i++)
            {
                for(j=0;j<n2;j++)
                a[i][j]=Integer.parseInt(br.readLine());
            }
            int b[]=new int[q];
            System.out.println("\nElements :");
            for(i=0;i<n1;i++)
            {
                for(j=0;j<n2;j++,k++)
                {
                    System.out.print(a[i][j]+"\t");
                    b[k]=a[i][j];
                }
                System.out.println();
            }
            for(i=0;i<q;i++)
            {
                for(j=0;j<q-1;j++)
                {
                    if(b[j]>b[j+1])
                    {
                        t=b[j];
                        b[j]=b[j+1];
                        b[j+1]=t;
                    }
                }
            }
            k=0;
            for(i=0;i<n1;i++)
            {
                for(j=0;j<n2;j++,k++)
                a[i][j]=b[k];
            }
            System.out.println("Sorted Elements :");
            for(i=0;i<n1;i++)
            {
                for(j=0,k=0;j<n2;j++,k++)
                {
                    System.out.print(a[i][j]+"\t");
                    b[k]=a[i][j];
                }
                System.out.println();
            }
        }
}
    /**
                        VARIABLE DESCRIPTION
         
          Object        Class
          
            br       BufferedReader
            
          Variable      Datatype        Purpose
          
             n1           int       accept row order
             n2           int       accept columb order
            a[][]         int       store 2D array
             i            int       looping
             j            int       looping
             k            int       looping
             t            int       swapping
             q            int       calculate length of b[]
             b[]          int       create equivalent SDA of a[][]
             
             */
   /**
                ALGORITHM
                
         Step 1 : accpet the row and columb order for DDA via n1 and n2
         Step 2 : accept the matrix elements for a[][] and display it
         Step 3 : extract each element of a[][] and store it in a SDA b[]
                  where the size of b[] is that of q=n1*n2
         Step 4 : initialize i=0 and repeat steps 5-7 while i<q
         Step 5 : initialize j=0 and repeat steps 6 and 7 while j<q-1
         Step 6 : if(b[j]>b[j+1]) returns true value then swap them
         Step 7 : j increments by 1 and so does i
         Step 8 : after steps 4-7 are over(i.e bubble sort technique)
                  store the elements of SDA b[] to DDA a[][]
         Step 9 : Finally print the DDA a[][] and exit
         */
      
         