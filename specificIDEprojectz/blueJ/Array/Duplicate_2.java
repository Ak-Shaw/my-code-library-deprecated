/* To store 10 Strings in an array and display the Strings after 
 * eliminating duplicate Strings of the array
 */
import java.io.*;
public class Duplicate_2
{
public static void main(String args[])throws IOException
{
int i,j;
String a[]=new String[10];
String b[]=new String[10];
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter ten numbers :");
for(i=0;i<10;i++)
a[i]=br.readLine();
for(i=0;i<10;i++)
{
for(j=i+1;j<10;j++)
{
if(a[i].compareTo(a[j])==0)
a[j]="";
}
}
j=0;
for(i=0;i<10;i++)
{
if(a[i]!="")
{
b[j]=a[i];
j++;
}
}
System.out.println("The new array after removing the duplicate elements :");
for(i=0;i<j;i++)
System.out.println(b[i]);
}
}