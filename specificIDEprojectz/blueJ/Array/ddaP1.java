import java.io.*;
public class ddaP1
{
public static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Order :");
int n=Integer.parseInt(br.readLine());
int a[][]=new int[n][n],x=n-1,y=0,s=1;
while(s<=n*n)
{
while(y>-1&&y<n)
{
if(n%2==0)
if(x%2==0)
a[x][y--]=s++;
else
a[x][y++]=s++;
else
if(x%2==0)
a[x][y++]=s++;
else
a[x][y--]=s++;
}
if(y==n)
y--;
else
y++;
if(x!=0)
{
a[--x][y]=s++;
if(y==0)
y++;
else
y--;
}
}
System.out.println("\nelements in special arrangement:\n\n");
for(x=0;x<n;x++)
{
for(y=0;y<n;y++)
System.out.print("\t"+a[x][y]);
System.out.println();
}
}
}