/* To store 10 numbers in an array and display the numbers after 
 * eliminating duplicate numbers of the array
 */
import java.io.*;
public class Duplicate_1
{
public static void main(String args[])throws IOException
{
int i,j;
int a[]=new int[10];
int b[]=new int[10];
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter ten numbers :");
for(i=0;i<10;i++)
a[i]=Integer.parseInt(br.readLine());
for(i=0;i<10;i++)
{
for(j=i+1;j<10;j++)
{
if(a[i]==a[j])
a[j]=0;
}
}
j=0;
for(i=0;i<10;i++)
{
if(a[i]!=0)
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