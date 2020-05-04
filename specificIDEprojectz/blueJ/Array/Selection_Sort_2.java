/* WAP in java to accept ten numbers in a SDA. Arrange in descending 
 * order using selection sort method and finally display the sorted 
 * array.
 *         [Normal Method]                 
 */
import java.io.*;
public class Selection_Sort_2
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
int i,j,t;
//int min;
int max;
int m[]=new int[10];
System.out.println("Enter ten numbers :");
for(i=0;i<m.length;i++)
{
m[i]=Integer.parseInt(br.readLine());
}
for(i=0;i<m.length;i++)
{
//min=i;
max=i;
for(j=i+1;j<m.length;j++)
{
//if(m[j]<m[min])
if(m[j]>m[max])
//min=j;
max=j;
}
/*
 * t=m[i];
 * m[i]=m[min];
 * m[min]=t;
 */
t=m[i];
m[i]=m[max];
m[max]=t;
}
//System.out.println("The numbers arranged in ascending order :");
System.out.println("The numbers arranged in descending order :");
for(i=0;i<m.length;i++)
System.out.println(m[i]);
}
} 