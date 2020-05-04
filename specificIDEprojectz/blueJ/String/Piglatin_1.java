/* WAP to accept a word and display it in Piglatin form.
 * 
 * A word is said to be Piglatin, when it is obtained by framing a new with the first vowel 
 * present in the word with the remaining letters before the first vowel and ends with "ay".
 * 
 * Sample Input  ---> Ayush
 * Sample Output ---> The Piglatin form of Ayush : Ayushay
 * 
 * Sample input  ---> Chalk
 * Sample Output ---> The Piglatin form of Chalk : alkChay
 */
import java.io.*;
public class Piglatin_1
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int x,y;
String c,d,str;
char b,b1;
System.out.print("Enter a word:");
str=br.readLine();
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
System.out.println(c+d+"ay");
}
}