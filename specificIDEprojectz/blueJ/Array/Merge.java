/*
 * To store ten numbers in two different SDA.
 * Now merge the numbers of both the arrays in SDA.
 * Display the elements of merged array.
 * 
 * Sample Input   --->
 * 
 *         a[]={5,8,9,6,3,7,4,5,6,2}
 *         b[]={9,2,3,8,7,4,5,6,3,4}
 *         
 * Sample Output  --->
 * 
 *         c[]={5,8,9,6,3,7,4,5,6,2,9,2,3,8,7,4,5,6,3,4}
 */
import java.io.*;
public class Merge
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,j=0;
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
System.out.println(c[i]);
}
}
/**
 * ALTERNATIVE METHOD --->
 * 
import java.io.*;
public class Merge
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,j;
int a[]=new int[10];
int b[]=new int[10];
int c[]=new int[20];
System.out.println("Enter 1st array elements :");
for(i=0;i<10;i++)
{
a[i]=Integer.parseInt(br.readLine());
c[i]=a[i];
}
System.out.println("Enter 2nd array elements :");
for(j=0;j<10;j++)
{
b[j]=Integer.parseInt(br.readLine()); 
c[i]=b[j];
i++;
}
System.out.println("The elements of merged array are :");
for(i=0;i<20;i++)
System.out.println(c[i]);
}
}
*/