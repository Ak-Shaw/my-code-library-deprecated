/* Accept a name containing first and last name and then insert the word
 * 'Kumar' as middle name.
 * 
 * Sample Input   ---> Anil Shaw
 * Sample Output  ---> Anil Kumar Shaw
 */
import java.io.*;
public class Full_Name_1
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String name;
char chr;
int i,len;
System.out.println("Enter a name having first and last name :");
name=br.readLine();
StringBuffer m=new StringBuffer(name);
len=m.length();
for(i=0;i<len;i++)
{
chr=m.charAt(i);
if(chr==' ')
break;
}
System.out.println("The full name is :"+m.insert(i," Kumar"));
}
}