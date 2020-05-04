/* WAP to accept a number and check whether it is a magic
 * number or not.
 *       Magic number is a number which on further addition
 * of the digits of a number gives the sum equal to 1.
 * 
 * For Example,
 *              64 --> 6+4 = 10 --> 1+0 = 1
 *                      Therefore, 64 is a magic number
 * 
 */
import java.io.*;
public class Magic
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
p=p+d;
m/=10;
}
}
if(p==1)
System.out.println(n+" is a Magic Number");
else
System.out.println(n+" is not a Magic Number");
}
}
