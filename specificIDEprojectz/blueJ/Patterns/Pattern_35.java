/**
 * n=5;
 * 
 *     *
 *    * *
 *   *   *
 *  *     *
 * * * * * *
 */
public class Pattern_35
{
public static void main(int n)
{
int i,j,s=n-1,t=0;
for(i=1;i<=n;i++)
{
for(j=1;j<=s;j++)
System.out.print(" ");
s--;
System.out.print("* ");
if(i>1&&i<n)
{
for(j=1;j<=t;j++)
System.out.print(" ");
t+=2;
}
if(i==n)
{
for(j=1;j<=n-2;j++)
System.out.print("* ");
}
if(i>1)
System.out.print("*");
System.out.println();
}
}
}