// Binary Search
import java.util.*;
public class BSearch
{
void Search(int a[],int ns)
{
int i,lb=0,ub=9,mid=0,k=0;
while(lb<=ub)
{
mid=(lb+ub)/2;
if(a[mid]<ns)
lb=mid+1;
else
ub=mid-1;
if(a[mid]==ns)
{
k=1;break;
}
}
if(k==1)
System.out.println("Search Successfull and number is present at "+(mid+1)+" postion");
else
System.out.println("Search Unsuccessfull");
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
BSearch ob=new BSearch();
int m[]=new int[10];
int i,s=0;
System.out.println("Enter ten numbers in ascending order :");
for(i=0;i<10;i++)
m[i]=sc.nextInt();
System.out.print("Number to be searched :");
s=sc.nextInt();
ob.Search(m,s);
}
}