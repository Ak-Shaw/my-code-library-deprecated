//Accept an octal no. and display its equivalent decimal no.
import java.io.*;
public class Oct_Dec
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int m,n,p,d;
m=0;
double sum=0;
System.out.print("Octal Number :");
n=Integer.parseInt(br.readLine());
while(n!=0)
{
d=n%10;
sum=sum+d*Math.pow(8,m);
n/=10;
m+=1;
}
System.out.println("Decimal Equivalent :"+(int)sum);
}
}