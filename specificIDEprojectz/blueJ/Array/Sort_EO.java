/* 
 * WAP to accept n integers and separate the even position 
 * and odd position elements. Sort the separated elements
 * and then put the array back together.
 */
import java.io.*;
public class Sort_EO
{
public static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Quantity :");
int n=Integer.parseInt(br.readLine());
int a[]=new int[n],i,j,m=n/2,q=0,w=0;
int e[]=new int[m];
int o[]=new int[n-m];
System.out.println("Elements :\n");
for(i=0;i<n;i++)
{
a[i]=Integer.parseInt(br.readLine());
if(i%2==0)
{
o[q]=a[i];
q++;
}
else
{
e[w]=a[i];
w++;
}
}
System.out.println("\fElements :\n");
for(i=0;i<n;i++)
System.out.print(a[i]+" ");
System.out.println("\n\nOdd Position Elements :");
for(i=0;i<n-m;i++)
System.out.print(o[i]+" ");
System.out.println("\n\nEven Position Elements :");
for(i=0;i<m;i++)
System.out.print(e[i]+" ");
for(i=0;i<n-m;i++)
for(j=0;j<n-m-1;j++)
if(o[j]>o[j+1])
{
q=o[j];
o[j]=o[j+1];
o[j+1]=q;
}
for(i=0;i<m;i++)
for(j=0;j<m-1;j++)
if(e[j]>e[j+1])
{
q=e[j];
e[j]=e[j+1];
e[j+1]=q;
}
System.out.println("\n\nSorted Odd Position Elements :");
for(i=0;i<n-m;i++)
System.out.print(o[i]+" ");
System.out.println("\n\nSorted Even Position Elements :");
for(i=0;i<m;i++)
System.out.print(e[i]+" ");
q=0;
w=0;
for(i=0;i<n;i++)
{
if(i%2==0)
{
a[i]=o[q];
q++;
}
else
{
a[i]=e[w];
w++;
}
}
System.out.println("\n\nElements back in position :\n");
for(i=0;i<n;i++)
System.out.print(a[i]+" ");
}
}