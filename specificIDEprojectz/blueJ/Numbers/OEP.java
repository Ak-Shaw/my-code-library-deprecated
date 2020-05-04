import java.io.*;
public class OEP
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter a number :");
int n=Integer.parseInt(br.readLine()),i;
if(n%2==0)
System.out.println(n+" is an even number");
else
System.out.println(n+" is an odd number");
for(i=2;i<n;i++)
{
if(n%i==0)
break;
}
if(i==n)
System.out.println(n+" is a prime number");
else
System.out.println(n+" is not a prime number");
}
}