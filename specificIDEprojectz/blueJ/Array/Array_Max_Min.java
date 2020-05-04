/* WAP to accept ten integers in a SDA and display only the 
 * highest number and lowest number
 */ 
import java.io.*;
public class Array_Max_Min
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
int i,max,min;
int a[]=new int[10];
System.out.println("Enter ten integers one by one :");
for(i=0;i<a.length;i++)
{
a[i]=Integer.parseInt(br.readLine());
}
max=a[0];
min=a[0];
for(i=0;i<a.length;i++)
{
if(a[i]>max)
max=a[i];
if(a[i]<min)
min=a[i];
}
System.out.println("Highest Number :"+max);
System.out.println("Lowest Number :"+min);
}
}
