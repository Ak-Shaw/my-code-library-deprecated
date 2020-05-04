/*
Sum (S) = x + x + x + x + ………….. + x
(Value of x to be input by the user. )
                                                  [ICSE 2008]
*/
import java.io.*;
public class Series_62
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,n,x,s=0;
System.out.print("Enter the value of x :");
x=Integer.parseInt(br.readLine());
System.out.print("Enter the Limit :");
n=Integer.parseInt(br.readLine());
for(i=1;i<=n;i++)
{
if(i<n)
System.out.print(x+" + ");
else
System.out.print(x);
s=s+x;
}
System.out.println("\nSum ="+s);
}
}