/** WAP to display the following pattern--->
 * 
 *  * * * * * * *
 *   *         *
 *    *       *
 *     *     *
 *      *   *
 *       * *
 *        *
 */
import java.io.*;
public class Pattern_22
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int n,c,i,j,k,b;
System.out.print("Enter the size of Pattern :");
n=Integer.parseInt(br.readLine());
b=1;
c=n-3;
for(i=1;i<=n;i++)
System.out.print("* ");
System.out.println();
for(i=1;i<=n-2;i++)
{
for(j=b;j>=1;j--)
System.out.print(" ");
System.out.print("* ");
for(j=2*c;j>=1;j--)
System.out.print(" ");
System.out.print("* ");
System.out.println();
b=b+1;
c=c-1;
}
for(i=1;i<=b;i++)
System.out.print(" ");
System.out.print("* ");
}
}


