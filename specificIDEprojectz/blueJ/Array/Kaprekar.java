/**
 * 9^2 = 81 -> 8|1 -> 8+1 = 9 is a Kaprekar Number
 * 45^2 = 2025 -> 20|25 -> 20+25 = 45 is a Kaprekar Number
 * 297^2 = 88209 -> 88|209 -> 88+209 = 297 is a Kaprekar Number
 * 
 *         [Normal Method]
 */
import java.io.*;
public class Kaprekar
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,i;
System.out.print("Quantity :");
n=Integer.parseInt(br.readLine());
double a[]=new double[n];
System.out.println("Enter "+n+" numbers :");
for(i=0;i<n;i++)
a[i]=Double.parseDouble(br.readLine());
System.out.println("The Kaprekar Numbers are :");
for(i=0;i<a.length;i++)
{
int ar=(int)a[i];
int as =ar*ar;
int c=0;
int aw=as;
while(as>0)
{
as=as/10;
c++;
}
int z1=c/2;
int z2=c-z1;
int g=aw%((int)Math.pow(10,z2));
int h=(aw-g)/((int)Math.pow(10,z2));
if((g+h)==ar)
System.out.println(ar+" is a Kaprekar Number");
}
}
}