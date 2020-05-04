/* WAP that encodes a word into Piglatin. To translate word into a
 * Piglatin word, convert the word into uppercase and then place the
 * first vowel of the original word as the start of the new word along
 * with the remaining alphabets. The alphabets present before the vowel
 * being shifted towards the end followed by "AY".
 * 
 * Sample Input  ---> London
 * Sample Output ---> The Piglatin form of London : ONDONLAY
 * 
 * Sample input  ---> Olympics
 * Sample Output ---> The Piglatin form of Olympics : OLYMPICSAY
 *                                                           (ICSE 2013)
 */
import java.io.*;
public class Piglatin_2
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int x,y;
String c,d,str;
char b,b1;
System.out.print("Enter a word:");
str=br.readLine();
str=str.toUpperCase();
x=str.length();
System.out.print("The Piglatin form of "+str+" : ");
for(y=0;y<x;y++)
{
b=str.charAt(y);
b1=Character.toUpperCase(b);
if(b1=='A'||b1=='E'||b1=='I'||b1=='O'||b1=='U')
{
break;
}
}
c=str.substring(y,x);
d=str.substring(0,y);
System.out.println(c+d+"AY");
}
}