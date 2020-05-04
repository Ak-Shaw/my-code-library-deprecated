//accpet a date and day and display the calendar for the month
import java.io.*;
import java.util.*;
class CalendarM
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
p.printf("Press->\n1-> Sunday\n2-> Monday\n3-> Tuesday\n4-> Wednesday\n5-> Thursday\n6-> Friday\n7-> Saturday\n\nday number :");
int day=sc.nextInt();
String c[][]=new String[7][7];
c[0][0]="Sun";
c[0][1]="Mon";
c[0][2]="Tue";
c[0][3]="Wed";
c[0][4]="Thu";
c[0][5]="Fri";
c[0][6]="Sat";
int i,j;
int si=(day-d%7+7)%7;
int v=1;
for(i=1;i<7;i++)
{
for(j=0;j<7;j++)
{
if((j>=si||i>1)&&v<=l)
c[i][j]=Integer.toString(v++);
}
}
p.println("\n\nCalendar for given month is as follows :\n\n");
for(i=0;i<7;p.println(),i++)
for(j=0;j<7;j++)
if(c[i][j]==null)
p.printf("X\t");
else
p.printf("%s\t",c[i][j]);
}
}