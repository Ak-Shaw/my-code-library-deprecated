// s = a + a/2 + a/3 + a/4 +........+ a/(N+1)
import java.io.*;
public class Series_36
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
for(i=0;i<=N;i++)
{
b=a/i;
System.out.print((int)b+" ");
s=s+b;
}
System.out.println("\nSum ="+(int)s);
}
} 