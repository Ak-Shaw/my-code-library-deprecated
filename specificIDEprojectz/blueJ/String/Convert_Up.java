/* Accept a sentence in lower case and convert all the first character
 * of each word in upper case
 */
import java.io.*;
public class Convert_Up
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String st,str="";
char ch,chr;
int i,len;
System.out.print("Enter a sentence in lower case :");
st=br.readLine();
st=' '+st;
len=st.length();
for(i=0;i<len;i++)
{
ch=st.charAt(i);
if(ch==' ')
{
chr=st.charAt(i+1);
str=str+' '+Character.toUpperCase(chr);
i++;
}
else
str=str+ch;
}
System.out.println("The new string is :"+str);
}
}