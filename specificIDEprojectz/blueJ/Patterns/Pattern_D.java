/**
 * n=5;
 * 
 * * * * * *
 * *        *
 * *         *
 * *          * 
 * *          *
 * *          *
 * *          * 
 * *         *
 * *        *
 * * * * * *
 */
/**
 * n=6;
 * 
 * * * * * * *
 * *          *
 * *           *
 * *            *
 * *             *
 * *             *
 * *             *
 * *             *
 * *            *
 * *           *
 * *          *
 * * * * * * *
 */
public class Pattern_D
{
public static void main(int n)
{
int i,j,x,y,z;
x=n-1;
y=x+3;
z=2*n-3;
for(i=1;i<=2*n;i++)
{
System.out.print("*");
if(i==1||i==2*n)
{
for(j=1;j<=n-2;j++)
System.out.print(" *");
}
else
{
for(j=z;j>=1;j--)
System.out.print(" ");
}
System.out.print(" *");
System.out.println();
if(i<x)
z++;
if(i>=y)
z--;
}
}
}
