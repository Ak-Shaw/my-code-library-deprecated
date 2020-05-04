// Linear Search
import java.util.*;
public class LSearch
{
void Search(int a[],int ns)
{
int k=0;
for(int i=0;i<10;i++)
{
if(a[i]==ns)
k=1;
}
if(k==1)
System.out.println("Search Successful");
else
System.out.println("Search UnSuccessfull");
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,s;
LSearch ob=new LSearch();
int m[]=new int[10];
System.out.println("Enter ten numbers :");
for(i=0;i<10;i++)
m[i]=sc.nextInt();
System.out.print("Number to be Searched :");
s=sc.nextInt();
ob.Search(m,s);
}
}