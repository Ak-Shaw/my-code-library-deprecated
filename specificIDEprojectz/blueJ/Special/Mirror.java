import java.util.*;
class Mirror
{
static void main()
{
Scanner sc=new Scanner(System.in);
System.out.print("Order :");
int n=sc.nextInt();
if(n<2||n>20)
System.out.println("invalid");
else
{
int a[][]=new int[n][n];
int b[][]=new int[n][n];
int i,j,k;
System.out.println("elements :");
for(i=0;i<n;i++)
for(j=0,k=n-1;j<n;j++,k--)
{
a[i][j]=sc.nextInt();
b[i][k]=a[i][j];
}
System.out.println("elements :");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
System.out.print("\t"+a[i][j]);
System.out.println();
}
System.out.println("mirror image :");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
System.out.print("\t"+b[i][j]);
System.out.println();
}
}
}
}