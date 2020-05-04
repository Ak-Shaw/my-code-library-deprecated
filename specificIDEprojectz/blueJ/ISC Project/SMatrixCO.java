// spiral matrix format output[clockwise]
// applicable only for non-zero elements
import java.io.*;
public class SMatrixCO
{
        public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Order :");
            int n=Integer.parseInt(br.readLine());
            int a[][]=new int[n][n],l=1,p=n,i,k;
            System.out.println("Elements :");
            for(i=0;i<n;i++)
            for(k=0;k<n;k++)
            a[i][k]=Integer.parseInt(br.readLine());
            System.out.println("\fElements :");
            for(i=0;i<n;i++)
            {
                for(k=0;k<n;k++)
                System.out.print("\t"+a[i][k]);
                System.out.println();
            }
            System.out.println("Elements in clockwise spiral arrangement :");
            for(i=0;i<n;i++)
            {
                for(k=i;k<p;k++) 
                {
                    if(a[i][k]!=0)
                    {
                        System.out.print(" "+a[i][k]);
                        a[i][k]=0;                        
                    }                    
                }
                for(k=i;k<p;k++)
                {
                    if(a[k][p-1]!=0)
                    {
                        System.out.print(" "+a[k][p-1]);
                        a[k][p-1]=0;                        
                    }                    
                }
                for(k=p-1;k>=i;k--)
                {
                    if(a[p-1][k]!=0)
                    {
                        System.out.print(" "+a[p-1][k]);
                        a[p-1][k]=0;                        
                    }                    
                }
                for(k=p-1;k>=i;k--)
                {
                    if(a[k][i]!=0)
                    {
                        System.out.print(" "+a[k][i]);
                        a[k][i]=0;                       
                    }                    
                }
                p--;
            }
        }
}
/**
 * Algorithm for clockwise spiral format output
 * 
 * step 1: accept elements and display them in matrix format
 * step 2: go through the elements in the below steps and 
 *         print the elements repectively and initializing
 *         them with 0 
 * step 3:
 * 
 * the snippet
  for(i=0;i<n;i++)
  for(k=i;k<p;k++)
  a[i][k]
  goes through the 1st row from left to right
 *
 * step 4:
 * 
 * the snippet
  for(i=0;i<n;i++)
  for(k=i;k<p;k++)
  a[k][p-1]
  goes through the last columb from top to bottom
 *
 * step 5:
 * 
 * the snippet
  for(i=0;i<n;i++)
  for(k=p-1;k>=i;k--)
  a[p-1][k]
  goes through the last row from right to left
 *
 * step 6:
 * 
 * the snippet
  for(i=0;i<n;i++)
  for(k=p-1;k>=i;k--)
  a[k][i]
  goes through the 1st columb from bottom to top
 *
 *step 7: repeat the above steps n times 
 */