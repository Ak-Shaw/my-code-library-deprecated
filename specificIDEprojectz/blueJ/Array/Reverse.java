// computer is fun -> fun is computer
import java.util.*;
public class Reverse
{
public static void main()
{
Scanner sc=new Scanner(System.in);
System.out.println("Sentence :");
String s=sc.nextLine()+" ",t="";
String q[]=new String[20];
int i,l=s.length(),j=0;
char c;
for(i=0;i<l;i++)
{
c=s.charAt(i);
if(c!=' ')
t+=c;
else
{
q[j++]=t;
t="";
}
}
System.out.println("Reversed Sentence :\n");
for(i=j-1;i>=0;i--)
System.out.print(q[i]+" ");
}
}