import java.io.*;
public class Mirror
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Order :");
int n=Integer.parseInt(br.readLine()),k,i,j;
int a[][]=new int[n][n];
int b[][]=new int[n][n]; 
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
/*
for(i=0;i<n;i++)
{
for(j=0,k=n-1;j<n;j++,k--)
b[i][j]=a[i][k];
}
*/
int t;
for(i=0;i<n;i++)
{
t=a[i][0];
a[i][0]=a[i][n-1];
a[i][n-1]=t;
}
System.out.println("\nMirror Image :");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
System.out.print(a[i][j]+"\t");
System.out.println();
}
}
}