/* WAP to perform matrix multiplication including two matrices of order 
 * n1 X m1 and n2 X m2
 */
import java.io.*;
public class Matrix_M2
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Matrix 1 :");
System.out.print("Row Order :");
int n1=Integer.parseInt(br.readLine());
System.out.print("Columb Order :");
int m1=Integer.parseInt(br.readLine());
System.out.println("Matrix 2 :");
System.out.print("Row Order :");
int n2=Integer.parseInt(br.readLine());
System.out.print("Columb Order :");
int m2=Integer.parseInt(br.readLine());
int i,j,k,f,s=0;
int a[][]=new int[n1][m1];
int b[][]=new int[n2][m2]; 
System.out.println("Elements of Matrix 1 :");
for(i=0;i<n1;i++)
{
for(j=0;j<m1;j++)
a[i][j]=Integer.parseInt(br.readLine());
}
System.out.println("Elements of Matrix 2 :");
for(i=0;i<n2;i++)
{
for(j=0;j<m2;j++)
b[i][j]=Integer.parseInt(br.readLine());
}
System.out.println("Elements of Matrix 1 : Order : "+n1+" X "+m1);
for(i=0;i<n1;i++)
{
for(j=0;j<m1;j++)
System.out.print(a[i][j]+"\t");
System.out.println();
}
System.out.println("Elements of Matrix 2 : Order : "+n2+" X "+m2);
for(i=0;i<n2;i++)
{
for(j=0;j<m2;j++)
System.out.print(b[i][j]+"\t");
System.out.println();
}
if(m1!=n2)
{
System.out.println("Matrix Multiplication not possible");
System.out.println("The columb order of Matrix 1 should be equal to the row order of Matrix 2");
}
else
{
System.out.println("Product Matrix Order : "+n1+" X "+m2);
System.out.println("Product of Matrix 1 & 2 :");
for(i=0;i<n1;i++)
{
for(k=0;k<m2;k++)
{
for(j=0;j<m1;j++)// for(j=0;j<n2;j++)
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
}