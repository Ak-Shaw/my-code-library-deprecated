/**
 * n=5;
 * 
 * * * * * *
 * *        *
 * *         *
 * *        *
 * * * * * *
 * *        *
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
 * *           * 
 * *          *
 * * * * * * *
 * *          *
 * *           *
 * *           *
 * *          *
 * * * * * * *
 */
public class Pattern_B
{
public static void main(int n)
{
int i,j,p,q,r;
q=0;
if(n%2==0)
q=1;
r=n/2+1;
p=2*n-2;
for(i=1;i<=n;i++)
{
System.out.print("*");
if(i>1)
{
if(i<=r&&q==0)
p++;
if(i>r&&q==0)
p--;
if(i<=r&&q==1)
p++;
if(i>=r&&q==1)
p--;
}
if(i==1||i==n)
{
for(j=1;j<n;j++)
System.out.print(" *");
}
else
{
for(j=1;j<=p;j++)
System.out.print(" ");
System.out.print("*");
}
System.out.println();
}
p=2*n-2;
for(i=2;i<=n;i++)
{
System.out.print("*");
if(i<=r&&q==0)
p++;
if(i>r&&q==0)
p--;
if(i<=r&&q==1)
p++;
if(i>=r&&q==1)
p--;
if(i==n)
{
for(j=1;j<n;j++)
System.out.print(" *");
}
else
{
for(j=1;j<=p;j++)
System.out.print(" ");
System.out.print("*");
}
System.out.println();
}
}
}