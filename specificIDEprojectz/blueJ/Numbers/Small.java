/* WAP to find the smallest digit of an integer that is input.
 * 
 * Sample Input  : 6524
 * Sample Output : Smallest digit is 2
 *                                                       [ICSE 2013]
 */
import java .io.*;
public class Small
{
public static void main(String args[]) throws IOException
{
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
int n,m,p,q;
System.out.print("Enter a Number :");
n=Integer.parseInt(br.readLine());
q=n;
p=n%10;
while(n>0)
{
m=n%10;
if(m<p)
p=m;
n=n/10;
}
System.out.println("The Smallest Digit Present in "+q+" :"+p);
}
}