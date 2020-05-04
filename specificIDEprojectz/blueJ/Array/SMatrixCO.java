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