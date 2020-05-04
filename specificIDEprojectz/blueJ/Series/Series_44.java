// s = 2*x/3*y^2 + 3*x^3/5*y^4 + 4*x^5/7*y^6 +........+ N terms
import java.io.*;
public class Series_44
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
b=((i+1)*(Math.pow(x,(i*2-1))))/((2*i+1)*Math.pow(y,(i*2)));
System.out.print((int)b+" ");
s=s+b;
}
System.out.println("\nSum ="+(int)s);
}
} 