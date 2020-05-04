/* WAP to accept a number and display its Factorial.
 *                 The Factorial of a Number is the product of a given 
 * number with all the numbers below it till 1.
 * For Example ---> Factorial of 1 = 1
 *                  Factorial of 6 = 1*2*3*4*5*6 = 720
 * 
 * Sample Input  ---> 5
 * Sample Output ---> 120
 */
import java.io.*;
public class Factorial
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int n,i,f=1;
System.out.print("Enter a Number :");
n=Integer.parseInt(br.readLine());
for(i=1;i<=n;i++)
f=f*i;
System.out.println("Factorial of given Number "+n+" :"+f);
}
}