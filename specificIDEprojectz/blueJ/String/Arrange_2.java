/*WAP to accept a string and arrange the characters in descending order.
 Sample Input  ---> Computer
 Sample Output ---> String in Descending order: utrpomeC
 */
import java.io.*;
public class Arrange_2
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String str;
int i,j,len;
char ch;
System.out.print("Enter a String:");
str=br.readLine();
len=str.length();
System.out.print("String in Descending order:");
for(i=90;i>=65;i--)
{
for(j=0;j<=len-1;j++)
{
ch=str.charAt(j);
if(ch==(char)i||ch==(char)(i+32))
System.out.print(ch);
}
}
}
}