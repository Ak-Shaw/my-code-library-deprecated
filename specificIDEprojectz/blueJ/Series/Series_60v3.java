// s = 1 + 3 + 6 + 10 + 15 + 21 +........+ N terms
import java.io.*;
public class Series_60v3
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,N,s=0,b;
System.out.print("Enter the Limit :");
N=Integer.parseInt(br.readLine());
System.out.println("\n\nSeries elements are as follows :\n\n");
for(i=1;i<=N;b=i*(i+1)/2,System.out.print(b+" "),s+=b,i++);
System.out.println("\n\nSum of series = "+s);
}
}