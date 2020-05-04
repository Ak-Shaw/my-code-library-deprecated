/** WAP to display the following pattern--->
 *
 *     *
 *    ***
 *   *****
 *  *******
 *   *****
 *    ***
 *     *
 */
import java.io.*;
public class Pattern_21
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int n,c,i,j,k;
System.out.print("Enter the size of Pattern :");
n=Integer.parseInt(br.readLine());
c=n-1;
for(i=1;i<=n;i++)
{
for(j=1;j<=c;j++)
System.out.print(" ");
for(k=1;k<=2*i-1;k++)
System.out.print("*");
System.out.println();
c=c-1;
}
c=1;
for(i=n-1;i>=1;i--)
{
for(j=c;j>=1;j--)
System.out.print(" ");
for(k=2*i-1;k>=1;k--)
System.out.print("*");
System.out.println();
c=c+1;
}
}
}
