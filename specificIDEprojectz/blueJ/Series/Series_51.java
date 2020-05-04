// s = 1 + 2/3^2 + 4/5^2 8/7^2 +........+ N terms
import java.io.*;
public class Series_51
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,N;
double b,s=0;
System.out.print("Enter the Limit :");
N=Integer.parseInt(br.readLine());
for(i=1;i<=N;i++)
{
b=Math.pow(2,(i-1))/Math.pow((2*i-1),2);
System.out.print((int)b+" ");
s=s+b;
}
System.out.println("\nSum ="+(int)s);
}
} 