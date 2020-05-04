/* WAP in java to accept ten numbers in a S.D.A. Arrange the numbers in
 * ascending order using Bubble Sort method and finally display 
 * the sorted array.
 *                      [Using Function]
 */
import java.io.*;
public class Bubble
{
void Sort(int m[])
{
int i,j,t;
for(i=0;i<9;i++)
{
for(j=0;j<9;j++)
{
if(m[j]>m[j+1])
{
t=m[j];
m[j]=m[j+1];
m[j+1]=t;
}
}
}
System.out.println("Numbers arranged in ascending order are :");
for(i=0;i<10;i++)
System.out.println(m[i]);
}
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a[]=new int[10];
Bubble ob=new Bubble();
System.out.println("Enter ten numbers :");
for(int i=0;i<10;i++)
{
a[i]=Integer.parseInt(br.readLine());
}
ob.Sort(a);
}
}