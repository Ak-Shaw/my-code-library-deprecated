// computer is fun -> fun is computer
import java.util.*;
public class Reverse
{
public static void main()
{
Scanner sc=new Scanner(System.in);
System.out.println("Sentence :");
String s=sc.nextLine()+" ",q="",t="";
int i,l=s.length();
char c;
for(i=0;i<l;i++)
{
c=s.charAt(i);
if(c!=' ')
t+=c;
else
{
q=t+" "+q;
t="";
}
}
System.out.println("Reversed Sentence :\n"+q);
}
}