/*
 * WAP to accept 10 numbers in two different SDA. 
 * Now, merge the two arrays to one and then eliminate 
 * the duplicate elements
 */
import java.io.*;
public class Merge_Dup
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,j=0,k;
int a[]=new int[10];
int b[]=new int[10];
int c[]=new int[20];
int d[]=new int[20];
System.out.println("Enter 1st array elements :");
for(i=0;i<10;i++)
a[i]=Integer.parseInt(br.readLine());
System.out.println("Enter 2nd array elements :");
for(i=0;i<10;i++)
b[i]=Integer.parseInt(br.readLine());
for(i=0;i<10;i++)
c[i]=a[i];
for(i=10;i<20;i++)
{
c[i]=b[j];
j++;
}
System.out.println("The elements of merged array are :");
for(i=0;i<20;i++)
System.out.print(c[i]+" ");
System.out.println();
for(i=0;i<20;i++)
{
for(j=i+1;j<20;j++)
{
if(c[i]==c[j])
c[j]=0;
}
}
j=0;
for(i=0;i<20;i++)
{
if(c[i]!=0)
{
d[j]=c[i];
j++;
}
}
System.out.println("The new array after eleminating duplicate elements :");
for(i=0;i<j;i++)
System.out.println(d[i]);
}
}
