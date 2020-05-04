// find the minimum number of characters to be inserted in a string to make it palindrome and do the same
// [STRING METHOD]
import java.util.*;
public class min_palin
{
public static void main()
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter a string :");
String s=sc.nextLine();
int len,i,j;
String str,str1="";
char ch,ch1;
str=s;
len=str.length();
for(i=0;i<len;i++)
{
ch=str.charAt(i);
str1=str1+ch;
for(j=i+1;j<len;j++)
{
ch1=str.charAt(j);
if(ch==ch1)
str=str.replace(ch1,' ');
}
}
str="";
for(i=0;i<len;i++)
{
ch=str1.charAt(i);
if(ch!=' ')
str=str+ch;
}
int l1=s.length();
int l2=str.length();
int b[]=new int[l2];
int e=0;
for(i=0;i<l2;i++)
{
char c=str.charAt(i);
int f=0;
for(j=0;j<l1;j++)
{
char c1=s.charAt(j);
if(c==c1)
f++;
}
if(f%2==0)
e++;//even frequencies
b[i]=f;
}
int o=l2-e;//odd frequencies;
int oa[]=new int[o];//odd array integer
char OA[]=new char[o];//odd array character
int ea[]=new int[e];//even array integer
char EA[]=new char[e];//even array character
int eci=0;//even character index
int oci=0;//odd character index
int mof=0;//max odd frequency
int mofi=0;//max odd frequency index
for(i=0;i<l2;i++)
{
//System.out.println(b[i]);
if(b[i]%2==0)
{
ea[eci]=b[i];
EA[eci]=str.charAt(i);
eci++;
}
else
{
if(b[i]>mof)
{
mof=b[i];
mofi=oci;
}
oa[oci]=b[i];
OA[oci]=str.charAt(i);
oci++;
}
}
String p="";
int mp=-1;
if(mof==0)
mp=0;//min palin characters, i.e., min no. of characters required(to be added) for palindrome conversion
if(mp==0)
p="";
else
{
mp=o-1;//min palin characters, i.e., min no. of characters required(to be added) for palindrome conversion
for(j=0;j<mof;j++)
{
p+=OA[mofi];
}
for(i=0;i<o;i++)
{
if(i==mofi)
continue;
int t=oa[i];
t++;
char c=OA[i];
for(j=0;j<t/2;j++)
p=c+p+c;
}
}
for(i=0;i<e;i++)
{
char c=EA[i];
int t=ea[i];
for(j=0;j<t/2;j++)
p=c+p+c;
}
System.out.println("\nString after converting to palindrome : "+p);
System.out.println("\nminimum number of characters inserted in the string to make it palindrome : "+mp);
if(mp>0)
System.out.println("\ncharacters inserted to make the string palindrome :\n\n");
for(i=0;i<o;i++)
if(i!=mofi)
System.out.println(OA[i]);
str=s;
str1="";
len=str.length();
for(i=len-1;i>=0;i--)//for(i=0;i<len;i++)
{
ch=str.charAt(i);
str1=str1+ch;//str1=ch+str1;
}
if(str1.equalsIgnoreCase(str))
System.out.println("\n\nBTW the given string "+str+" was already a palindrome");
}
}