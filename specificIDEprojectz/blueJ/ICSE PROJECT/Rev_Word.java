//WAP to accept a sentence and reverse each of its words using function
import java.io.*;
public class Rev_Word
{
int i,l;
String s,s1="",s2="";
char c;
void input()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a sentence :");
s=br.readLine();
}
void reverse()
{
s=s+" ";
l=s.length();
for(i=0;i<l;i++)
{
c=s.charAt(i);
if(c==' ')
{
if(s2=="")
s2+=s1;
else
s2=s2+" "+s1;
s1="";
}
else
s1=c+s1;
}
}
void display()
{
System.out.println("Sentence with each of it's words reversed :");
System.out.println(s2);
}
public static void main(String args[])throws IOException
{
Rev_Word ob=new Rev_Word();
ob.input();
ob.reverse();
ob.display();
}
}