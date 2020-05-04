// Deleting an element from an existing array
import java.io.*;
public class Deletion
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int m[]=new int[100];
int i,k,j,num;
System.out.print("Enter the number of elements but not more than 90 :");
num=Integer.parseInt(br.readLine());
System.out.println("Enter "+num+" numbers in an array :");
for(i=0;i<num;i++)
{
System.out.print("Enter number "+(i+1)+" :");
m[i]=Integer.parseInt(br.readLine());
}
System.out.println("The entered "+num+" numbers in an array are as follows :");
for(i=0;i<num;i++)
{
System.out.println(m[i]);
}
System.out.print("Enter the index number where the number will be deleted :");
k=Integer.parseInt(br.readLine());
System.out.println("The element "+m[k]+" has been deleted from the array :");
m[k]=0;
for(j=k;j<num;j++)
{
m[j]=m[j+1];
}
System.out.println();
for(i=0;i<num-1;i++)
{
System.out.println(m[i]);
}
}
} 