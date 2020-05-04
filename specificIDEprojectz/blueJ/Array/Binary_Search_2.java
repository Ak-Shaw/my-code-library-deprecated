// Binary Search [Selection Sort Method]
import java.io.*;
public class Binary_Search_2
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,j,t,lb=0,ub=9,mid=0,k=0,ns=0;
int min;
int m[]=new int[10];
System.out.println("Enter ten numbers :");
for(i=0;i<m.length;i++)
{
m[i]=Integer.parseInt(br.readLine());
}
for(i=0;i<m.length;i++)
{
min=i;
for(j=i+1;j<m.length;j++)
{
if(m[j]<m[min])
min=j;
}
t=m[i];
m[i]=m[min];
m[min]=t;
}
System.out.println("The numbers arranged in ascending order :");
for(i=0;i<m.length;i++)
System.out.println(m[i]);
System.out.print("Enter the number to be searched :");
ns=Integer.parseInt(br.readLine());
while(lb<=ub)
{
mid=(lb+ub)/2;
if(m[mid]<ns)
{
lb=mid+1;
}
if(m[mid]>ns)
{
ub=mid-1;
}
if(m[mid]==ns)
{
k=1;
break;
}
}
if(k==1)
{
System.out.println("The search is successful and the number is found in "+(mid+1)+" position");
}
else
{
System.out.println("The search is successful and the number is not found");
}
}
}
