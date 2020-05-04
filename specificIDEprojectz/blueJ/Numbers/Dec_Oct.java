//Accept a Decimal number and display its equivalent octal number
import java.io.*;
public class Dec_Oct
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,r;
String s;
s="";
System.out.print("Decimal Number :");
n=Integer.parseInt(br.readLine());
while(n>0)
{
r=n%8;
n/=8;
s=r+s;
}
System.out.println("Octal Equivalent :"+s);
}
}