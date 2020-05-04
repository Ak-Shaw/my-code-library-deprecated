/* find the minimum number of characters to be inserted and maximum 
 * number of characters to be deleted in a string to make it palindrome
 * and do the same
 */
import java.util.*;
public class min_max_palin
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
String p=str;
int l=str.length();
for(i=l-2;i>-1;i--)
{
char c=str.charAt(i);
p+=c;
}
System.out.println("\nNew Palindrome word after insertion and deletion operation : "+p);
int l1=s.length();
int l2=str.length();
int b[]=new int[l2];
int a[]=new int[l2];
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
b[i]=f;
if(i!=l2-1)
a[i]=2;
else
a[i]=1;
}
System.out.println("\nInsertion of characters taken place :\n");
System.out.println("\nCharacter\tQuantity\n\n");
int q;
int ie=0;//insertion elements
int de=0;//deletion elements
for(i=0;i<l2;i++)
{
q=a[i]-b[i];
char c=str.charAt(i);
System.out.println("\t"+c+"\t"+q);
if(q>0)
ie+=q;
else if(q<0)
de+=q;
}
System.out.println("\n\nthe negative values(if any) implies the quantity of characters deleted\n");
System.out.println("Number of characters inserted : "+ie);
System.out.println("Number of characters deleted : "+(-de));
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