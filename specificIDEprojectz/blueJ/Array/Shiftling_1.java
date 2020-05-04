/* 
 * Input  : 5 8 0 3 9 0 7 1 0 2
 * Output : 5 8 3 9 7 1 2 0 0 0
 */
import java.util.*;
public class Shiftling_1
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
for(j=i+1;j<m.length;j++)
{
if(m[i]==0)
{
t=m[i];
m[i]=m[j];
m[j]=t;
}
}
}
System.out.println("Final Order :");
for(i=0;i<n;i++)
System.out.print(m[i]+" ");
System.out.println();
}
}