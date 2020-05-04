/* Accept any name having first name middle name and last name and
 * finaly display the name after removing the middle name.
 * 
 * Sample Input   ---> Ayush Kumar Shaw
 * Sample Output  ---> Ayush Shaw
 */
import java.io.*;
public class Remove_2
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int len,i,d=0,m=0,n=0;
String a,str="";
char ch=' ';
System.out.print("Enter a name having first, middle and last name :");
a=br.readLine();
len=a.length();
System.out.print("The short name is :");
for(i=0;i<len;i++)
{
ch=a.charAt(i);
if(ch==' ')
{
d=d+1;
if(d==1)
m=i;
if(d==2)
n=i;
}
}
StringBuffer p=new StringBuffer(a);
System.out.println(p.delete(m,n));
}
}
