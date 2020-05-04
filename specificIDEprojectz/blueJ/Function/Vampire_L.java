// Vampire number upto a limit 
import java.util.*;
public class Vampire_L
{
public static void main(String args[])
{
Scanner  sc=new Scanner(System.in);
System.out.print("Enter a Limit :");
int lim=sc.nextInt();
for(int k=1;k<=lim;k++)
{
int num=k;
int flag=1;
for(int i=2;i<num;i++)
{
if(num%i==0)
{
int num1=i;
int num2=num/num1;
if(CheckVamp(num1,num2,num))
{
flag=0;
break;
}
}
}
if(flag==0)
System.out.println(num);
}
}
public static boolean CheckVamp(int num1,int num2,int num)
{
String s=Integer.toString(num1)+Integer.toString(num2);
s=Sort(s);
String s1=Sort(Integer.toString(num));
return(s1.equals(s));
}
public static String Sort(String s)
{
char ch[]=s.toCharArray();
for(int i=0;i<ch.length-1;i++)
{
for(int j=i+1;j<ch.length;j++)
{
if(ch[i]>ch[j])
{
char temp=ch[i];
ch[i]=ch[j];
ch[j]=temp;
}
}
}
String s1="";
for(int i=0;i<ch.length;i++)
s1+=ch[i];
return s1;
}
}