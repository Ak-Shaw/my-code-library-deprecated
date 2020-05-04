// s = x/2*sqrt(y) + 3*x/4*sqrt(y) + 5*x/6*sqrt(y) +........+ N terms
import java.io.*;
public class Series_45
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double i,x,y,N;
double b,s=0;
System.out.print("Enter the value of x :");
x=Integer.parseInt(br.readLine());
System.out.print("Enter the value of y :");
y=Integer.parseInt(br.readLine());
System.out.print("Enter the Limit :");
N=Integer.parseInt(br.readLine());
for(i=1;i<=N;i++)
{
b=((i*2-1)*x)/((i*2)*Math.sqrt(y));
System.out.print((int)b+" ");
s=s+b;
}
System.out.println("\nSum ="+(int)s);
}
} 