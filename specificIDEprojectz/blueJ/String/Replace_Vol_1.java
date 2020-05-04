/* WAP to accept a word and convert it into lower case, if it is in 
 * upper case. Display the new word by replacing only the vowels with
 * the character following it.
 * 
 * Sample Input  ---> Computer
 * Sample Output ---> cpmpvtfr
 *                                                     [ICSE 2011]
 */
import java.io.*;
public class Replace_Vol_1
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
int len,i,n;
String str,str1="";
char ch;
System.out.print("Enter a Word :");
str=br.readLine();
str=str.toLowerCase();
len=str.length();
for(i=0;i<len;i++)
{
ch=str.charAt(i);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
{
n=(int)ch;
str1=str1+(char)(n+1);
}
else
str1=str1+ch;
}
if(str1.equals(str))
System.out.println("Sorry! No Vowel Present! Please Try Again!");
else
System.out.println("New word after replacing vowels :"+str1);
}
}