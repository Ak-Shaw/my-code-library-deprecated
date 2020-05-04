/* WAP to input 10 integer elements in an array and sort them in 
 * descending order using the bubble sort technique.
 *                                                          (ICSE 2013)
 */
//import java.util.*;
import java.io.*;
public class Bubble_Sort_2
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
for(i=0;i<m.length-1;i++)
{
for(j=0;j<m.length-1;j++)
{
if(m[j]<m[j+1])
{
t=m[j];
m[j]=m[j+1];
m[j+1]=t;
}
}
}
System.out.println("Numbers arranged in Descending order are :");
for(i=0;i<m.length;i++)
System.out.print(m[i]+" ");
System.out.println();
}
}
