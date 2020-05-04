/*WAP to accept a word or number and check whether it is palindrome 
 or not.
      A word or number is said to be palindrome if it is the same even
      after reversing it.
Sample Input  ---> 101
Sample Output ---> Palindrome

Sample Input  ---> Madam
Sample Output ---> Palindrome
*/
import java.io.*;
public class Palindrome
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String str, str1="";
int i,len;
char ch;
System.out.print("Enter a Word or Number:");
str=br.readLine();
len=str.length();
for(i=len-1;i>=0;i--)
{
ch=str.charAt(i);
str1=str1+ch;
}
if(str1.equalsIgnoreCase(str))
System.out.println("Palindrome");
else
System.out.println("Not a Palindrome");
}
}
