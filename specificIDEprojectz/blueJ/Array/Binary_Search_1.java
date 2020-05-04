// Binary Search [Normal Method]
//import java.util.*;
import java.io.*;
public class Binary_Search_1
{
//public static void main(String args[])
public static void main(String args[])throws IOException
{
//Scanner sc=new Scanner(System.in);
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,lb=0,ub=9,mid=0,k=0,ns=0;
int m[]=new int[10];
System.out.println("Enter 10 numbers in ascending order :");
for(i=0;i<10;i++)
{
System.out.print("Enter number "+(i+1)+" :");
//m[i]=sc.nextInt();
m[i]=Integer.parseInt(br.readLine());
}
System.out.print("Enter the number to be searched :");
//ns=sc.nextInt();
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

