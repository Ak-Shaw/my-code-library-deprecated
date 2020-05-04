// Accept a DDA and display its sparse matrix
import java.io.*;
public class SparseM
{
        public static void main()throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Order :");
            int n=Integer.parseInt(br.readLine());
            int a[][]=new int[n][n];
            int i,j,c=0,k=0,v=0;
            double l;
            System.out.println("Enter the elements of the 2D matrix");
            for(i=0;i<n;i++)
            for(j=0;j<n;j++)
            a[i][j]=Integer.parseInt(br.readLine());
            System.out.println("Original Matrix :");
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                System.out.print(a[i][j]+"\t");
                System.out.println();
            }
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    if(a[i][j]!=0)
                    c++;
                }
            }
            l=(n*n)/3;
            if(c<=l)
            {
                int b[][]=new int[c][3];
                for(i=0;i<n;i++)
                {
                    for(j=0;j<n;j++)
                    {
                        k=0;
                        if(a[i][j]!=0)
                        {
                            b[v][k]=a[i][j];
                            b[v][k+1]=i;
                            b[v][k+2]=j;
                        }
                    }
                    v++;
                }
                System.out.println("Sparse Matrix :");
                for(i=0;i<c;i++)
                {
                    for(j=0;j<3;j++)
                    System.out.print(b[i][j]+"\t");
                    System.out.println();
                }
            }
            else
            System.out.println("Sparse Matrix not applicable");
        }
}

    /**
                        VARIABLE DESCRIPTION
         
          Object        Class
          
            br       BufferedReader
            
          Variable      Datatype        Purpose
          
             n            int       to accept order of DDA           
            a[][]         int       to accept matrix elements
             i            int       looping
             j            int       looping
             c            int       condition for creating sparse matrix
             k            int       specific calculation
             v            int       specific calculation
            b[][]         int       creating sparse matrix
             l           double     specific calculation
          */
    /**
                ALGORITHM
                
         n is the order of the array
         the array is inputted from the user and printed
         
         step 1 : initialize i=0
         step 2 : repeat steps 3-7 while(i<n)
         step 3 : initialize j=0
         step 4 : repeat step 5-6 while(j<n)
         step 5 : if(a[i][j]!=0)
                  increase counter c by 1
         step 6 : increase j by 1
         step 7 : increase i by 1
         step 8 : exit
         
         Creating sparse matrix :
         
         step 1 : l=(n*n)/3
         step 2 : if(c<=l)
                  create another array b of order[c][3]
         step 3 : initialize i=0
         step 4 : repeat steps 5-9 while(i<n)
         step 5 : initialize j=0
         step 6 : repeat steps 7-8 while(j<n)
         step 7 : if(a[i][j]!=0)
                  fill the 1st element of array b with the non zero element
                  fill the 2nd element of array b with the index of row in the array a
                  fill the 3rd element of array b with the index of columb int the array a
                  (repeat as per the value of c)
         step 8 : increase j by 1
         step 9 : increase i by 1
         step 10: exit
       */