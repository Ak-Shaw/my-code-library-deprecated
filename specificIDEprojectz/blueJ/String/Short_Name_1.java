/*WAP to accept a name having first name, middle name and last name and display the short name
Sample Input  ---> Ayush Kumar Shaw
Sample Output ---> A. K. Shaw
*/
import java.io.*;
public class Short_Name_1
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str,str1;str1="";
int i,d,len;d=0;
char ch;
System.out.print("Enter a name having first name, middle name and last name :");
str=br.readLine();
str1=str1+str.charAt(0);
len=str.length();
for(i=0;i<len;i++)
{
ch=str.charAt(i);
if(ch==' ')
{
d=d+1;
if(d==1)
str1=str1+". "+str.charAt(i+1);
if(d==2)
str1=str1+"."+str.substring(i);
}
}
System.out.print("The short form of name is :");
System.out.print(str1);
}
}