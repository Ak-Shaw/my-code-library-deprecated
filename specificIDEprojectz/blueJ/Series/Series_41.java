// s = x^2/2y^3 + x^4/2y^5 + x^6/2y^7 +........+ N terms
import java.io.*;
public class Series_41
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double i,x,y,N,j,f=3,t,h;
double b,s=0,c=2;
System.out.print("Enter the value of x :");
x=Integer.parseInt(br.readLine());
System.out.print("Enter the value of y :");
y=Integer.parseInt(br.readLine());
System.out.print("Enter the Limit :");
N=Integer.parseInt(br.readLine());
for(i=1;i<=N;i++)
{
t=Math.pow(x,c);
h=(2*(Math.pow(y,f)));
b=t/h;
System.out.print((int)b+" ");
s=s+b;
c=c+2;
f=f+2;
}
System.out.println("\nSum ="+(int)s);
}
} 