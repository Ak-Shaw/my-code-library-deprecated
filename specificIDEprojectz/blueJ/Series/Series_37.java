// s = (a+1)/2 + (a+3)/4 + (a+5)/6 +........+ N terms
import java.io.*;
public class Series_37
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
b=(a+(i*2-1))/i*2;
System.out.print((int)b+" ");
s=s+b;
}
System.out.println("\nSum ="+(int)s);
}
} 