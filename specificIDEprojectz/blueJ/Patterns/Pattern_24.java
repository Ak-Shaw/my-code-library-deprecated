/**
 * n=5;
 * 
 * * * * * *
 *  * * * *
 *   * * *
 *    * *
 *     *
 *    * *
 *   * * *
 *  * * * *
 * * * * * *
 */
public class Pattern_24
{
public static void main(int n)
{
int c,i,j,k=0;
c=n-2;
for(i=n;i>=1;i--)
{
for(j=1;j<=k;j++)
System.out.print(" ");
for(j=1;j<=i;j++)
System.out.print("* ");
System.out.println();
k++;
}
for(i=2;i<=n;i++)
{
for(j=c;j>=1;j--)
System.out.print(" ");
for(j=1;j<=i;j++)
System.out.print("* ");
System.out.println();
c--;
}
}
}


