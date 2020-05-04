/**
 * n=5;
 * 
 * * * * * *
 *  *     *
 *   *   *
 *    * *
 *     *
 */
public class Pattern_34
{
public static void main(int n)
{
int i,j,s=0,t=2*n-6;
for(i=1;i<=n;i++)
{
for(j=1;j<=s;j++)
System.out.print(" ");
System.out.print("* ");
if(i==1)
{
for(j=1;j<=n-2;j++)
System.out.print("* ");
}
else
{
for(j=1;j<=t;j++)
System.out.print(" ");
t-=2;
}
if(i<n)
System.out.println("*");
s++;
}
}
}