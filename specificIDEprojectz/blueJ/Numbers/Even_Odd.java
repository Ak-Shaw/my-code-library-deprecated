/* WAP to check whether a given number is an even number or an
 * odd number.
 *          A number is even when it is divisible by 2 and odd when not.
 */
import java.io.*;
public class Even_Odd
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter a number :");
int n=Integer.parseInt(br.readLine());
if(n%2==0)
System.out.println(n+" is an even number");
else
System.out.println(n+" is an odd number");
}
}