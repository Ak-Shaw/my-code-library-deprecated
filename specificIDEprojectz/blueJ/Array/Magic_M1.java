// WAP to generate a magic matrix  of order 3 X 3
import java.io.*;
public class Magic_M1
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int n=3,i,j,k1=n*n,k2=n-1;
int a[][]=new int[n][n];
for(i=0;i<n;i++)
for(j=0;j<n;j++)
{
if(i%2==0&&j%2==0)
{
a[i][j]=k2;
k2+=2;
}
if(i==1||j==1)
{
a[i][j]=k1;
k1-=2;
}
}
System.out.println("Magic Matrix of Order : "+n+" X "+n);
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
System.out.print(a[i][j]+"\t");
System.out.println();
}
}
}