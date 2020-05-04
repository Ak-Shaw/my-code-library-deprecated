// s = 1*4 + 2*9 + 3*16 + 4*25 +........+ N terms
import java.io.*;
public class Series_48
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
b=i*Math.pow((i+1),2);
System.out.print((int)b+" ");
s=s+b;
}
System.out.println("\nSum ="+(int)s);
}
} 