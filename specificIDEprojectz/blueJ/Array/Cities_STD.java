/*
WAP to accept the names of 10 cities in a single dimension string array 
and their STD codes in another single dimension integer array. 
Search for a name of a city input by the user in the list. If found, 
display "Search successful" and print the name of the city along with 
its STD code, or else display the message "Search unsuccessful, no such 
city in the list". 
                                                     [ICSE 2012]   
 */
import java.io.*;
class Cities_STD 
{
public static void main(String args[])throws IOException
{
BufferedReader ob=new BufferedReader (new InputStreamReader (System.in));
System.out.print("Enter number of cities :");
int n=Integer.parseInt(ob.readLine());
String city[]=new String[n];
int std[]=new int[n];
for(int i=0;i<n;i++)
{
System.out.print("Enter City "+(i+1)+" :");
city[i]=ob.readLine();
System.out.print("Enter STD Code of "+city[i]+" :");
std[i]=Integer.parseInt(ob.readLine());
}
System.out.print("Enter the city to be searched :");
String ele = ob.readLine();
int c=0;
int p;
for(p=0;  p<10; p++)
{
if(city[p] . equals(ele))
{
c=1;
break;
} //end if
}//end for
if(c==1)
{
System.out.println("Search Successful");
System.out.println("City :"+city[p]);
System.out.println("STD :"+std[p]);
}
else
System.out.print("Search Unsuccessful. No such city in the list");
}//end method
}//end class
