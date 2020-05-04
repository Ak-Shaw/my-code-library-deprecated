/* WAP in java to accept ten numbers in a SDA. Arrange in ascending 
 * order using selection sort method and finally display the sorted 
 * array.
 *         [Normal Method]                 
 */
import java.io.*;
public class Selection_Sort_1
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
int i,j,t;
//int max;
int min;
int m[]=new int[10];
System.out.println("Enter ten numbers :");
for(i=0;i<m.length;i++)
{
m[i]=Integer.parseInt(br.readLine());
}
for(i=0;i<m.length;i++)
{
//max=i;
min=i;
for(j=i+1;j<m.length;j++)
{
//if(m[j]>m[max])
if(m[j]<m[min])
//max=j;
min=j;
}
/*
 * t=m[i];
 * m[i]=m[max];
 * m[max]=t;
 */
t=m[i];
m[i]=m[min];
m[min]=t;
}
//System.out.println("The numbers arranged in descending order :");
System.out.println("The numbers arranged in ascending order :");
for(i=0;i<m.length;i++)
System.out.println(m[i]);
}
} 