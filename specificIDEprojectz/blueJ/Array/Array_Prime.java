/* WAP to accept ten integers in a Single Dimentional Array(SDA) and 
   display only the prime numbers.
 */
import java.io.*;
public class Array_Prime
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
int i,j;
int a[]=new int[10];
System.out.println("Enter ten numbers one by one :");
for(i=0;i<10;i++)
a[i]=Integer.parseInt(br.readLine());
System.out.println("The Prime numbers are :");
for(i=0;i<a.length;i++)
{
for(j=2;j<a[i];j++)
{
if(a[i]%j==0)
{
break;
}
}
if(a[i]==j)
{
System.out.print(a[i]+" ");
}
}
}
}
