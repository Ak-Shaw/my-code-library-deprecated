/* Accept n number of country names along with its capitaland finally
 * accept a country name and display country name olong with its 
 * capital.
 *            [Bubble Sort And Binary Search Method]
 */
import java.io.*;
public class Country
{
public static void main(String args[])throws IOException
{
BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter number of countries :");
int n=Integer.parseInt(inp.readLine());
String country[]=new String[n];
String capital[]=new String[n];
for(int i=0;i<n;i++)
{
System.out.print("Enter Country Name :");
country[i]=inp.readLine();
System.out.print("Enter Capital of "+country[i]+" :");
capital[i]=inp.readLine();
}
for(int i=0;i<(n-1);i++)
{
for(int k=n-1;k>i;k--)
{
if(country[k].compareTo(country[k-1])<0)
{
String temp1=country[k];
country[k]=country[k-1];
country[k-1]=temp1;
String temp2=capital[k];
capital[k]=capital[k-1];
capital[k-1]=temp2;
}
}
}
int beg=0,end=n-1,mid=(beg+end)/2;
System.out.print("\f");
System.out.print("Enter Search Value :");
String search=inp.readLine();
while(country[mid].equalsIgnoreCase(search)==false&&beg<end)
{
if(country[mid].compareTo(search)>0)
end=mid-1;
else
beg=mid+1;
mid=(beg+end)/2;
}
if(country[mid].equalsIgnoreCase(search)==true)
{
System.out.println("\f");
System.out.println("Your entered country name is "+country[mid]);
System.out.println("Capital of "+country[mid]+" is :"+capital[mid]);
}
else
{
System.out.println("\f");
System.out.println("Sorry!!!!! Search Value not found");
}
}
}
