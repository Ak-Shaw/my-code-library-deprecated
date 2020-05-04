/**
 * n=4;
 * 
 * *     *
 *  *   *
 *   * *
 *    *
 *   * *
 *  *   *
 * *     *
 */
public class Pattern_X
{
public static void main(int n)
{
int i,j,c=0,d;
d=2*n-3;
for(i=1;i<=n;i++)
{
for(j=1;j<=c;j++)
System.out.print(" ");
System.out.print("*");
for(j=1;j<=d;j++)
System.out.print(" ");
if(i!=n)
System.out.print("*");
System.out.println();
c++;
d-=2;
}
c-=2;
d=1;
for(i=1;i<=n-1;i++)
{
for(j=c;j>=1;j--)
System.out.print(" ");
System.out.print("*");
for(j=d;j>=1;j--)
System.out.print(" ");
System.out.print("*");
System.out.println();
c-=1;
d+=2;
}
}
}