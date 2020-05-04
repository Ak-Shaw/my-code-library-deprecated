/*WAP to accept a date and display it in words. Also display if the entered date is a leap year or not
 * 
 * Sample Input  ---> 21-08-2012
 * Sample Output ---> 21st August of 2012
 *                   2012 is a Leap Year
 * Sample Input  ---> 02/05/2013 
 * Sample Output ---> 2nd May of 2013
 *                   2013 is not a Leap Year
 * Sample Input  ---> 23_04/2012
 * Sample Output ---> 23rd April of 2012
 *                   2012 is a Leap Year
 * Sample Input  ---> 24>08?2012
 * Sample Output ---> 24th August of 2012
  *                   2012 is a Leap Year
 * Sample Input  ---> 31-04-2050
 * Sample Output ---> The entered date is Invalid
 *                   Since the Entered month doesn't have the date more than 30
 * Sample Input  ---> 40-10-2055
 * Sample Output ---> The entered date is Invalid
 *                   Since there can't be a date more than 31
 * Sample Input  ---> 23-67-7890
 * Sample Output ---> The entered date is Invalid
 *                   Since there can't be a month more than 12,i.e, December is the last month
 * Sample Input  ---> 29-02-2453
 * Sample Output ---> The entered date is Invalid
 *                   Since the month of February can't have the date more than 28 in a year which is not a Leap Year
 * Sample Input  ---> 30-02-2453
 * Sample Output ---> The entered date is Invalid
 *                   Since the month of February can't have the date more than 29
 */
import java.io.*;
public class Date
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String a,b,d,e,f="";
int i,j,k,l,m,n;l=0;n=0;
char c,h;
System.out.print("Enter a Date:");
a=br.readLine();
h=a.charAt(0);
m=(int)h;
if(m<48||m>57)
{
System.out.println("Unidentified combination of characters");
n++;l++;
}
if(n==0)
{
b=a.substring(0,2);
c=a.charAt(1);
d=a.substring(3,5);
e=a.substring(6);
i=Integer.parseInt(b);
j=Integer.parseInt(d);
k=Integer.parseInt(e);
if(i>31)
{
System.out.println("The entered date is Invalid");
System.out.println("Since there can't be a date more than 31");
l++;
}
if(j>12)
{
System.out.println("The entered date is Invalid");
System.out.println("Since there can't be a month more than 12,i.e, December is the last month");
l++;
}
if(j==2&&i>29)
{
System.out.println("The entered date is Invalid");
System.out.println("Since the month of February can't have the date more than 29");
l++;
}
if(k%4!=0&&j==2&&i>28)
{
System.out.println("The entered date is Invalid");
System.out.println("Since the month of February can't have the date more than 28 in a year which is not a Leap Year");
l++;
}
if(i>30&&(j==4||j==6||j==9||j==11))
{
System.out.println("The entered date is Invalid");
System.out.println("Since the Entered month doesn't have the date more than 30");
l++;
}
String g[]={"January of","February of","March of","April of","May of","June of","July of","August of","September of","October of","November of","December of"};
if(c=='1')
f="st";
else if(c=='2')
f="nd";
else if(c=='3')
f="rd";
else
f="th";
if(i>=11&&i<=19)
f="th";
if(l==0)
{
System.out.println(i+f+" "+g[j-1]+" "+e);
if(k%4==0&&(k%100!=0||k%400==0))
System.out.println(e+" is a Leap Year");
else
System.out.println(e+" is not a Leap Year");
}
}
if(n>0&&l>0)
System.out.println("Sorry! We can't display your date in written form as it is invalid! Please Try Again");
}
}