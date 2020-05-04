// WAP to Find out prime factors of a number
import java.io.*;
class Prime_Fac_3
{
public static void main() throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n;
System.out.print("Enter a Number : ");
n=Integer.parseInt(br.readLine());
System.out.println("The Prime Factors of "+n+" are : ");
int i=2;
int j=0;
while(n>1)
{
if(n%i == 0)
{
if(j!=i)
System.out.println(i);
n=n/i;
j=i;
}
else
i++;
}
}
}