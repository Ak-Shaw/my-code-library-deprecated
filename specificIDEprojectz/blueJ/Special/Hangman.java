import java.io.*;
class Hangman
{
static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String a[]={"CAT","SACHIN/TENDULKAR"};
String b[]={"-A-","-A--I-/-E--U--A-"},s,z="";
char c,ch;
int n=2,i,j,q=0;
for(i=0;i<n;i++)
{
while(q<5)
{
System.out.println(b[i]);
System.out.print("character :");
c=(char)(br.read());
s="";
for(j=0;j<b[i].length();j++)
{
ch=a[i].charAt(j);
if(c==ch)
s+=ch;
else
s+=b[i].charAt(j);
}
if(b[i].equals(s))
{
q++;
System.out.println("wrong");
}
else
b[i]=s;
if(a[i].equals(b[i]))
{
System.out.println(b[i]+"\n\ncongo !!");
if(i!=n-1)
{
System.out.println("Time to solve next Puzzle !!");
i++;
}
else
{
System.out.println("The game has ended ");
break;
}
q=0;
}
}
if(q==5)
{
System.out.println("game over");
break;
}
}
}
}