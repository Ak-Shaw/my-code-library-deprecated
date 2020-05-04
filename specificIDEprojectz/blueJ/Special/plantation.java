// Plantation Fire
import java.util.*;
class plantation
{
static void main()
{
Scanner sc=new Scanner(System.in);
System.out.println("order :");
int n=sc.nextInt();
int a[][]=new int[n][n];
int i,j,k,e=1,x,y;
System.out.println("elements :");
for(i=0;i<n;i++)
for(j=0;j<n;j++)
a[i][j]=sc.nextInt();
System.out.println("\felements :\n");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
System.out.print("\t"+a[i][j]);
System.out.println();
}
System.out.print("\nfire coordinates :");
int q=sc.nextInt();
int w=sc.nextInt();
a[q][w]=2;
System.out.println("\fBurning Tree Location :\n");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
System.out.print("\t"+a[i][j]);
System.out.println();
}
for(k=0;k<n;k++)
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
x=i;
y=j;
while(y<n-1)
{
if(a[x][y]==1&&a[x][y+1]==2||a[x][y]==2&&a[x][y+1]==1)
a[x][y]=a[x][y+1]=2;
y++;
}
y=j;
while(x<n-1)
{
if(a[x][y]==1&&a[x+1][y]==2||a[x][y]==2&&a[x+1][y]==1)
a[x][y]=a[x+1][y]=2;
x++;
}
x=i;
while(x<n-1&&y<n-1)
{
if(a[x][y]==1&&a[x+1][y+1]==2||a[x][y]==2&&a[x+1][y+1]==1)
a[x][y]=a[x+1][y+1]=2;
x++;
y++;
}
x=i;
y=j;
while(x<n-1&&y<n-1&&y!=0)
{
if(a[x][y]==1&&a[x+1][y-1]==2||a[x][y]==2&&a[x+1][y-1]==1)
a[x][y]=a[x+1][y-1]=2;
x++;
y++;
}
}
}
System.out.println("\naftermath :\n");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
System.out.print("\t"+a[i][j]);
System.out.println();
}
}
}