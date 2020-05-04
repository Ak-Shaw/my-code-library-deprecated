 /* WAP to accept a word and display the new word after removing all 
 * the repeated characters.
 * 
 * Sample Input  ---> applications
 * Sample Output ---> aplictons
 * 
 *              [String Method]
 */
import java.io.*;
public class Repeat_char
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int len,i,j;
String str,str1="";
char ch,ch1;
System.out.print("Enter a Word :");
str=br.readLine();
len=str.length();
for(i=0;i<len;i++)
{
ch=str.charAt(i);
str1=str1+ch;
for(j=i+1;j<len;j++)
{
ch1=str.charAt(j);
if(ch==ch1)
str=str.replace(ch1,' ');
}
}
str="";
for(i=0;i<len;i++)
{
ch=str1.charAt(i);
if(ch!=' ')
str=str+ch;
}
System.out.println("New word after removing repeated characters :"+str);
}
}