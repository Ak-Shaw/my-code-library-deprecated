/* WAP to accept n different names in a SDA. Arrange the names in 
 * ascending order using Bubble sort method and display the sorted array.
 */
import java.io.*;
public class Bubble_Name
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int i,j=0,n;
String t;
System.out.print("Enter the number of names :");
n=Integer.parseInt(br.readLine());
String m[]=new String[n];
System.out.println("Enter "+n+" Names :");
for(i=0;i<m.length;i++)
m[i]=br.readLine();
for(i=0;i<m.length-1;i++)
{
for(j=i+1;j<m.length;j++)
{
if(m[i].compareTo(m[j])>0)
{
t=m[i];
m[i]=m[j];
m[j]=t;
}
}
}
System.out.println("\fThe names arranged in ascending order are :");
for(i=0;i<m.length;i++)
System.out.println(m[i]);
}
}
