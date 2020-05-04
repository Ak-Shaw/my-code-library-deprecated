/**
 * n=3;
 * 
 * *   *   *
 * *   *   *
 * * * * * *
 *     *
 *     *
 *     *
 * * * * * *
 * *   *   *
 * *   *   *
 */
public class Pattern_26
{
public static void main(int n)
{
int i,c,b,j;
b=2*n-3;
c=2*n-2;
for(i=1;i<=n-1;i++)
{
System.out.print("*");
for(j=1;j<=b;j++)
System.out.print(" ");
System.out.print("*");
for(j=1;j<=b;j++)
System.out.print(" ");
System.out.print("*\n");
}
for(i=1;i<=2*n-1;i++)
System.out.print("* ");
System.out.println();
for(i=1;i<=n;i++)
{
for(j=1;j<=c;j++)
System.out.print(" ");
System.out.print("*\n");
}
for(i=1;i<=2*n-1;i++)
System.out.print("* ");
System.out.println();
for(i=1;i<=n-1;i++)
{
System.out.print("*");
for(j=1;j<=b;j++)
System.out.print(" ");
System.out.print("*");
for(j=1;j<=b;j++)
System.out.print(" ");
System.out.print("*\n");
}
}
}