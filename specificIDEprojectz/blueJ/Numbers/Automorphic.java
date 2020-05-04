/* WAP to accept a number and check whether it's an 
 * automorphic number or not.
 *                      An automorphic number is a number
 * which is present in its square.
 * 
 * For Example,
 *              25 --> 25*25 = 625
 *              5  -->  5*5  = 25
 */
import java.io.*;
public class Automorphic
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter a Number :");
int n=Integer.parseInt(br.readLine());
int m=n*n;
int c=0;
int n1=n;
while(n1!=0)
{
n1/=10;
c++;
}// Counting the number of digits
double d=m%Math.pow(10,c);
if(d==n)
System.out.println(n+" is an Automorphic Number");
else
System.out.println(n+" is not an Automorphic Number");
}
}