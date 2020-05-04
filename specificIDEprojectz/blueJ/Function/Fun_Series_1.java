/* Design a class to overload a function series():
 * 
 * (I)  double series(double n) with one double argument and returns the
 * sum of the series,
 * 
 * sum = 1/1 + 1/2 + 1/3 +...+1/n
 * 
 * (II) double series(double a,double n) with two decimal arguments and 
 * returns the sum of the series,
 * 
 * sum = 1/a*a + 4/a*a*a*a*a + 7/a*a*a*a*a*a*a*a + 10/a*a*a*a*a*a*a*a*a*a*a +......to n terms
 *                                                        (ICSE 2013)
 */
import java.io.*;
public class Fun_Series_1
{
int i,j,b,sum = 0;
public void series(double n)
{
System.out.print("Sum of First Series =");
for(i=1;i<=n;i++)
{
b=1/i;
sum=sum+b;
}
System.out.println(sum);
}
public void series(double a,double n)
{
System.out.print("Sum of Second Series =");
for(i=1;i<=n;i++)
{
b=(i*3-2)/(i*3-1);
sum=sum+b;
}
System.out.println(sum);
}
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter limit for first series :");
double x=Double.parseDouble(br.readLine());
System.out.println("Enter limit for second series :");
double y=Double.parseDouble(br.readLine());
System.out.println("Enter digit for second series :");
double z=Double.parseDouble(br.readLine());
Fun_Series_1 ob = new Fun_Series_1();
ob.series(x);
ob.series(y,z);
}
}


