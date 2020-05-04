// Checking a date to be valid

import java.io.*;
public class Date
{
public static void main()throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter date in 8-digit format(ddmmyyyy) :");
int n=Integer.parseInt(br.readLine()),i,j,k,l=0;
i=n/1000000;
j=n/10000-i*100;
k=n%10000;
String a="The entered date is Invalid";
if(i>31)
{
System.out.println(a+"\nSince there can't be a date more than 31");
l++;
}
if(j>12)
{
System.out.println(a+"\nSince there can't be a month more than 12,i.e, December is the last month");
l++;
}
if(j==2&&i>29)
{
System.out.println(a+"\nSince the month of February can't have the date more than 29");
l++;
}
if(k%4!=0&&j==2&&i>28)
{
System.out.println(a+"\nSince the month of February can't have the date more than 28 in a year which is not a Leap Year");
l++;
}
if(i>30&&(j==4||j==6||j==9||j==11))
{
System.out.println(a+"\nSince the Entered month doesn't have the date more than 30");
l++;
}
if(l==0)
System.out.println("Entered date is valid");
}
}
/** 
 * ALGORITHM
 * 
 * step 1: Accept the number n
 * step 2: i=n/1000000; j=n/10000-i*100; k=n%10000;
 * step 3: check for date validity by taking i as day, j as month and k as year
 * by the following conditions :
 * if(i>31)
 * if(j>12)
 * if(j==2&&i>29)
 * if(k%4!=0&&j==2&&i>28)
 * if(i>30&&(j==4||j==6||j==9||j==11))
 * step 4: if these conditions are not satisfied then the date is valid
 */