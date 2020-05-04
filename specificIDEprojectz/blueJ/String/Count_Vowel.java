/* Accept a sentence and count number of each vowel present and also
 *total number of vowels present
 */
import java.io.*;
public class Count_Vowel
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter a Sentence :");
String sent=br.readLine();
int a=0,e=0,i=0,o=0,u=0,v=0;
char b;
int len=sent.length();
for(int j=0;j<len;j++)
{
b=Character.toUpperCase(sent.charAt(j));
if(b=='A')
a++;
if(b=='E')
e++;
if(b=='I')
i++;
if(b=='O')
o++;
if(b=='U')
u++;
}
v=a+e+i+o+u;
System.out.println("The number of vowel a ="+a);
System.out.println("The number of vowel e ="+e);
System.out.println("The number of vowel i ="+i);
System.out.println("The number of vowel o ="+o);
System.out.println("The number of vowel u ="+u);
System.out.println("Total number of vowels present ="+v);
}
}