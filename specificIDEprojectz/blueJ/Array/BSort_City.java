/*
Define a class and store the given city names in a single dimensional 
array. Sort these names in alphabetical order using the Bubble Sort 
technique only.  
INPUT     :          Delhi,Bangalore,Agra, Mumbai,Calcutta
OUTPUT    :          Agra,Bangalore,Calcutta,Delhi,Mumbai
                                                       [ICSE 2008]
*/
import java.io.*;
public class BSort_City
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int i,j=0,n;
String t;
System.out.print("Enter the number of Cities :");
n=Integer.parseInt(br.readLine());
String m[]=new String[n];
System.out.println("Enter "+n+" Cities :");
for(i=0;i<m.length;i++)
m[i]=br.readLine();
for(i=0;i<m.length-1;i++)
{
for(j=i+1;j<m.length;j++)
{
if(m[i].compareTo(m[j])>0)
{
t=m[i];
m[i]=m[j];
m[j]=t;
}
}
}
System.out.println("\fThe Cities arranged in ascending order are :");
for(i=0;i<m.length;i++)
System.out.println(m[i]);
}
}
