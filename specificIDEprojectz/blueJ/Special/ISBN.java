import java.io.*;
class ISBN
{
static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter ISBN :");
String n=br.readLine();
int i=10,j=0,q,s=0;
char c;
if((n.length())!=10)
System.out.println("Invalid");
else
{
while(i>0)
{
c=n.charAt(j);
q=(int)c-48;
if(c=='X')
q=10;
s+=i*q;
i--;
j++;
}
if(s%11==0)
System.out.println("ISBN");
else
System.out.println("Invalid ISBN");
}
}
}