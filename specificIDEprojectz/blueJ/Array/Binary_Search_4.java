// Binary Search [Bubble Sort Method]
import java.io.*;
public class Binary_Search_4
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,j,t,lb=0,ub=9,mid=0,k=0,ns=0;
int m[]=new int[10];
System.out.println("Enter ten numbers one by one :");
for(i=0;i<m.length;i++)
{
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
System.out.print("Enter the number to be searched :");
ns=Integer.parseInt(br.readLine());
while(lb<=ub)
{
mid=(lb+ub)/2;
if(m[mid]>ns)
{
lb=mid+1;
}
if(m[mid]<ns)
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


