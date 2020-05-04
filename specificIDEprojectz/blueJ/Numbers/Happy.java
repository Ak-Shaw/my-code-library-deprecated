/* WAP to accept a number and check whether it is a happy
 * number or not.
 *       Happy number is a number which on further addition
 * of the square of the digits of a number gives the sum 
 * equal to 1.
 * 
 * For Example,
 *              13 --> 1+9 = 10 --> 1+0 = 1
 *                      Therefore, 13 is a happy number
 * 
 */
import java.io.*;
public class Happy
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
System.out.print("Enter a number :");
int n=Integer.parseInt(br.readLine());
int m,p=n,d;
while(p>9)
{
m=p;
p=0;
while(m!=0)
{
d=m%10;
p=p+(d*d);
m/=10;
}
}
if(p==1)
System.out.println(n+" is a Happy Number");
else
System.out.println(n+" is not a Happy Number");
}
}
