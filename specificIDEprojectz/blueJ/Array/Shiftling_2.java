/* 
 * Input  : 5 8 0 3 9 0 7 1 0 2
 * Output : 0 0 0 5 8 3 9 7 1 2 
 */
import java.util.*;
public class Shiftling_2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,n,t,j;
System.out.print("Enter number of elements :");
n=sc.nextInt();
int m[]=new int[n];
System.out.println("Enter "+n+" elements :");
for(i=0;i<n;i++)
m[i]=sc.nextInt();
for(i=0;i<m.length;i++)
{
for(j=1;j<m.length;j++)
{
if(m[j]==0)
{
t=m[j];
m[j]=m[j-1];
m[j-1]=t;
}
}
}
System.out.println("Final Order :");
for(i=0;i<n;i++)
System.out.print(m[i]+" ");
System.out.println();
}
}