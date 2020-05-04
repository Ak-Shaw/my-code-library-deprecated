/*
 * accept a date and display the dates of the corresponding month that correspond to the specific 'day'
 */
import java.io.*;
import java.util.*;
public class corresponding_dates
{
static void main()
{
PrintWriter p=new PrintWriter(System.out,true);
Scanner sc=new Scanner(System.in);
p.printf("date(ddmmyyyy):");
int date=sc.nextInt();
int d=date/1000000;
int m=(date%1000000)/10000;
int y=date%10000;
int l=30;
if(m>7&&m%2==0)
l=31;
if(m<8&&m%2!=0)
l=31;
if(m==2)
if(y%4==0&&y%400!=0)
l=29;
else
l=28;
int t=d%7;
for(int i=0;i<5;i++)
{
int n=7*i+t;
if(n>0&&n<=l)
p.println(n);
}
}
}