/* WAP to accept a sentence and change the upper case character 
 * to lower case and vice versa
 */
import java.io.*;
public class Toggle
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String st,str="";
char ch,chr=' ';
int i,len;
System.out.print("Enter a String :");
st=br.readLine();
len=st.length();
for(i=0;i<len;i++)
{
ch=st.charAt(i);
if(ch>='A'&&ch<='Z')
{
chr=Character.toLowerCase(ch);
str=str+chr;
}
else if(ch>='a'&&ch<='z')
{
chr=Character.toUpperCase(ch);
str=str+chr;
}
else
str=str+ch;
}
System.out.println("The new string is :"+str);
}
}