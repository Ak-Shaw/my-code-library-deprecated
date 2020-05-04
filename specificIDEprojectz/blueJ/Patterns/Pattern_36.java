/**
 * 
 *     *
 *   * * *
 *    * * 
 *     * 
 *     * 
 *     * 
 *     * 
 * * * * * *
 * 
 */
public class Pattern_36
{
public static void main(String args[])
{
int i,j,k,c,n;
n=4;c=n-1;
for(i=0;i<n;i+=2)
{
for(j=0;j<(n-i-1);j++)
System.out.print(" ");
for(j=0;j<=i;j++)
System.out.print(" *");
System.out.println();
}
for(i=n-2;i>=1;i--)
{
for(j=0;j<n-i;j++)
System.out.print(" ");
for(j=0;j<i;j++)
System.out.print(" *");
System.out.println();
}
for(i=1;i<=5;i++)
{
for(j=1;j<=n;j++)
System.out.print(" ");
System.out.println("*");
}
for(i=1;i<=5;i++)
System.out.print("* ");
}
}

