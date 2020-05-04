/* WAP in java to accept ten numbers in a SDA. Arrange the numbers in 
 * ascending order using Bubble Sort method and finally display the 
 * sorted array
 */
//import java.util.*;
import java.io.*;
public class Bubble_Sort_1
{
//public static void main(String args[])
public static void main(String args[])throws IOException
{
//Scanner sc=new Scanner(System.in);
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
int i,j,t;
int m[]=new int[10];
System.out.println("Enter ten numbers one by one :");
for(i=0;i<m.length;i++)
{
//m[i]=sc.nextInt();
m[i]=Integer.parseInt(br.readLine());
}
for(i=0;i<m.length;i++)
{
for(j=0;j<m.length-1;j++)
{
if(m[j]>m[j+1])
{
t=m[j];
m[j]=m[j+1];
m[j+1]=t;
}
}
}
System.out.println("Numbers arranged in Ascending order are :");
for(i=0;i<m.length;i++)
System.out.print(m[i]+" ");
}
}