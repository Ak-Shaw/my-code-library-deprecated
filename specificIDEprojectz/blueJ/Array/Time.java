/*
 * WAP to accept a standard time and display it in words.
 */
import java.util.*;
public class Time
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Time :");
String t=sc.nextLine();
int h=Integer.parseInt(t.substring(0,2));
int m=Integer.parseInt(t.substring(3));
String a[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
String b[]={"Ten","Twenty","Thirty","Forty","Fifty"};
String c[]={"Eleven","Twelve","Thirteen","Fourteen","","Sixteen","Seventeen","Eighteen","Nineteen"};
String d[]={"Quarter","Half","Past","To"};
int n,p=0;
if(m>60)
{
m-=60;
h++;
}
if(m<45)
n=2;
else
n=3;
if(m==30)
p=1;
if(m==45||m==15)
p=0;
if(m>45)
{
m=60-m;
h++;
}
if(h>=24)
h=h-24;
String h1="",m1="";
if(h>=0&&h<=9)
h1=a[h];
else if(h>=11&&h<=19)
h1=c[(h%10)-1];
else if(h%10==0)
h1=b[(h/10)-1];
else if(h>=20&&h%10!=0)
{
h1=b[(h/10)-1];
h1+=" "+a[h%10];
}
if(m>=0&&m<=9)
m1=a[m];
else if(m>=11&&m<=19)
m1=c[(m%10)-1];
else if(m%10==0)
m1=b[(m/10)-1];
else if(m>=20&&m%10!=0)
{
m1=b[(m/10)-1];
m1+=" "+a[m%10];
}
if(m==0)
System.out.println(h1+" Hours");
else if(m%15==0)
System.out.println(d[p]+" "+d[n]+" "+h1+" Hours");
else
System.out.println(m1+" Minutes "+d[n]+" "+h1+" Hours");
}
}