/*
 * WAP to accept a day number and year and display the 
 * respective date.
 * 
 * Sample :

Day Number :300
Year :2015

27 October 2015

 */
import java.util.*;
public class Day_Date
{
public static void main()
{
Scanner sc=new Scanner(System.in);
System.out.print("Day Number :");
int n=sc.nextInt();
System.out.print("Year :");
int y=sc.nextInt();
int m[]={31,28,31,30,31,30,31,31,30,31,30,31},i,s=0;
if(y%4==0&&(y%100!=0||y%400==0))
m[1]=29;
String a[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
/**
for(i=0;i<12;i++)
{
s+=m[i];
if(s+30>n)
break;
}
if(n<=31)
i--;
else
n-=s;
**/
for(i=0;i<12;i++)
{
s+=m[i];
if(s>n)
break;
}
if(n<32)
{
i=0;
}
else
{
s=s-m[i];
n=n-s;
if(n==0)
{
i--;
n=m[i];
}
}
i--;
if(n==0)
System.out.println("\n"+m[i]+" "+a[i]+" "+y);
else
System.out.println("\n"+n+" "+a[i+1]+" "+y);
}
}