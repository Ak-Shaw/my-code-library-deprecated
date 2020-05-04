// Insert a new element in an existing array
import java.io.*;
public class Insertion
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
int a[]=new int[100];
int i,j,k,item,n,num;
System.out.print("Enter the number of elements but not more than 90 :");
num=Integer.parseInt(br.readLine());
System.out.println("Enter "+num+" numbers in an array :");
for(i=0;i<num;i++)
{
System.out.print("Enter number "+(i+1)+" :");
a[i]=Integer.parseInt(br.readLine());
}
System.out.println("The entered "+num+" numbers in an array are as follows :");
for(i=0;i<num;i++)
{
System.out.println(a[i]);
}
System.out.print("Enter the index number where the new element will be inserted :");
k=Integer.parseInt(br.readLine());
System.out.print("Enter the number to be inserted at index number "+k+" :");
item=Integer.parseInt(br.readLine());
n=num;
for(j=n-1;j>=k;j--)
{
a[j+1]=a[j];
}
a[k]=item;
System.out.println("The new number "+item+" is inserted at "+(k+1)+" position");
System.out.println("The new array elements are as follows :");
for(i=0;i<=num;i++)
{
System.out.println(a[i]);
}
}
}