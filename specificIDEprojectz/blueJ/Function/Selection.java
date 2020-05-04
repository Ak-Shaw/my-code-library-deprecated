/* WAP in java to accept 10 numbers in a SDA. Arrange the numbers in
 * ascending order using selection sort method and finally display the 
 * sorted array
 *                 [Using Function]
 */
import java.io.*;
public class Selection
{
void Sort(int a[])
{
int i,j,t,min;
for(i=0;i<9;i++)
{
min=i;
for(j=i+1;j<10;j++)
{
if(a[j]<a[min])
min=j;
}
t=a[i];
a[i]=a[min];
a[min]=t;
}
System.out.println("The numbers in ascending order are :");
for(i=0;i<10;i++)
System.out.println(a[i]);
}
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int m[]=new int[10];
System.out.println("Enter 10 numbers :");
for(int i=0;i<10;i++)
m[i]=Integer.parseInt(br.readLine());
Selection ob=new Selection();
ob.Sort(m);
}
}
