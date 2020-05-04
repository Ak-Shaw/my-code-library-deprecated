import java.io.*;
class string_spacer
{
static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s,q;
int i,l,w=1;
System.out.print("enter string :");
s=br.readLine();
l=s.length();
q="";
for(i=0;i<l;i++)
q+=" "+s.charAt(i);
System.out.println("Spaced string :\n"+q);
}
}