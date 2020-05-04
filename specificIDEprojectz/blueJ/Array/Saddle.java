import java.io.*;
public class Saddle
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Order :");
int n=Integer.parseInt(br.readLine());
int a[][]=new int[n][n];
int i,j,max,min,c1=0,r1,r2=0;
System.out.println("Elements :");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
a[i][j]=Integer.parseInt(br.readLine());
}
System.out.println("Elements :");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
System.out.print(a[i][j]+"\t");
System.out.println();
}
for(i=0;i<n;i++)
{
min=a[i][0];
for(j=0;j<n;j++)
{
if(min>a[i][j])
{
min=a[i][j];
c1=j;
}
}
max=a[0][c1];
r1=i;
while(r1<n)
{
if(max<a[r1][c1])
{
max=a[r1][c1];
r2=r1;
}
r1++;
}
if(max==min)
{
System.out.println("Saddle Point element :"+max);
System.out.println("Saddle Point Coordinates :("+r2+","+c1+")");
}
}
}
}