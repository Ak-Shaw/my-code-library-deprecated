/*
 * To store ten numbers in two different SDA.
 * Now merge the numbers of both the arrays in SDA.
 * Display the elements of merged array.
 * Display the elements of te merged array by sorting them in ascending 
 * order by using Bubble Sort technique
 */
import java.io.*;
public class Merge_Bub
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,j=0,k;
int a[]=new int[10];
int b[]=new int[10];
int c[]=new int[20];
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
for(i=0;i<19;i++)
{
for(j=0;j<19;j++)
{
if(c[j]>c[j+1])
{
k=c[j];
c[j]=c[j+1];
c[j+1]=k;
}
}
}
System.out.println("The elements in ascending order :");
for(i=0;i<10;i++)
System.out.print(c[i]+" ");
System.out.println();
}
}
