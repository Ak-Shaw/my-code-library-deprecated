import java.io.*;
public class MaxD
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Order :");
int n=Integer.parseInt(br.readLine()),i,j,k;
int a[][]=new int[n][n];
System.out.println("Elements :");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
a[i][j]=Integer.parseInt(br.readLine());
}
System.out.println("\fElements :");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
System.out.print(a[i][j]+"\t");
System.out.println();
}
k=a[0][0];
for(i=0;i<n;i++)
for(j=0;j<n;j++)
if(k<a[i][j])
k=a[i][j];
for(i=0,j=n-1;i<n;i++,j--)
{
a[i][i]=a[i][j]=k;
}
System.out.println("\nElements after changing diagonal elements :");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
System.out.print(a[i][j]+"\t");
System.out.println();
}
}
}