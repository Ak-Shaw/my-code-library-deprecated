import java.io.*;
import java.util.*;
public class Binary_Search_5
{
public static void main()
{
PrintWriter p=new PrintWriter(System.out,true);
Scanner sc=new Scanner(System.in);
p.printf("quantity :");
int n=sc.nextInt(),i,j,lb,ub,m=0,q,r,a[]=new int[n],s,k=0;
for(p.printf("enter %d elements :\n\n",n),i=0;i<n;a[i]=sc.nextInt(),i++);//n integer elements input statement
//start of bubble sort
for(i=0;i<n-1;i++)
for(j=0;j<n-1-i;q=a[j]>a[j+1]?a[j+1]:a[j],r=a[j]>a[j+1]?a[j]:a[j+1],a[j]=q,a[j+1]=r,j++);
//end of bubble sort

for(p.println("\n\nsorted elements are as follows:\n\n"),i=0;i<n;p.println(a[i]),i++);//n integer elements output statement

p.printf("\n\nsearch element :");
s=sc.nextInt();
for(lb=0,ub=n-1;lb<=ub;m=(lb+ub)/2,lb=a[m]<s?m+1:lb,ub=a[m]>s?m-1:ub,k=a[m]==s?1:0,lb=k==1?ub+1:lb);//Binary Search
if(k==1)
p.println("element found at position "+(m+1)+" of sorted list");
else
p.println("element not present");
}
}