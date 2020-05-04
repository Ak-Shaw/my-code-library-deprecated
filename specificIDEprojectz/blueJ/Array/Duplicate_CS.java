/* WAp to enter n elements in an array. Remove all the
 * consecutive duplicate elements from the array and display 
 * the resultant array in a sorted manner
 */
import java.io.*;
public class Duplicate_CS
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Quantity :");
int n=Integer.parseInt(br.readLine());
int a[]=new int[n],i,j,q;
System.out.println("Integer Elements :");
for(i=0;i<n;i++)
a[i]=Integer.parseInt(br.readLine());
for(i=0;i<n;i++)
{
q=a[i];
for(j=i;j<n-1;j++)
{
if((a[j]==q)&&(q==a[j+1]))
a[j]=0;
}
}
System.out.println("Elements after performing consecutive duplicate elemination process:");
for(i=0;i<n;i++)
{
if(a[i]!=0)
System.out.println(a[i]);
}
for(i=0;i<n-1;i++)
for(j=i+1;j<n;j++)
if(a[i]>a[j])
{
q=a[i];
a[i]=a[j];
a[j]=q;
}
System.out.println("Sorted Elements :");
for(i=0;i<n;i++)
if(a[i]!=0)
System.out.println(a[i]);
}
}