// Accept n nmes and arrange them according to their length
import java.io.*;
public class Length
{
public static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Quantity :");
int n=Integer.parseInt(br.readLine()),i,j;
String a[]=new String[n],t;
System.out.println("Enter "+n+" names :");
for(i=0;i<n;i++)
a[i]=br.readLine();
for(i=0;i<n;i++)
for(j=0;j<n-1;j++)
if(a[j].length()>a[j+1].length())
{
t=a[j];
a[j]=a[j+1];
a[j+1]=t;
}
for(i=0;i<n;i++)
for(j=0;j<n-1;j++)
if(a[j].length()==a[j+1].length()&&a[j].compareTo(a[j+1])>0)
{
t=a[j];
a[j]=a[j+1];
a[j+1]=t;
}
System.out.println("\nList Of names after sorting length wise :\n");
for(i=0;i<n;i++)
System.out.println(a[i]);
}
}