// Spiral Matrix [Clockwise]
import java.io.*;
public class SMatrixC
{
        public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Order :");
            int n=Integer.parseInt(br.readLine());
            int a[][]=new int[n][n],l=1,p=n,i,k;
            for(i=0;i<n;i++)
            {
                for(k=0;k<p;k++) //for(k=i;k<p;k++)
                {
                    if(a[i][k]==0)
                    {
                        a[i][k]=l;
                        l++;
                    }
                }
                for(k=i;k<p;k++)
                {
                    if(a[k][p-1]==0)
                    {
                        a[k][p-1]=l;
                        l++;
                    }
                }
                for(k=p-1;k>=i;k--)
                {
                    if(a[p-1][k]==0)
                    {
                        a[p-1][k]=l;
                        l++;
                    }
                }
                for(k=p-1;k>=i;k--)
                {
                    if(a[k][i]==0)
                    {
                        a[k][i]=l;
                        l++;
                    }
                }
                p--;
            }
            System.out.println("\fClockwise Spiral Matrix of order "+n+" :");
            for(i=0;i<n;i++)
            {
                for(k=0;k<n;k++)
                System.out.print(a[i][k]+"\t");
                System.out.println();
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
             i            int       looping
             k            int       looping
             p            int       specific calculation
             l            int       initializing array elements

        */
    /**
                ALGORITHM
                
         step 1 : accept order of matrix n
         step 2 : initialize l=1 & p=n
         step 3 : initialize i=0
         step 4 : repeat steps 5-18 while(i<n)
         step 5 : initialize k=0
         step 6 : if(a[i][k]==0) is true then assign a[i][k]=l and increment l by 1
         step 7 : repeat step 6 while(k<p) & increments by 1
         step 8 : initialize k=i
         step 9 : if(a[k][p-1]==0) is true then assign a[k][p-1]=l and increment l by 1
         step 10: repeat step 9 while(k<p) & increments by 1
         step 11: initialize k=p-1
         step 12: if(a[p-1][k]==0) is true then assign a[p-1][k]=l and increment l by 1
         step 13: repeat step 12 while(k>=i) & decrements by 1
         step 14: initialize k=p-1
         step 15: if(a[k][i]==0) is true then assign a[k][i]=l and increment l by 1
         step 16: repeat step 12 while(k>=i) & decrements by 1
         step 17: decrement p by 1
         step 18: increment i by 1
         step 19: display the resultant spiral matrix [clockwise]
         step 20: exit
       */