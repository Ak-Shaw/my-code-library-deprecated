import java.io.*;
public class DDA_RC
    {
        public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Order :");
            int n=Integer.parseInt(br.readLine()),k,i,j;
            int a[][]=new int[n][n];
            int b[][]=new int[n][n]; 
            System.out.println("Elements :");
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                a[i][j]=Integer.parseInt(br.readLine());
            }
            System.out.println("\fElements :");
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                System.out.print(a[i][j]+"\t");
                System.out.println();
            }
            for(i=0;i<n;i++)
            {
                for(j=0,k=n-1;j<n;j++,k--)
                b[i][j]=a[k][i];
            }
            System.out.println("\n90 degrees clockwise Rotated matrix :");
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                System.out.print(b[i][j]+"\t");
                System.out.println();
            }
            int s=b[0][0]+b[0][n-1]+b[n-1][0]+b[n-1][n-1];
            System.out.println("Sum of corner elements :"+s);
        }
}
/**
 * 
   ALGORITHM
   
   step 1: accept elements and display them in matrix format
   step 2:rotate the matrix using the code below
   for(i=0;i<n;i++)
            {
                for(j=0,k=n-1;j<n;j++,k--)
                b[i][j]=a[k][i];
            }
   step 3:display the matrix
   step 4:calculate the sum of corner elements 
   int s=b[0][0]+b[0][n-1]+b[n-1][0]+b[n-1][n-1];
   step 5: display s and exit
            
 */