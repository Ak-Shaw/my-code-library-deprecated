// Linear Search
//[Integer method]
import java.util.*;
public class Linear_Search
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,k=0,ns;
int m[]=new int[10];
System.out.println("Enter Ten Numbers :");
for(i=0;i<10;i++)
{
System.out.print("Enter number "+(i+1)+" :");
m[i]=sc.nextInt();
}
System.out.print("Enter the number to be searched :");
ns=sc.nextInt();
System.out.println("The search is successful");
for(i=0;i<10;i++)
{
if(m[i]==ns)
{
k=1;
System.out.println("The number is found at "+(i+1)+" position");
}
}
if(k!=1)//if(k==0)
{
System.out.println("The number is not found");
}
}
}