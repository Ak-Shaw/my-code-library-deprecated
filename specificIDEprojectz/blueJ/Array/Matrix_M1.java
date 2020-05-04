// WAP to perform matrix multiplication including two matrices of order n X n
import java.io.*;
public class Matrix_M1
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Order :");
int n=Integer.parseInt(br.readLine());
int i,j,k,f=1,s=0;
int a[][]=new int[n][n];
int b[][]=new int[n][n]; 
System.out.println("Elements of Matrix 1 :");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
a[i][j]=Integer.parseInt(br.readLine());
}
System.out.println("Elements of Matrix 2 :");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
b[i][j]=Integer.parseInt(br.readLine());
}
System.out.println("Elements of Matrix 1 :");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
System.out.print(a[i][j]+"\t");
System.out.println();
}
System.out.println("Elements of Matrix 2 :");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
System.out.print(b[i][j]+"\t");
System.out.println();
}
System.out.println("Product of Matrix 1 & 2 :");
for(i=0;i<n;i++)
{
for(k=0;k<n;k++)
{
for(j=0;j<n;j++)
{
f=a[i][j]*b[j][k];
s+=f;
}
System.out.print(s+"\t");
s=0;
}
System.out.println();
}
}
}