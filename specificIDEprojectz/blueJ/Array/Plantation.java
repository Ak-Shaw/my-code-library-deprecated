import java.io.*;
public class Plantation
{
public static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Order :");
int n=Integer.parseInt(br.readLine());
int a[][]=new int[n][n],i,j,k,q,w;
System.out.println("Enter elements for matrix :");
for(i=0;i<n;i++)
for(j=0;j<n;j++)
a[i][j]=Integer.parseInt(br.readLine());
System.out.println("Matrix Elements :");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
System.out.print("\t"+a[i][j]);
System.out.println();
}
System.out.println("Enter coordinates :");
q=Integer.parseInt(br.readLine());
w=Integer.parseInt(br.readLine());
a[q][w]=2;
for(k=0;k<n;k++)
for(i=0;i<n-1;i++)
{
for(j=0;j<n-1;j++)
{
if((a[i][j]==1&&a[i+1][j+1]==2)||(a[i][j]==2&&a[i+1][j+1]==1))
a[i][j]=a[i+1][j+1]=2;
if((a[i][j]==1&&a[i][j+1]==2)||(a[i][j]==2&&a[i][j+1]==1))
a[i][j]=a[i][j+1]=2;
if((a[i][j]==1&&a[i+1][j]==2)||(a[i][j]==2&&a[i+1][j]==1))
a[i][j]=a[i+1][j]=2;
}
for(j=n-1;j>0;j--)
if((a[i][j]==1&&a[i+1][j-1]==2)||(a[i][j]==2&&a[i+1][j-1]==1))
a[i][j]=a[i+1][j-1]=2;
}
if(a[0][n-1]==1&&a[1][n-1]==2)
a[0][n-1]=2;
if(a[n-1][0]==1&&a[n-1][1]==2)
a[n-1][0]=2;
System.out.println("Matrix Elements :");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
System.out.print("\t"+a[i][j]);
System.out.println();
}
}
}