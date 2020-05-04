//accpet a date and day and display the calendar for the year
import java.io.*;
import java.util.*;
class Calendar_v2
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
p.printf("Press->\n1-> Sunday\n2-> Monday\n3-> Tuesday\n4-> Wednesday\n5-> Thursday\n6-> Friday\n7-> Saturday\n\nday number :");
int day=sc.nextInt();
int i,j,k,b;
for(i=0,p.printf("\f");i<182;p.printf("="),i++);
p.printf("\n%93s",Integer.toString(y));
for(i=0,p.println();i<182;p.printf("="),i++);
String c[][][]=new String[12][7][7];
c[0][0][0]="Sun";
c[0][0][1]="Mon";
c[0][0][2]="Tue";
c[0][0][3]="Wed";
c[0][0][4]="Thu";
c[0][0][5]="Fri";
c[0][0][6]="Sat";
for(i=1;i<12;i++)
{
c[i][0][0]=c[0][0][0];
c[i][0][1]=c[0][0][1];
c[i][0][2]=c[0][0][2];
c[i][0][3]=c[0][0][3];
c[i][0][4]=c[0][0][4];
c[i][0][5]=c[0][0][5];
c[i][0][6]=c[0][0][6];
}
int e[]={31,28,31,30,31,30,31,31,30,31,30,31};
String w[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
if(y%4==0&&y%400!=0)
e[1]=29;
int s=d;
for(i=0;i<m-1;s+=e[i],i++);
int v;
int si=(day-s%7+7)%7;
for(i=0;i<12;i++)
{
v=1;
for(j=1;j<7;j++)
{
for(k=0;k<7;k++)
{
if((k>=si||j>1)&&v<=e[i])
c[i][j][k]=Integer.toString(v++);
if(v>e[i])
{
si=(k+1)%7;
j=k=7;
}
}
}
}
String z=" ",q;
for(i=0;i<12;i+=3)
{
p.printf("\n");
for(j=0;j<3;j++)
{
q=w[i+j];
for(b=0;b<(9-w[i+j].length())/2;q=" "+q+" ",b++);
p.printf("%30s%35s",q,z);
}
p.printf("\n");
for(j=0,z="";j<7;p.println(z),z="",j++)
for(b=0;b<3;z+="\t",b++)
for(k=0;k<7;k++)
{
if(c[i+b][j][k]==null)
z+="X\t";
else
z+=c[i+b][j][k]+"\t";
}
}
}
}