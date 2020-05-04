/*
 * WAP to accept a DDA of order nXn and display the sum of
 * row, columb and diagonal elements
 */
import java.io.*;
public class MatrixS
{
public static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Order :");
int n=Integer.parseInt(br.readLine());
int a[][]=new int[n][n],i,j,s=0;
System.out.println("Elements :");
for(i=0;i<n;i++)
for(j=0;j<n;j++)
a[i][j]=Integer.parseInt(br.readLine());
System.out.println("\fMatrix Elements :");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
System.out.print(a[i][j]+"\t");
System.out.println();
}
System.out.println("\nSum of rows :");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
s+=a[i][j];
System.out.println(s);
s=0;
}
System.out.println("\nSum of columbs :");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
s+=a[j][i];
System.out.println(s);
s=0;
}
for(i=0;i<n;i++)
s+=a[i][i];
System.out.println("\nSum of left diagonal :"+s);
s=0;
/*
for(int q=n-1,w=0;w<n;w++,q--)
s+=a[w][q];
*/
int x=0,y=n-1;
for(i=0;i<n;i++)
s+=a[x++][y--];
System.out.println("\nSum of right diagonal :"+s);
}
}