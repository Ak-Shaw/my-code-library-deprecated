/* Accept a name containing first and last name and then accept a name as
 * middle name and then insert the middle name in between first and last
 * name.
 * 
 * Sample Input   ---> Anil Shaw
 *                     Dayaram
 * Sample Output  ---> Anil Dayaram Shaw
 */
import java.io.*;
public class Full_Name_2
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String name,middle;
char chr;
int i,len,c=0;
System.out.print("Enter a name containing first and last name :");
name=br.readLine();
System.out.print("Enter a name as middle name :");
middle=br.readLine();
middle=" "+middle;
StringBuffer m=new StringBuffer(name);
len=m.length();
for(i=0;i<len;i++)
{
chr=m.charAt(i);
if(chr==' ')
break;
else
c++;
}
System.out.println("The full name is :"+m.insert(c,middle));
}
}