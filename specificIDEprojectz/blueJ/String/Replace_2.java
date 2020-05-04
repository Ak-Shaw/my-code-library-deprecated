/* Accept the sentence January 26 is the Republic day of India and 
 * replace the word January to August, 26 to 15 and Republic to
 * Independence
 */
import java.util.*;
public class Replace_2
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
if(t.equalsIgnoreCase("January")==true)
t="August";
if(t.compareTo("26")==0)
t="15";
if(t.equalsIgnoreCase("Republic")==true)
t="Independence";
q+=t+" ";
t="";
}
}
System.out.println("Swapped Sentence :\n"+q);
}
}


