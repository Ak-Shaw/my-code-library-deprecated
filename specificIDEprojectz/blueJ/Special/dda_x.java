import java.io.*;
public class dda_x
{
public static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("order :");
int n=Integer.parseInt(br.readLine());
int a[][]=new int[n][n],i,j;
System.out.println("elements :");
for(i=0;i<n;i++)
for(j=0;j<n;j++)
a[i][j]=Integer.parseInt(br.readLine());
System.out.println("\felements :\n");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
System.out.print("\t"+a[i][j]);
System.out.println();
}
System.out.println("\n\nX___DISPLAY___\n\n");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print("\t");
if(i==j||i+j==n-1)
System.out.print(a[i][j]);
else
System.out.print(" ");
}
System.out.println();
}
}
}