/**
 *    *
 *   ***
 *  *****
 * *******
 */
public class Pattern_10
{
public static void main(String args[])
{
int i,j,n=4,k,c=n-1;
for(i=1;i<=n;i++)
{
for(j=1;j<=c;j++)
System.out.print(" ");
for(k=1;k<=2*i-1;k++)
System.out.print("*");
System.out.println();
c=c-1;
}
}
}