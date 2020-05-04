// s = (3*4*5)/a^2 + (4*5*6)/a^2 + (5*6*7)/a^2 +........+ N terms
import java.io.*;
public class Series_39
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,a,N;
double b,s=0;
System.out.print("Enter the value of a :");
a=Integer.parseInt(br.readLine());
System.out.print("Enter the Limit :");
N=Integer.parseInt(br.readLine());
for(i=1;i<=N;i++)
{
b=((i+2)*(i+3)*(i+4))/Math.pow(a,2);
System.out.print((int)b+" ");
s=s+b;
}
System.out.println("\nSum ="+(int)s);
}
} 