/*
 * WAP to input an array of n words. Remove duplicate words and shift the other 
 * words to their location repectively and then print the resultant array.
 *     For Example,
 *                  a[]={"Cup","Jug","cup","Bowl"};
 *                  a[]={"Cup","Jug","","Bowl"};
 *                  a[]={"Cup","Jug","Bowl",""};
 */
import java.io.*;
public class Duplicate_3
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Quantity :");
int n=Integer.parseInt(br.readLine());
int i,j,k;
String a[]=new String[n+1];
System.out.println("Enter "+n+" words :");
for(i=0;i<n;i++)
a[i]=br.readLine();
a[n]="";
for(k=0;k<n;k++)
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i].equalsIgnoreCase(a[j])==true)
a[j]="";
if(a[j]=="")
{
a[j]=a[j+1];
a[j+1]="";
}
}
}
System.out.println("Array after performing Duplicate-Removal-Shift Operation :");
for(i=0;i<n;i++)
System.out.println(a[i]);
}
}