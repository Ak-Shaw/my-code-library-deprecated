/*
 * WAP to accept a date and the respective day of the first 
 * day of the year in order to calculate the respective day
 * of the given date.
 * 
 * Take input for day as follows:
 * 1 for Monday, 2 for Tuesday ...and so on
 * 
 * Sample:

Date :02062015
First Day Of Year :4
It's a Tuesday

 */
import java.util.*;
public class Date_Day
{
public static void main()
{
Scanner sc=new Scanner(System.in);
System.out.print("Date :");
int n=sc.nextInt();
System.out.print("First Day Of Year :");
int q=sc.nextInt();
int z[]={31,28,31,30,31,30,31,31,30,31,30,31},i,s=0,w;
String a[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
int d=n/1000000,m=n%1000000/10000,y=n%10000;
if(y%4==0&&(y%100!=0||y%400==0))
z[1]=29;
for(i=0;i<m-1;i++)
s+=z[i];
s+=d;
w=s%7+q-2;
if(w>6)
w-=7;
System.out.println("It's a "+a[w]);
}
}