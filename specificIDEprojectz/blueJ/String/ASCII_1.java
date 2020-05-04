/* WAP to accept a Character and dislay its American Standard Code Information Interchange(ASCII) Value.
Sample Input  ---> A
Sample Output ---> ASCII Value of given Character A : 65
 */
import java.io.*;
public class ASCII_1
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n;
char ch;
System.out.print("Enter a Character :");
ch=(char)(br.read());
n=(int)ch;
System.out.println("ASCII Value of given Character '"+ch+"' : "+n);
}
}