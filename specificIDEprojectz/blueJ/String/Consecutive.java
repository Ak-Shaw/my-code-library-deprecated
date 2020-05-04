/* WAP to accept string and display only those characters which are consecutive
 *
 *Sample Input  ---> Abscissa
 *Sample Output ---> A and b are consecutive characters
 *
 *Sample Input  ---> Tablet
 *Sample Output ---> a and b are consecutive characters
 *
 *Sample Input  ---> haBbiT
 *Sample Output ---> a and B are consecutive characters
 *
 *Sample Input  ---> Ayush
 *Sample Output ---> No Consecutive Characters Present
 */
import java.io.*;
public class Consecutive
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String str;
int i,len,j;j=0;
char ch,ch1;
System.out.print("Enter a String:");
str=br.readLine();
len=str.length();
str=str+" ";
for(i=0;i<len;i++)
{
ch = str.charAt(i);
ch1 = str.charAt(i+1);
int n=(int)ch;
int m=(int)ch1;
if(n+1==m||n+33==m||n==m+31)
{
System.out.println("'"+ch+"' and '"+ch1+ "' are Consecutive Characters");
j++;
}
}
if(j==0)
System.out.println("No Consecutive Characters Present");
}
}