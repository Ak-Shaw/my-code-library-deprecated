// s = a^2 + 3a^2/4 + 5a^2/9 +........+ N terms
import java.io.*;
public class Series_40
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
b=((i*2-1)*(Math.pow(a,2)))/(Math.pow(i,2));
System.out.print((int)b+" ");
s=s+b;
}
System.out.println("\nSum ="+(int)s);
}
} 