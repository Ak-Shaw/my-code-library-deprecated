// WAP to Find out the prime factors of a number
import java.io.*;
public class Prime_Fac
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter a Number :");
int n=Integer.parseInt(br.readLine());
int i,j;
for(i=2;i<=n;i++)
{
if(n%i==0)
{
for(j=2;j<i;j++)
{
if(i%j==0)
break;
}
if(j==i)
System.out.println(j+" is a prime factor of "+n);
}
}
}
}