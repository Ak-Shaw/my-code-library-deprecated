/* WAP to accept a Name and then display the short name
 * 
 * Sample Input  ---> Ayush Kumar Shaw
 * Sample Output ---> A. K. Shaw
 * 
 * Sample Input  ---> Arnak Mondal
 * Sample Output ---> A. Mondal
 * 
 * Sample Input  ---> Tamonut Das
 * Sample Output ---> T. Das
 */
import java.io.*;
public class Short_Name
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str,str1="";
int i,len,d=0,f=0;
char ch;
System.out.print("Enter a Name:");
str=br.readLine();
len=str.length();
str1=str1+str.charAt(0);
for(i=0;i<len;i++)
{
ch=str.charAt(i);
if(ch==' ')
f=f+1;
}
if(f==1)
{
for(i=0;i<len;i++)
{
ch=str.charAt(i);
if(ch==' ')
str1=str1+"."+str.substring(i);
}
}
else
{
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
}
System.out.println("The Short Name is : "+str1);
}
}