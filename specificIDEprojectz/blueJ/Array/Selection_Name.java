/* WAO To accept n number of different names in a SDA. Arrange the
 * names in ascending order using Selection Sort Method.
 */
import java.io.*;
public class Selection_Name
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.print("Enter the nth Term :");
int n = Integer.parseInt(br.readLine());
String m[]=new String[n];
System.out.println("Enter "+n+" String one by one :");
for(int i=0;i<m.length;i++)
{
m[i]=br.readLine();
}
int loc=0;
String temp="";
for(int i=0;i<m.length-1;i++)
{
loc=i;
temp=m[i];
for(int j=i+1;j<m.length;j++)
{
if(m[j].compareTo(temp)<0)
{
loc=j;
temp=m[j];
}
}
temp=m[loc];
m[loc]=m[i];
m[i]=temp;
}
System.out.println("The names arranged in ascending order are :");
for(int i=0;i<m.length;i++)
{
System.out.println(m[i]);
}
}
}