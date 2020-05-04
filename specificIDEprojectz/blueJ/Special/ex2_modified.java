// find the minimum number of characters to be inserted in a string to make it palindrome and do the same
// [ARRAY METHOD]

import java.util.*;

class ex2_modified

{

public static void main()

{

int i,j,c=0,n,n1,k,p1=0,p2=0,f=0,l=0,h=0,m=0,t;

String st1,st,str1="";

char ec[]=new char[50];

char oc[]= new char[50];

char a[]= new char[100];

int ef[]=new int[50];

int of[]=new int[50];

char ch='\0';

Scanner sc=new Scanner(System.in);

System.out.println("enter a word");

st1=sc.nextLine();

st=st1.toUpperCase();

n1=st.length();

for(i=65;i<=90;i++)
{
k=0;
for(j=0;j<n1;j++)
{
ch=st.charAt(j);

if(i==ch)
k++;
}
if(k==0)
continue;
if(k%2!=0)
{
c++;
oc[p1]=(char)i;
of[p1]=k;
p1++;
}
else
{
ec[p2]=(char)i;
ef[p2]=k;
p2++;
}
}
if(c!=0)
{
n=n1+c-1;
m=n/2;
t=(of[0]-1)/2;
l=m-t;
h=m+t;
for(i=l;i<=h;i++)
a[i]=oc[0];
l--;
h++;
for(i=1;i<p1;i++)
{
t=(of[i]+1)/2;
for(j=0;j<t;j++)
a[l--]=a[h++]=oc[i];
}
c--;
}
else
{
n=n1;
l=n/2-1;
h=n/2;
}
for(i=0;i<p2;i++)
{
t=ef[i]/2;
for(j=0;j<t;j++)
a[l--]=a[h++]=ec[i];
}
str1=String.valueOf(a);
System.out.println("\nString after converting to palindrome : "+str1);
System.out.println("\nminimum number of characters inserted in the string to make it palindrome : "+c);
if(c>0)
System.out.println("\ncharacters inserted to make the string palindrome :\n\n");
for(i=1;i<p1;i++)
System.out.println(oc[i]);
String str=st;
String str2="";
int len=str.length();
for(i=len-1;i>=0;i--)
{
ch=str.charAt(i);
str2=str2+ch;
}
if(str2.equalsIgnoreCase(str))
System.out.println("\n\nBTW the given string "+str+" was already a palindrome");
}
}