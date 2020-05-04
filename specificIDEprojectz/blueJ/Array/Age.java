/* WAP to accept a birth date and a present date to display 
 * the age either in Standard form or approx form.
 *                            In standard form the days, months 
 * and years are counted and in approx form, first the total no.
 * of days are calculated and then the month and Year
 */
import java.io.*;
public class Age
{
public static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String d1,d2;
System.out.print("Birth Day   :");
d1=br.readLine();
System.out.print("Present Day :");
d2=br.readLine();
String a1,b1,c1,a2,b2,c2;
a1=d1.substring(0,2);
b1=d1.substring(3,5);
c1=d1.substring(6);
a2=d2.substring(0,2);
b2=d2.substring(3,5);
c2=d2.substring(6);
int l1,m1,n1,l2,m2,n2;
l1=Integer.parseInt(a1);
m1=Integer.parseInt(b1);
n1=Integer.parseInt(c1);
l2=Integer.parseInt(a2);
m2=Integer.parseInt(b2);
n2=Integer.parseInt(c2);
int n=n2-n1;
int p=m2-m1;
int z[]={31,28,31,30,31,30,31,31,30,31,30,31};
int i,j;
int d=0,w=0,m=0,y=0;
if(p==0&&n==0)
d=l2-l1;
if(n==0&&p!=0)
{
if(n1%4==0&&(n1%100!=0||n1%400==0))
z[1]=29;
d=(z[m1-1]-l1+1)+l2;
m=m2-m1-1;
}
if(n>0)
{
m=12-m1+m2-1;
if(n>1)
y=n-1;
if(n1%4==0&&(n1%100!=0||n1%400==0))
z[1]=29;
else
z[1]=28;
d=(z[m1-1]-l1+1)+l2;
}
System.out.println("Press 1: Standard Form");
System.out.println("Press 2: Approx Form");
System.out.print("Choice :");
int c=Integer.parseInt(br.readLine());
if(c==2)
{
m=0;
y=0;
if(n==0&&p!=0)
{
if(n1%4==0&&(n1%100!=0||n1%400==0))
z[1]=29;
else
z[1]=28;
d=(z[m1-1]-l1+1)+l2;
for(i=m1;i<=m2-2;i++)
d+=z[i];
}
if(n>0)
{
d=(z[m1-1]-l1+1)+l2;
if(n>1)
{
j=n1;
for(i=1;i<=n-1;i++)
{
if(j%4==0&&(j%100!=0||j%400==0))
d+=366;
else
d+=365;
j++;
}
}
if(n1%4==0&&(n1%100!=0||n1%400==0))
z[1]=29;
else
z[1]=28;
for(i=m1;i<12;i++)
d+=z[i];
if(n2%4==0&&(n2%100!=0||n2%400==0))
z[1]=29;
else
z[1]=28;
for(i=0;i<m2-1;i++)
d+=z[i];
}
y=d/365;
d%=365;
m=d/30;
d%=30;
}
if(d>30)
{
d-=30;
m+=1;
if(m>12)
{
m-=12;
y+=1;
}
}
w=d/7;
d%=7;
switch(c)
{
case 1:
System.out.println("\nStandard Form :");
break;
case 2:
System.out.println("\nApprox Form :");
break;
default:
System.out.println("Invalid Option");
}
if(m>12)
{
m-=12;
y+=1;
}
String q1="s ",q2="s ",q3="s ",q4="s ";
if(y<2)
q1=" ";
if(m<2)
q2=" ";
if(w<2)
q3=" ";
if(d<2)
q4=" ";
if(c==1||c==2)
{
if(y>0)
System.out.print(y+" Year"+q1);
if(m>0)
System.out.print(m+" Month"+q2);
if(w>0)
System.out.print(w+" Week"+q3);
if(d>0)
System.out.print(d+" Day"+q4);
System.out.println();
}
}
} 
/**
Sample Input And Output--->
Birth Day   :02-08-1998
Present Day :19-12-2013
Press 1: Standard Form
Press 2: Approx Form
Choice :1

Standard Form :
15 Years 4 Months 2 Weeks 5 Days 

Sample Input And Output--->
Birth Day   :02-08-1998
Present Day :19-12-2013
Press 1: Standard Form
Press 2: Approx Form
Choice :2

Approx Form :
15 Years 4 Months 3 Weeks 2 Days 


 */