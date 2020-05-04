/**
 * n=5;
 * 
 * *       * * * * *
 * *       *
 * *       *
 * *       *
 * * * * * * * * * *
 *         *       *
 *         *       *
 *         *       *
 * * * * * *       *
 */
/**
 * n=6;
 *
 *
 * *         * * * * * *
 * *         * 
 * *         *
 * *         *
 * *         *
 * * * * * * * * * * * *
 *           *         *
 *           *         *
 *           *         *
 *           *         *
 * * * * * * *         *
 * 
 */
public class Pattern_23
{
public static void main(int n)
{
int i,j;
System.out.print("*");
for(i=1;i<=2*n-3;i++)
System.out.print(" ");
for(i=1;i<=n;i++)
System.out.print("* ");
System.out.println();
for(i=1;i<=n-2;i++)
{
System.out.print("*");
for(j=1;j<=2*n-3;j++)
System.out.print(" ");
System.out.print("*");
System.out.println();
}
for(i=1;i<=2*n-1;i++)
System.out.print("* ");
System.out.println();
for(i=1;i<=n-2;i++)
{
for(j=1;j<=2*n-2;j++)
System.out.print(" ");
System.out.print("*");
for(j=1;j<=2*n-3;j++)
System.out.print(" ");
System.out.print("*");
System.out.println();
}
for(i=1;i<=n;i++)
System.out.print("* ");
for(i=1;i<=2*n-4;i++)
System.out.print(" ");
System.out.print("*");
}
}